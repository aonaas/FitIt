package uk.abdoul.co.fitit;

/**
 * Created by abdoul on 01/03/2018.
 */


        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.AdapterView.OnItemClickListener;
        import android.widget.LinearLayout;
        import android.widget.ListView;
        import android.widget.SimpleAdapter;
        import android.widget.TextView;
        import android.widget.ToggleButton;

        import uk.abdoul.co.fitit.Grid.Exercise_final_dash;

public class Exercise_ListView  extends Fragment {





    // Array of strings storing country names
    String[] Triceps = new String[] {
            "Dip",
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_Triceps = new int[]{
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


    //chest
    String[] chest = new String[] {
            "chest",
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_chest = new int[]{
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


    String[] shoulder = new String[] {
            " shoulder ",
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
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
            "Biceps",
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
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
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
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
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
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
            "FOREARM",
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
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
            "back",
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
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
            "GLUTES",
            "Cable Rope Triceps Pushdown",
            "Barbell Lying Triceps Extention",
            "Cable triceps pushdown",
            "Dumbbell Standing Triceps Extention",
            "Barbell Close Grip Bench Press ",
            "Bench Dip",
            "Barbell Tricep Extention",
            "Dumbbell Tricep Kickback",
            "Cable Rope Overheaded Triceps Extention"
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



   /* // Array of strings to store currencies
    String[] currency = new String[]{
            "Indian Rupee",
            "Pakistani Rupee",
            "Sri Lankan Rupee",
            "Renminbi",
            "Bangladeshi Taka",
            "Nepalese Rupee",
            "Afghani",
            "North Korean Won",
            "South Korean Won",
            "Japanese Yen"
    };*/





View view;
    /** Called when the activity is first created. */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.exercise_listview_main, container, false);

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
ScrollableExerciseTabsActivity activity =(ScrollableExerciseTabsActivity)getActivity();
        for(int i=0;i<10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();

            if(activity.GetMyData().contains("TRICEPS")) {
                hm.put("txt", "" + Triceps[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_Triceps[i]));
            }

            if(activity.GetMyData().contains("CHEST")) {
                hm.put("txt", "" + chest[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_chest[i]));
            }

            if(activity.GetMyData().contains("SHOULDER")) {
                hm.put("txt", "" + shoulder[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_shoulder[i]));
            }

            if(activity.GetMyData().contains("BICEPTS")) {
                hm.put("txt", " " + Biceps[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_Biceps[i]));
            }
            if(activity.GetMyData().contains("ABS")) {
                hm.put("txt", " " + abs[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_abs[i]));
            }
            if(activity.GetMyData().contains("BACK")) {
                hm.put("txt", " " + back[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_back[i]));
            }
            if(activity.GetMyData().contains("FOREARM")) {
                hm.put("txt", " " + FOREARM[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_FOREARM[i]));
            }
            if(activity.GetMyData().contains("UPPER LEG")) {
                hm.put("txt", " " + UPPERLEG[i]);
                //  hm.put("cur","exercise : " + currency[i]);
                hm.put("flag", Integer.toString(flags_UPPERLEG[i]));
            }
            if(activity.GetMyData().contains("GLUTES")) {
                hm.put("txt", "" + GLUTES[i]);
                //  hm.put("cur","exercise : " + currency[i]);
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
        OnItemClickListener itemClickListener = new OnItemClickListener() {
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