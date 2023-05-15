package models;

import java.io.Serializable;

public class Artist implements Serializable {

    private long id;
    private String artist;

    public Artist(long id, String artist) {
        this.id = id;
        this.artist = artist;
    }

    public Artist() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
