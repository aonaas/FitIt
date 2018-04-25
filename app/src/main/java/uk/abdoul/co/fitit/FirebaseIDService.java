package uk.abdoul.co.fitit;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseIDService extends FirebaseInstanceIdService {

    private static final String TAG = "Fitit Mobile Id Service";

    @Override
    public void onTokenRefresh(){

        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refresh Token: " + refreshToken);

        sendRegistrationToServer(refreshToken);
    }

    private void sendRegistrationToServer(String token){

    }



}
