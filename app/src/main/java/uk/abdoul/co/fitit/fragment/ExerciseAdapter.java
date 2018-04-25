package uk.abdoul.co.fitit.fragment;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.List;

import uk.abdoul.co.fitit.R;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseViewHolder>{

    private static final String TAG = ExerciseAdapter.class.getSimpleName();

    private Context context;
    private List<ExerciseObject> playlists;

    public ExerciseAdapter(Context context, List<ExerciseObject> playlists) {
        this.context = context;
        this.playlists = playlists;
    }

    @Override
    public ExerciseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.play_list_layout, parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExerciseViewHolder holder, int position) {
        ExerciseObject exerciseObject = playlists.get(position);
        holder.playlistTitle.setText(exerciseObject.getPlaylistTitle());
        holder.playlistTracks.setText(exerciseObject.getPlaylistTracks());

    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }
}
