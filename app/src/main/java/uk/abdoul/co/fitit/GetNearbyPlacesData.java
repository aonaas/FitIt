package uk.abdoul.co.fitit;

/**
 * Created by Loisg on 03/11/2017.
 */

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.List;

public class GetNearbyPlacesData extends AsyncTask<Object, String, String>{

    String googlePlacesData;
    GoogleMap mMap;
    String url;

    @Override
    protected String doInBackground(Object... params) {
        try {
            Log.d("GetNearbyPlacesData", "doInBackground entered");
           mMap = (GoogleMap) params[0];
            url = (String) params[1];
            DownloadUrl downloadUrl = new DownloadUrl();
            googlePlacesData = downloadUrl.readUrl(url);
            Log.d("GooglePlacesReadTask", "doInBackground Exit");
        } catch (Exception e) {
            Log.d("GooglePlacesReadTask", e.toString());
        }
        return googlePlacesData;
    }

    @Override
    protected void onPostExecute(String result) {
        Log.d("GooglePlacesReadTask", "onPostExecute Entered");
        List<HashMap<String, String>> nearbyPlacesList = null;
        DataParser dataParser = new DataParser();
        if (!TextUtils.isEmpty(result)) {
            nearbyPlacesList = dataParser.parse(result);
            ShowNearbyPlaces(nearbyPlacesList);
            Log.d("GooglePlacesReadTask", "onPostExecute Exit");
        } else {
            Toast.makeText(App.getContext(), "Failed getting nearby restaurants", Toast.LENGTH_SHORT).show();
            Log.e("GooglePlacesReadTask", "onPostExecute: Result is null");
        }

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Toast.makeText(App.getContext(), "Getting nearby gym", Toast.LENGTH_SHORT).show();
    }
    private void ShowNearbyPlaces(List<HashMap<String, String>> nearbyPlacesList) {
        Log.d(" ShowNearbyPlaces", "ShowNearbyPlaces: " + nearbyPlacesList.size());
        for (int i = 0; i < nearbyPlacesList.size(); i++) {
            Log.d("onPostExecute","Entered into showing locations");
            MarkerOptions markerOptions = new MarkerOptions();
            HashMap<String, String> googlePlace = nearbyPlacesList.get(i);
            double lat = Double.parseDouble(googlePlace.get("lat"));
            double lng = Double.parseDouble(googlePlace.get("lng"));
            String placeName = googlePlace.get("place_name");
            String vicinity = googlePlace.get("vicinity");
            LatLng latLng = new LatLng(lat, lng);
            markerOptions.position(latLng);
            markerOptions.title(placeName + " : " + vicinity);
            final BitmapDescriptor bitmapDescriptor = getBitmapDescriptor(R.drawable.ic_gym);
            Log.w("showNEARBY", "ShowNearbyPlaces: icon = " + bitmapDescriptor);
            markerOptions.icon(bitmapDescriptor);
            mMap.addMarker(markerOptions);
            //move map camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(11));
        }
    }
    private BitmapDescriptor getBitmapDescriptor(int id) {
        Log.d("Get Nearby Places", "getBitmapDescriptor: " + App.getContext());

        Drawable vectorDrawable = ContextCompat.getDrawable(App.getContext(), id);
        int h = Utils.dpToPx(25);
        int w = Utils.dpToPx(25);
        vectorDrawable.setBounds(0, 0, w, h);
        Bitmap bm = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bm);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bm);
    }
}
