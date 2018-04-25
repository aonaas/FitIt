package uk.abdoul.co.fitit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by abdoul on 21/11/2017.
 */

public class Splash extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView iv = (ImageView) findViewById(R.id.imageView);

        final Animation anin = AnimationUtils.loadAnimation(getBaseContext(), R.anim.shake_long);
        final Animation anin2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.shake);

        iv.startAnimation(anin);
        anin.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(anin2);
                finish();
               /* if(GetUser.readFile(GetUser.logUserName,Splash.this).toString()==""){

                    Intent i = new Intent(Splash.this, Slide_Panel.class);
                    startActivity(i);
                }else{

                    Intent i = new Intent(Splash.this, HomeActivity.class);
                    startActivity(i);
                }*/

              Intent i = new Intent(Splash.this, HomeActivity.class);
              // Intent i = new Intent(Splash.this, Main.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }


}
