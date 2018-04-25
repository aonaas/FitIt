package uk.abdoul.co.fitit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import uk.abdoul.co.fitit.Grid.Exercise_final_dash;

/**
 * Created by abdoul on 11/03/2018.
 */



public class  A_Z_Sort extends Fragment {




    // Array of strings storing country names
    String[] Triceps = new String[] {

            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",
            "Dip",
            "Dumbbell Standing Triceps Extention",
            "Dumbbell Tricep Kickback"

    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_Triceps = new int[]{

            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9,
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
    };


    //chest
    String[] chest = new String[] {
            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",
            "chest",
            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention"


    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_chest = new int[]{

            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9,
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6

    };


    String[] shoulder = new String[] {

            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",

            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention",
            " shoulder "
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_shoulder  = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };


    String[] Biceps = new String[] {

            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Biceps",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",

            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention"
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_Biceps = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };


    String[] abs = new String[] {
            "abs",
            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",

            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention",
            "Cable Rope Overheaded Triceps Extention"
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_abs = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };


    String[] back = new String[] {
            "back",
            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",

            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention",
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_back = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };




    String[]FOREARM = new String[] {

            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",

            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention",
            "FOREARM"
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_FOREARM = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };



    String[] UPPERLEG = new String[] {

            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",
            "back",
            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention"
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_UPPERLEG = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };


    String[] GLUTES = new String[] {

            "Barbell Close Grip Bench Press ",
            "Barbell Lying Triceps Extention",
            "Barbell Tricep Extention",
            "Bench Dip",
            "Cable Rope Overheaded Triceps Extention",
            "Cable Rope Triceps Pushdown",
            "Cable triceps pushdown",

            "Dumbbell Tricep Kickback",
            "Dumbbell Standing Triceps Extention",
            "GLUTES"
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_GLUTES = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_4,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };



    View view;
    /** Called when the activity is first created. */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.exercise_listview_main, container, false);

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        ScrollableExerciseTabsActivity activity =(ScrollableExerciseTabsActivity)getActivity();
        for(int i=0;i< 10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();



            if(activity.GetMyData().contains("TRICEPS")) {
               // int randomIndex = new Random().nextInt(Triceps.length);
                hm.put("txt", "" +   Triceps[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_Triceps[i]));
            }

            if(activity.GetMyData().contains("CHEST")) {
                int randomIndex = new Random().nextInt(chest.length);
                hm.put("txt", "" + chest[randomIndex]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_chest[randomIndex]));
            }

            if(activity.GetMyData().contains("SHOULDER")) {
               // int randomIndex = new Random().nextInt(shoulder.length);
                hm.put("txt", "" + shoulder[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_shoulder[i]));
            }

            if(activity.GetMyData().contains("BICEPTS")) {
               // int randomIndex = new Random().nextInt(Biceps.length);
                hm.put("txt", " " + Biceps[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_Biceps[i]));
            }
            if(activity.GetMyData().contains("ABS")) {
              //  int randomIndex = new Random().nextInt(abs.length);
                hm.put("txt", " " + abs[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_abs[i]));
            }
            if(activity.GetMyData().contains("BACK")) {

                //int randomIndex = new Random().nextInt(back.length);
                hm.put("txt", " " + back[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_back[i]));
            }
            if(activity.GetMyData().contains("FOREARM")) {
              //  int randomIndex = new Random().nextInt(FOREARM.length);
                hm.put("txt", " " + FOREARM[i]);
                //  hm.put("cur","exercise : " + currency[randomIndex]);
                hm.put("flag", Integer.toString(flags_FOREARM[i]));
            }
            if(activity.GetMyData().contains("UPPER LEG")) {
                //int randomIndex = new Random().nextInt(UPPERLEG.length);
                hm.put("txt", " " + UPPERLEG[i]);
                //  hm.put("cur","exercise : " + currency[randomIndex]);
                hm.put("flag", Integer.toString(flags_UPPERLEG[i]));
            }
            if(activity.GetMyData().contains("GLUTES")) {
               // int randomIndex = new Random().nextInt(GLUTES.length);
                hm.put("txt", "" + GLUTES[i]);
                //  hm.put("cur","exercise : " + currency[randomIndex]);
                hm.put("flag", Integer.toString(flags_GLUTES[i]));
            }
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","txt"};
        // String[] from = { "flag","txt","cur" };
        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.txt};
        // int[] to = { R.id.flag,R.id.txt,R.id.cur};
        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), aList, R.layout.exercise_listview_layout, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView )view. findViewById(R.id.listview);
        ToggleButton toggleButton= view.findViewById(R.id.chkState);
        toggleButton.setVisibility(View.INVISIBLE);
        // Setting the adapter to the listView
        listView.setAdapter(adapter);

        // Item Click Listener for the listview
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View container, int position, long id) {
                // Getting the Container Layout of the ListView
                LinearLayout linearLayoutParent = (LinearLayout) container;

                // Getting the inner Linear Layout
                LinearLayout linearLayoutChild = (LinearLayout ) linearLayoutParent.getChildAt(1);

                // Getting the Country TextView
                TextView tvCountry = (TextView) linearLayoutChild.getChildAt(0);
                Intent intent = new Intent(getActivity(), Exercise_final_dash.class);
                intent.putExtra("txttitle", tvCountry.getText().toString());
                startActivity(intent);
                //Toast.makeText(getActivity(), tvCountry.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        };

        // Setting the item click listener for the listview
        listView.setOnItemClickListener(itemClickListener);
        return view;
    }


}
