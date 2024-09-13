package service;

import interfaces.Playback;
import model.Song;

import java.util.Stack;

public class BasicListService implements Playback {

    private Stack<Song> myList;

    public BasicListService(Stack<Song> myList) {
        this.myList = myList;
    }

    public Stack<Song> getMyList() {
        return myList;
    }

    public void setMyList(Stack<Song> myList) {
        this.myList = myList;
    }

    @Override
    public String play() {
        Song onPlay = myList.pop();

        moveSongToEnd(onPlay);

        return onPlay.toString();
    }

    @Override
    public void addSong(Song song) {
        if (myList == null) {
            myList = new Stack<>();
        }
    }

    @Override
    public void changeSong() {
        showMessagePremium();
    }

    @Override
    public void deleteSong() {
        showMessagePremium();
    }

    @Override
    public String showList() {
        StringBuilder songList = new StringBuilder();
        int index = 0;

        for (Song song : myList) {
            songList.append(++index).append(" - ").append(song.getName()).append("\n");
        }

        return songList.toString();
    }

    private void showMessagePremium() {
        System.out.println("Para acceder a estas opciones, compre la version PREMIUM");
    }

    private void moveSongToEnd(Song songPlayed) {
        Stack<Song> aux = new Stack<>();

        aux.addAll(myList);
        myList.removeAllElements();
        myList.add(songPlayed);
        myList.addAll(aux);
    }
}
