package uk.abdoul.co.fitit.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.ArrayList;
import java.util.List;

import uk.abdoul.co.fitit.R;

public class ExerciseFragment extends Fragment {


    public ExerciseFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercise, container, false);

        RecyclerView playlisRecyclerView = (RecyclerView)view.findViewById(R.id.your_play_list);
        GridLayoutManager gridLayout = new GridLayoutManager(getActivity(), 2);
        playlisRecyclerView.setLayoutManager(gridLayout);
        playlisRecyclerView.setHasFixedSize(true);

        ExerciseAdapter mAdapter = new ExerciseAdapter(getActivity(), getTestData());
        playlisRecyclerView.setAdapter(mAdapter);

        return view;
    }

    public List<ExerciseObject> getTestData() {
        List<ExerciseObject> trackList = new ArrayList<ExerciseObject>();
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        trackList.add(new ExerciseObject("Falling over", "12 tracks", ""));
        return trackList;
    }
}
