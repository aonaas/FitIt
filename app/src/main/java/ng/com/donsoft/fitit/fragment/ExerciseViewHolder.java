package ng.com.donsoft.fitit.fragment;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ng.com.donsoft.fitit.R;


public class ExerciseViewHolder extends RecyclerView.ViewHolder{

    public TextView playlistTitle;
    public TextView playlistTracks;
    public ImageView playlistCover;

    public ExerciseViewHolder(View itemView) {
        super(itemView);

        playlistTitle = (TextView)itemView.findViewById(R.id.play_list_name);
        playlistTracks = (TextView)itemView.findViewById(R.id.number_of_tracks);
        playlistCover = (ImageView)itemView.findViewById(R.id.play_list_cover);
    }
}
