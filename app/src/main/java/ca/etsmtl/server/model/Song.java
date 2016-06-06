package ca.etsmtl.server.model;

/**
 * Created by julie.bastien on 2016-06-05.
 */
public class Song {

    private String ID;
    private String title;
    private String artist;
    private String album;
    private Integer duration;
    private String filename;

    public String getID() {
            return ID;
        }

    public String getTitle() {
            return title;
        }

    public String getArtist() {
            return artist;
        }

    public String getAlbum() {
            return album;
        }

    public Integer getDuration() {
            return duration;
        }

    public String getFileName() {
            return filename;
        }

}
