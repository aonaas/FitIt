package ng.com.donsoft.fitit.Grid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ng.com.donsoft.fitit.R;


public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_details);

       String title = getIntent().getStringExtra("title");
      //  Bitmap bitmap = getIntent().getParcelableExtra("image");

        if(getIntent().hasExtra("byteArray")) {
           // ImageView _imv= new ImageView(this);
            Bitmap _bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra("byteArray"),0,getIntent().getByteArrayExtra("byteArray").length);
            //_imv.setImageBitmap(_bitmap);

            ImageView imageView = (ImageView) findViewById(R.id.images);
            imageView.setImageBitmap(_bitmap);
        }

       TextView titleTextView = (TextView) findViewById(R.id.titles);
        titleTextView.setText(title);


    }}
