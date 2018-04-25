package uk.abdoul.co.fitit;

/**
 * Created by Loisg on 03/11/2017.
 */
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadUrl {
    private  final String TAG = "DownloadUrl";
    public String readUrl(String strUrl) throws IOException {
        Log.i(TAG, "readUrl: " + strUrl);
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try {

            URL url = new URL(strUrl);

            // Creating an http connection to communicate with url
            urlConnection = (HttpURLConnection) url.openConnection();

            // Connecting to url
            urlConnection.connect();

            // Reading data from url
            iStream = urlConnection.getInputStream();

            Log.i(TAG, "readUrl: brfotr buffered reader");
            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));

            StringBuffer sb = new StringBuffer();

            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            data = sb.toString();
            Log.w("downloadUrl", data.toString());
            br.close();

        } catch (Exception e) {
            Log.d("Exception", e.toString());
        } finally {
            iStream.close();
            urlConnection.disconnect();
        }
        Log.d(TAG, "readUrl: Returning");
        return data;
    }
}
