package model;

import java.time.Year;

public class Album {
    private Year publishedYear;
    private String title;
    private Artist artist;

    public Album(Year publishedYear, String title, Artist artist) {
        this.publishedYear = publishedYear;
        this.title = title;
        this.artist = artist;
    }

    public Year getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Year publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "publishedYear=" + publishedYear +
                ", title='" + title + '\'' +
                ", artist=" + artist +
                '}';
    }
}
