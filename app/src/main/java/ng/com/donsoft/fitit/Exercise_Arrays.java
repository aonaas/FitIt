package ng.com.donsoft.fitit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Donchi4all on 14/03/2018.
 */



public class Exercise_Arrays extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;
   // private final String[] cur;
    private final Integer[] imageId;
    public Exercise_Arrays(Activity context,
                            String[] web, Integer[] imageId) {
        super(context, R.layout.exercise_listview_layout, web);
        this.context = context;
        this.web = web;
        //this.cur = cur;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.exercise_listview_layout, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
       // TextView txtSub = (TextView) rowView.findViewById(R.id.cur);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.flag);
        txtTitle.setText(web[position]);
       // txtSub.setText(cur[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}