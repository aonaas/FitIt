package uk.abdoul.co.fitit.autocomplete;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 */

public class PlaceArrayAdapter extends ArrayAdapter<PlaceArrayAdapter.PlaceAutocomplete> implements Filterable {

    private GoogleApiClient googleApiClient;
    private AutocompleteFilter filter;
    private LatLngBounds bounds;
    private List<PlaceAutocomplete> autocompleteList;
    private final String TAG = "Autocomplete";

    public PlaceArrayAdapter(@NonNull Context context, int resource, LatLngBounds bounds, AutocompleteFilter filter) {
        super(context, resource);
        this.bounds = bounds;
        this.filter = filter;
    }

    public void setGoogleApiClient(GoogleApiClient googleApiClient) {
        if (googleApiClient == null || !googleApiClient.isConnected()) {
            this.googleApiClient = null;
        } else {
            this.googleApiClient = googleApiClient;
        }
    }

    @Override
    public int getCount() {
        return autocompleteList.size();
    }

    @Nullable
    @Override
    public PlaceAutocomplete getItem(int position) {
        return autocompleteList.get(position);
    }

    @NonNull
    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                FilterResults results = new FilterResults();
                if (charSequence != null) {
                    // Query the autocomplete API for the entered constraint
                    autocompleteList = getPredictions(charSequence);
                    if (autocompleteList != null){
                        results.values = autocompleteList;
                        results.count = autocompleteList.size();
                    }

                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                if (filterResults != null && filterResults.count > 0) {
                    // The API returned at least one result, update the data.
                    notifyDataSetChanged();
                } else {
                    // The API did not return any results, invalidate the data set.
                    notifyDataSetInvalidated();
                }
            }
        };
        return filter;
    }

    private List<PlaceAutocomplete> getPredictions(CharSequence charSequence) {
        if (googleApiClient == null) {
            return null;
        }

        PendingResult<AutocompletePredictionBuffer> result = Places.GeoDataApi.getAutocompletePredictions(googleApiClient, charSequence
                .toString(), bounds, filter);
        // Wait for predictions, set the timeout.
        AutocompletePredictionBuffer predictionBuffer = result.await(60, TimeUnit.SECONDS);
        Status status = predictionBuffer.getStatus();
        Log.w("Autocomplete", "getPredictions: " + status);
        if (!status.isSuccess()) {
            Toast.makeText(getContext(), "Error getting location data", Toast.LENGTH_SHORT).show();
            predictionBuffer.release();
            return null;
        }

        Iterator<AutocompletePrediction> iterator = predictionBuffer.iterator();
        ArrayList<PlaceAutocomplete> arrayList = new ArrayList<>(predictionBuffer.getCount());
        while (iterator.hasNext()) {
            AutocompletePrediction prediction = iterator.next();
            arrayList.add(new PlaceAutocomplete(prediction.getPlaceId(), prediction.getFullText(null)));
        }

        // Buffer release
        predictionBuffer.release();
        return arrayList;
    }

    public class PlaceAutocomplete {

        public CharSequence placeId;
        public CharSequence description;

        PlaceAutocomplete(CharSequence placeId, CharSequence description) {
            this.placeId = placeId;
            this.description = description;
        }

        @Override
        public String toString() {
            return description.toString();
        }
    }
}
