package uk.abdoul.co.fitit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import uk.abdoul.co.fitit.Grid.Workout_final_dash;


/**
 * Created by abdoul on 04/03/2018.
 */




public class ScrollableWorkOutTabsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    TextView header;
    ListView list;

    //1st
    String[] web = {
            "Barbell Bench Press",
                    "Barbell Incline Bench Press" ,
                       "Dip",
                      "Machine Fly",

                    "Barbell Lying Triceps Extension",

                    "Triceps Pushdown - Rope"
    } ;

    String[] cur = {
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s"

    } ;

    Integer[] imageId = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6



    };



//2nd
    String[] web1 = {
            "Barbell Deadlift",
                    "Barbell Bent Over Row",
                    "Wide-Grip Lat Pulldown",
                    "Barbell Curl",
                    "Incline Dumbbell Curl",
                    "Alternate Hammer Curl"
    } ;

    String[] cur1 = {
            "3 set of 8reps, res 120s",
            "3 set of 8reps, res 120s",
            "3 set of 8reps, res 120s",
            "3 set of 8reps, res 120s",
            "3 set of 8reps, res 120s",
            "3 set of 8reps, res 120s"
    } ;

    Integer[] imageId1 = {

            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7


    };

//3rd

    String[] web2 = {
            "Barbell Squat",
                    "Barbell Lunge" ,
                    "Lying Leg Curls",
                    "Barbell Shoulder Press",
                    "Dumbbell Shoulder Press",
                    "Dumbbell Lateral Raise",
                    "Barbell Shrug"
    } ;

    String[] cur2 = {
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s"
    } ;

    Integer[] imageId2 = {
            R.drawable.image_1,
            R.drawable.image_2,

            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_3,
            R.drawable.image_7


    };

//4th


    String[] web3 = {
            "Oblique Crunches",
                    "Leg Raise",
                    "Air Bike",
                    "Hanging Leg Raise",
                    "Decline Crunch"
    } ;

    String[] cur3 = {
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s",
            "3 set of 6reps, res 120s"

    } ;

    Integer[] imageId3 = {

            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7


    };





    Workout_ListView adapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_scrollable_tabs);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

       header = (TextView)toolbar. findViewById(R.id.exercise_head);
        String title = getIntent().getStringExtra("title");
        header.setText(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //checking workout
        if (title.contains("Chest and Triceps")){

            adapter   = new
            Workout_ListView(ScrollableWorkOutTabsActivity.this, web, imageId,cur);
}

        if (title.contains("Back, Biceps, and Forearm")){

            adapter   = new
                    Workout_ListView(ScrollableWorkOutTabsActivity.this, web1, imageId1,cur1);
        }

        if (title.contains("Shoulders and Legs")){

            adapter   = new
                    Workout_ListView(ScrollableWorkOutTabsActivity.this, web2, imageId2,cur2);
        }

        if (title.contains("Abs")){

            adapter   = new
                    Workout_ListView(ScrollableWorkOutTabsActivity.this, web3, imageId3,cur3);
        }



        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
              //  String item = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(ScrollableWorkOutTabsActivity.this, Workout_final_dash.class);
                intent.putExtra("txttitle", web[position]);
                startActivity(intent);

              //  Toast.makeText(ScrollableWorkOutTabsActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });




    }
}
