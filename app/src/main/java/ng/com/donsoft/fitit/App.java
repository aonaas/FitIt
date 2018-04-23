package ng.com.donsoft.fitit;

import android.app.Application;
import android.content.Context;

/**
 * Created by Loisg on 10/11/2017 at 12:41.
 */

public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }


    public static Context getContext() {
        return context;
    }
}
