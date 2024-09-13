package model;

import enums.Genre;

public class Song {
    private String name;
    private Double timeDuration;
    private Genre genre;
    private Album album;
    private Artist invitedArtist;

    public Song(String name, Double timeDuration, Genre genre, Album album, Artist invitedArtist) {
        this.name = name;
        this.timeDuration = timeDuration;
        this.genre = genre;
        this.album = album;
        this.invitedArtist = invitedArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(Double timeDuration) {
        this.timeDuration = timeDuration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getInvitedArtist() {
        return invitedArtist;
    }

    public void setInvitedArtist(Artist invitedArtist) {
        this.invitedArtist = invitedArtist;
    }

    @Override
    public String toString() {
        return "Canción{" +
                "Nombre='" + name + '\'' +
                ", Duración=" + timeDuration +
                ", Genero=" + genre +
                ", Album=" + album +
                ", Artista Invitado=" + invitedArtist +
                '}';
    }
}
