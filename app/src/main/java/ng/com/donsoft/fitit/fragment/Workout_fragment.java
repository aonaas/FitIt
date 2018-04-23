package ng.com.donsoft.fitit.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import ng.com.donsoft.fitit.R;
import ng.com.donsoft.fitit.ScrollableWorkOutTabsActivity;

/**
 * Created by Donchi4all on 02/03/2018.
 */

public class Workout_fragment extends Fragment {
    TextView txtView1,txtView2,txtView3,txtView4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.workout_layout, container, false);

        LinearLayout linearLayout1=(LinearLayout)view.findViewById(R.id.lay1);
        LinearLayout linearLayout2 =(LinearLayout)view.findViewById(R.id.lay2);
        LinearLayout linearLayout3 =(LinearLayout)view.findViewById(R.id.lay3);
        LinearLayout linearLayout4 =(LinearLayout)view.findViewById(R.id.lay4);

        txtView1 = (TextView)view.findViewById(R.id.txt1);
         txtView2 = (TextView)view.findViewById(R.id.txt2);
    txtView3 = (TextView)view.findViewById(R.id.txt3);
         txtView4 = (TextView)view.findViewById(R.id.txt4);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(getActivity(), ScrollableWorkOutTabsActivity.class);
                intent.putExtra("title", txtView1.getText().toString());
                startActivity(intent);

            }
        });



        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ScrollableWorkOutTabsActivity.class);
                intent.putExtra("title", txtView2.getText().toString());
                startActivity(intent);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ScrollableWorkOutTabsActivity.class);
                intent.putExtra("title", txtView3.getText().toString());
                startActivity(intent);
            }
        });


        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ScrollableWorkOutTabsActivity.class);
                intent.putExtra("title", txtView4.getText().toString());
                startActivity(intent);
            }
        });
        return view;
    }
}
