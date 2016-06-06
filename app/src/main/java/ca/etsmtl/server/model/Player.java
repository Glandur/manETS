package ca.etsmtl.server.model;


import android.media.MediaPlayer;
import java.util.List;
/**
 * Created by julie.bastien on 2016-06-05.
 */
public class Player extends MediaPlayer{

    private List<Playlist> playlists;
    private Integer currentPLindex;
    private Integer currentSindex;
    private boolean repeatSong = false;

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public Integer getCurrentPlaylistIdx() {
        return currentPLindex;
    }

    public void setCurrentPlaylistIdx(Integer currentPlaylist) {
        this.currentPLindex = currentPlaylist;
    }

    public Integer getCurrentSongIdx() {
        return currentSindex;
    }

    public void setCurrentSongIdx(Integer currentSongIdx) {
        this.currentSindex = currentSongIdx;
    }

    public boolean isRepeatSong() {
        return repeatSong;
    }

    public void setRepeatSong(boolean repeatOne) {
        this.repeatSong = repeatSong;
    }

}
