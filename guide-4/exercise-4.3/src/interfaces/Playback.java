package interfaces;

import model.Song;

public interface Playback {
    String play();
    void addSong(Song song);
    void changeSong();
    void deleteSong();
    String showList();
}
