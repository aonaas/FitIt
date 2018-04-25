package uk.abdoul.co.fitit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import uk.abdoul.co.fitit.Grid.Exercise_final_dash;

/**
 * Created by abdoul on 06/03/2018.
 */




public class Search_Workout  extends Fragment {





    // Array of strings storing country names
    String[] Search = new String[] {
            "Barbell Bench Press",
            "Barbell Incline Bench Press" ,
            "Dip",
            "Machine Fly",

            "Barbell Lying Triceps Extension",

            "Triceps Pushdown - Rope",
            "Barbell Deadlift",
            "Barbell Bent Over Row",
            "Wide-Grip Lat Pulldown",
            "Barbell Curl",
            "Incline Dumbbell Curl",
            "Alternate Hammer Curl",
            "Barbell Squat",
            "Barbell Lunge" ,
            "Lying Leg Curls",
            "Barbell Shoulder Press",
            "Dumbbell Shoulder Press",
            "Dumbbell Lateral Raise",
            "Barbell Shrug",
            "Oblique Crunches",
            "Leg Raise",
            "Air Bike",
            "Hanging Leg Raise",
            "Decline Crunch"

    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags_search = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7,
            R.drawable.image_1,
            R.drawable.image_2,

            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_3,
            R.drawable.image_7,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7

    };












    // Search EditText
    EditText inputSearchs;
    View view;
    /** Called when the activity is first created. */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.search_main, container, false);

        // Each row in the list stores country name, currency and flag
        inputSearchs = (EditText) view.findViewById(R.id.inputSearch);

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        SearchActivity activity =(SearchActivity) getActivity();
        for(int i=0;i<10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();


            hm.put("txt", "" + Search[i]);
            //  hm.put("cur","exercise : " + currency[i]);
            hm.put("flag", Integer.toString(flags_search[i]));



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
        final SimpleAdapter adapter = new SimpleAdapter(getActivity(), aList, R.layout.exercise_listview_layout, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView )view. findViewById(R.id.list_view);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);


        // enabling search funtionality


        inputSearchs.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });


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