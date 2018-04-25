package uk.abdoul.co.fitit.Grid;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import uk.abdoul.co.fitit.R;
import uk.abdoul.co.fitit.ScrollableExerciseTabsActivity;

/**
 * Created by abdoul on 01/03/2018.
 */


public class Exercise_Main extends Fragment{
    private GridView gridView;
    private GridViewAdapter gridAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.exercise_main, container, false);

        gridView = (GridView) view.findViewById(R.id.gridView);
        gridAdapter = new GridViewAdapter(getActivity(), R.layout.exercise_items, getData());
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);

             /*   //Create intent
                Intent intent = new Intent(getActivity(), DetailsActivity.class);

                ByteArrayOutputStream _bs = new ByteArrayOutputStream();
                item.getImage().compress(Bitmap.CompressFormat.PNG, 50, _bs);
                intent.putExtra("byteArray", _bs.toByteArray());

               intent.putExtra("title", item.getTitle());
               // intent.putExtra("image", item.getImage());

                //Start details activity
                startActivity(intent);*/

                Intent intent = new Intent(getActivity(), ScrollableExerciseTabsActivity.class);
                intent.putExtra("title", item.getTitle());
                startActivity(intent);

            }
        });
        return view;
    }

    String[] textName = new String[]{
            "TRICEPS",
            "CHEST",
            "SHOULDER",
            "BICEPTS",
            "ABS",
            "BACK",
            "FOREARM",
            "UPPER LEG",
            "GLUTES",
            "CARDIO",
            "LOWER LEG",
            "SHOW ALL"
    };


    /**
     * Prepare some dummy data for gridview
     */
    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(bitmap, textName[i]));
        }
        return imageItems;
    }
}