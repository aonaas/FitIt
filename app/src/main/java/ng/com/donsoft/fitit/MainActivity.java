package ng.com.donsoft.fitit;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.File;

import ng.com.donsoft.fitit.Grid.Exercise_Main;
import ng.com.donsoft.fitit.calendar.CalendarViewActivity;
import ng.com.donsoft.fitit.firebase.LoginActivity;
import ng.com.donsoft.fitit.firebase.Main;
import ng.com.donsoft.fitit.fragment.LibraryFragment;
import ng.com.donsoft.fitit.fragment.Workout_fragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private FragmentManager fragmentManager;
    private Fragment fragment = null;
    private ProgressBar progressBar;
    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;
    TextView profile_email;
    ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //get firebase auth instance
        auth = FirebaseAuth.getInstance();


        //get current user
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();
                }

            }
        };




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                       // .setAction("Action", null).show();

                Intent intent= new Intent(MainActivity.this,Main.class);
                 startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



        LinearLayout linearLayout1=(LinearLayout)findViewById(R.id.ll1);
       LinearLayout linearLayout2 =(LinearLayout)findViewById(R.id.ll2);
        LinearLayout linearLayout3 =(LinearLayout)findViewById(R.id.ll3);
       LinearLayout linearLayout4 =(LinearLayout)findViewById(R.id.ll4);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                fragmentManager = getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragment = new LibraryFragment();
                fragmentTransaction.replace(R.id.main_container_wrapper, fragment);
                fragmentTransaction.commit();

            }
        });



        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);

            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modifySettings=new Intent(MainActivity.this,SettingsActivity2.class);
                startActivity(modifySettings);

            }
        });


        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bmical=new Intent(MainActivity.this,BMI_Calculator.class);
                startActivity(bmical);
            }
        });




        //adding preference
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);

        StringBuilder builder = new StringBuilder();
        builder.append( sharedPrefs.getString("full_name", ""));
      //  builder.append("\n" + "Email Address:\t" + sharedPrefs.getString("email_address", "No EMail Address Provided"));

        profile_email =(TextView)headerView.findViewById(R.id.nav_profile_email);
        profile = (ImageView)headerView.findViewById(R.id.image_profile);


        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            // Check if user's email is verified
            boolean emailVerified = user.isEmailVerified();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            String uid = user.getUid();
           // Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
             profile_email.setText(email + builder.toString());

            //if (photoUrl !=null) profile.setImageURI(photoUrl);
        }

        if(builder.toString()!="")
        profile_email.setText(builder.toString());

}
    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
           // super.onBackPressed();
            if (exit) {
                finish(); // finish activity
                System.exit(0);
            } else {
                Toast.makeText(this, "Press Back again to Exit.",
                        Toast.LENGTH_SHORT).show();
                exit = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        exit = false;
                    }
                }, 3 * 1000);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            signOut();
            finish();
           // Intent intent= new Intent(MainActivity.this,LoginActivity.class);
         //   startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_home) {
            Intent intent= new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_logs) {
            /*fragmentManager = getSupportFragmentManager();
            final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragment = new Logs();
            fragmentTransaction.replace(R.id.main_container_wrapper, fragment);
            fragmentTransaction.commit();*/
            Intent intent= new Intent(MainActivity.this,CalendarViewActivity.class);
            startActivity(intent);

        }  else if (id == R.id.nav_exercise) {


            fragmentManager = getSupportFragmentManager();
            final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragment = new  Exercise_Main();
            fragmentTransaction.replace(R.id.main_container_wrapper, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_share) {
            new ShareButton().Show_Dialog(this,"Share with one of these Options");
        }
        else if (id == R.id.nav_Settings) {
            Intent modifySettings=new Intent(MainActivity.this,SettingsActivity2.class);
            startActivity(modifySettings);
        }
        else if (id == R.id.nav_workout) {

            fragmentManager = getSupportFragmentManager();
            final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragment = new Workout_fragment();
            fragmentTransaction.replace(R.id.main_container_wrapper, fragment);
            fragmentTransaction.commit();
        }
    else if (id == R.id.nav_logout) {
            signOut();
            Intent intent= new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);

    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //sign out method
    public void signOut() {
        auth.signOut();
    }




//    private void shareApplication() {
//        ApplicationInfo app = getApplicationContext().getApplicationInfo();
//        String filePath = app.sourceDir;
//
//        Intent intent = new Intent(Intent.ACTION_SEND);
//
//        // MIME of .apk is "application/vnd.android.package-archive".
//        // but Bluetooth does not accept this. Let's use "*/*" instead.
//        intent.setType("*/*");
//
//        // Append file and send Intent
//        File originalApk = new File(filePath);
//
//        try {
//            //Make new directory in new location
//            File tempFile = new File(getExternalCacheDir() + "/ExtractedApk");
//            //If directory doesn't exists create new
//            if (!tempFile.isDirectory())
//                if (!tempFile.mkdirs())
//                    return;
//            //Get application's name and convert to lowercase
//            tempFile = new File(tempFile.getPath() + "/" + getString(app.labelRes).replace(" ","").toLowerCase() + ".apk");
//            //If file doesn't exists create new
//            if (!tempFile.exists()) {
//                if (!tempFile.createNewFile()) {
//                    return;
//                }
//            }
//            //Copy file to new location
//            InputStream in = new FileInputStream(originalApk);
//            OutputStream out = new FileOutputStream(tempFile);
//
//            byte[] buf = new byte[1024];
//            int len;
//            while ((len = in.read(buf)) > 0) {
//                out.write(buf, 0, len);
//            }
//            in.close();
//            out.close();
//            System.out.println("File copied.");
//            //Open share dialog
//            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
//            startActivity(Intent.createChooser(intent, "Share app via"));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



    //share activities

    public class ShareButton {
        Dialog MyDialog;
        Button share_offline,share_online,cancel;
        TextView info;
        public void Show_Dialog(Activity activity, String msg){

            final Dialog  MyDialog = new Dialog(activity);
            MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            MyDialog.setCancelable(false);
            MyDialog.setContentView(R.layout.share);
            MyDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


            info=(TextView)MyDialog.findViewById(R.id.share_info);
            info.setText(msg);

            share_offline =(Button)MyDialog.findViewById(R.id.share_offline);
//            share_online =(Button)MyDialog.findViewById(R.id.share_online);
            cancel =(Button)MyDialog.findViewById(R.id.share_cancel);




            share_offline.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ApplicationInfo app =getApplicationContext().getApplicationInfo();
                    String filePath=app.sourceDir;
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("*/*");

                    intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
                    startActivity(Intent.createChooser(intent,"Share App Via"));
                }
            });
           /* share_online.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent share= new Intent(Intent.ACTION_SEND);
                    share.setType("text/plain");
                    share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                    share.putExtra(Intent.EXTRA_SUBJECT,"share the Link for App download");
                    share.putExtra(Intent.EXTRA_TEXT,"http://donsoft.com.ng/product/mobileDev/load.php?app_id=19&name=ibulksms-mobile-app");
                    startActivity(Intent.createChooser(share,"Share the Link"));
                }
            });*/
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MyDialog.dismiss();
                }
            });



            MyDialog.show();
        }
    }

}
