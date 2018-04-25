package uk.abdoul.co.fitit.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.abdoul.co.fitit.R;

/**
 * Created by abdoul on 03/03/2018.
 */

public class Logs extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calender, container, false);
        return view;
    }
}
