package ca.etsmtl.server.model;


import java.util.List;
/**
 * Created by julie.bastien on 2016-06-05.
 */
public class Playlist {

    private String name;
    private List<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public int getTotalDuration() {

        int total = 0;
        for(final Song song: songs) {
            total += song.getDuration();
        }

        return total;
    }


}
