package ng.com.donsoft.fitit.fragment;


public class ExerciseObject {

    private String playlistTitle;
    private String playlistTracks;
    private String playlistCover;

    public ExerciseObject(String playlistTitle, String playlistTracks, String playlistCover) {
        this.playlistTitle = playlistTitle;
        this.playlistTracks = playlistTracks;
        this.playlistCover = playlistCover;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public String getPlaylistTracks() {
        return playlistTracks;
    }

    public String getPlaylistCover() {
        return playlistCover;
    }
}
