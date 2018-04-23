package ng.com.donsoft.fitit;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;

public class FititNotifica extends Service {
    public FititNotifica() {
    }

    @Override
    public IBinder onBind(Intent intent) {

       NotificationManager mNotificationManager = (NotificationManager)
                getSystemService(Context.NOTIFICATION_SERVICE);

        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                intent, PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.logo20)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.logo20))
                        .setContentTitle("Fitit Mobile App")
                        .setDefaults(Notification.DEFAULT_SOUND)
                        .setStyle(new NotificationCompat.BigTextStyle()
                                .bigText("Fitit By Abdoul"))
                        .setContentText("Welcome to FitIt mobile app developed by Abdoul")
                        .setPriority(Notification.PRIORITY_MAX);

        mBuilder.setContentIntent(contentIntent);
        mNotificationManager.notify((int)1, mBuilder.build());

        return  new Binder();

    }
}
