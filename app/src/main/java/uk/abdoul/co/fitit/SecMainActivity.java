package uk.abdoul.co.fitit;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;

import uk.abdoul.co.fitit.autocomplete.PlaceArrayAdapter;

public class SecMainActivity extends AppCompatActivity implements  GoogleApiClient.OnConnectionFailedListener, GoogleApiClient
        .ConnectionCallbacks, AdapterView.OnItemClickListener, ResultCallback<PlaceBuffer>, Mapsearch,View.OnClickListener  {

    private final String NAV_FRAGMENT = "NavFragment";
    private BottomNavigationView navigation;
    private final String TAG = "MainActivity";
    private String lastDescription;
    private LatLng placeLatLng;
    private View goIcon;
    double longitude;
    private int PROXIMITY_RADIUS = 10000;
    GoogleApiClient mGoogleApiClient;
    Location mLastLocation;
    Marker mCurrLocationMarker;
    LocationRequest mLocationRequest;
    GoogleMap mMap;
    private GoogleApiClient googleApiClient;
    private PlaceArrayAdapter placeArrayAdapter;
    private static final int GOOGLE_API_CLIENT_ID = 0;
    private static final LatLngBounds BOUNDS_NIGERIA = new LatLngBounds(
            new LatLng(4.182100, 2.676932), new LatLng(13.885645, 14.677982));
    private LatLng latestLatLng;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_map:
                    fragment = new HomeFragment();
                    break;
            }
            invalidateOptionsMenu();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment, NAV_FRAGMENT);
            fragmentTransaction.commit();
            return true;
        }

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_activity_main);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigation = findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mOnNavigationItemSelectedListener.onNavigationItemSelected(navigation.getMenu().findItem(R.id.navigation_map));
    }




    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(this, R.string.error_getting_location, Toast.LENGTH_SHORT).show();
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
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        PlaceArrayAdapter.PlaceAutocomplete autocomplete = placeArrayAdapter.getItem(position);
        String placeId = String.valueOf(autocomplete.placeId);
        PendingResult<PlaceBuffer> pendingResult = Places.GeoDataApi.getPlaceById(googleApiClient, placeId);
        pendingResult.setResultCallback(this);

        lastDescription = String.valueOf(autocomplete.description);

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
            Toast.makeText(this, R.string.address_not_valid, Toast.LENGTH_SHORT).show();
        }

        places.release();
    }

    @Override
    public void onAddressChanged(String address) {
        View view = getCurrentFocus();
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        Fragment fragment = getSupportFragmentManager().findFragmentByTag(NAV_FRAGMENT);
        if (fragment instanceof HomeFragment) {
            HomeFragment homeFragment = (HomeFragment) fragment;
            homeFragment.setLocationFromAddress(address);
        }
    }

    @Override
    public void onClick(View view) {

    }

}
