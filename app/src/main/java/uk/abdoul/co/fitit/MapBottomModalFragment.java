package uk.abdoul.co.fitit;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

import uk.abdoul.co.fitit.autocomplete.PlaceArrayAdapter;
import uk.abdoul.co.fitit.search.DelayAutoCompleteTextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapBottomModalFragment extends BottomSheetDialogFragment implements AdapterView.OnItemClickListener, ResultCallback<PlaceBuffer>,
        GoogleApiClient.OnConnectionFailedListener, GoogleApiClient.ConnectionCallbacks, View.OnClickListener{

    private Mapsearch mapsearch = mapsearchCallbacks;
    private final String TAG = "HomeFragment";
    private View btn_cancel;
    private LatLng placeLatLng;
    private String lastDescription;
    GoogleApiClient mGoogleApiClient;
    private View goIcon;
    private DelayAutoCompleteTextView autoCompleteTextView;
    private GoogleApiClient googleApiClient;
    private PlaceArrayAdapter placeArrayAdapter;
    private static final int GOOGLE_API_CLIENT_ID = 0;
    private static final LatLngBounds BOUNDS_GLOBE = new LatLngBounds(
            new LatLng(-84.9, 180),           // top left corner of map
            new LatLng(84.9, -180)   );



    public MapBottomModalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map_bottom_modal, container, false);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == goIcon.getId()) {
            if (TextUtils.isEmpty(autoCompleteTextView.getText())) {
                Toast.makeText(getActivity(),"Enter address", Toast.LENGTH_SHORT).show();
            } else {
                mapsearch.onAddressChanged(lastDescription);
            }

            dismissAllowingStateLoss();
        } else if (view.getId() == btn_cancel.getId()) {
            dismissAllowingStateLoss();
        }
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        autoCompleteTextView=view.findViewById(R.id.search_editext);

        goIcon = view.findViewById(R.id.go_icon);
        goIcon.setOnClickListener(this);

        btn_cancel = view.findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);

        setupAutoCompleteTextViews(view);
    }
    private static Mapsearch mapsearchCallbacks = new Mapsearch() {
        @Override
        public void onAddressChanged(String address) {

        }
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mapsearch = (Mapsearch) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement Mapsearch");
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        PlaceArrayAdapter.PlaceAutocomplete autocomplete = placeArrayAdapter.getItem(position);
        String placeId = String.valueOf(autocomplete.placeId);
        PendingResult<PlaceBuffer> pendingResult = Places.GeoDataApi.getPlaceById(googleApiClient, placeId);
        pendingResult.setResultCallback((ResultCallback<? super PlaceBuffer>) this);


        lastDescription = String.valueOf(autocomplete.description);

    }
    private void setupAutoCompleteTextViews(View view) {
        googleApiClient = new GoogleApiClient.Builder(getActivity())
                .addApi(Places.GEO_DATA_API)
                .enableAutoManage(getActivity(), GOOGLE_API_CLIENT_ID, this)
                .addConnectionCallbacks(this)
                .build();
        googleApiClient.connect();
        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setOnItemClickListener(this);
        autoCompleteTextView.setLoadingIndicator(view.findViewById(R.id.progress_bar));
        autoCompleteTextView.setAddButton(view.findViewById(R.id.go_icon));
        goIcon.setVisibility(View.VISIBLE);
        AutocompleteFilter filter = new AutocompleteFilter.Builder()
                .setCountry("UK")
                .setTypeFilter(AutocompleteFilter.TYPE_FILTER_NONE).build();

        placeArrayAdapter = new PlaceArrayAdapter(getActivity(), R.layout.location_list_item, BOUNDS_GLOBE, filter);
        autoCompleteTextView.setAdapter(placeArrayAdapter);

    }

    @Override
    public void onResult(@NonNull PlaceBuffer places) {
        if (!places.getStatus().isSuccess()) {
            return;
        }

        if (places.getCount() > 0) {
            Place place = places.get(0);
            placeLatLng = place.getLatLng();
        } else {
            Toast.makeText(getActivity(), R.string.address_not_valid, Toast.LENGTH_SHORT).show();
        }

        places.release();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(getActivity(), R.string.error_getting_location, Toast.LENGTH_SHORT).show();
        Log.w("SearchActivity", "onConnectionFailed: " + connectionResult.getErrorMessage());
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        placeArrayAdapter.setGoogleApiClient(googleApiClient);
    }

    @Override
    public void onConnectionSuspended(int i) {
        placeArrayAdapter.setGoogleApiClient(null);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        googleApiClient.stopAutoManage(getActivity());
        googleApiClient.disconnect();
    }
}
