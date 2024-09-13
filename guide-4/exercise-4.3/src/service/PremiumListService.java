package service;

import interfaces.Playback;
import model.Song;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PremiumListService implements Playback {

    private List<Song> myList;

    public PremiumListService(List<Song> myList) {
        this.myList = myList;
    }

    public List<Song> getMyList() {
        return myList;
    }

    public void setMyList(List<Song> myList) {
        this.myList = myList;
    }

    @Override
    public String play() {
        return chooseSong("reproducir").toString();
    }

    @Override
    public void addSong(Song song) {
        if (myList == null) {
            myList = new LinkedList<>();
        }
    }

    @Override
    public void changeSong() {
        showMessagePremium();
    }

    @Override
    public void deleteSong() {
        Song chosenSong = chooseSong("eliminar");

        if (chosenSong != null) {
            myList.remove(chosenSong);
        }
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

    private Song chooseSong(String action) {
        Song chosenSong = null;
        String indexSong;

        Scanner scanner = new Scanner(System.in);

        System.out.println(showList());
        System.out.println();
        System.out.print("Seleccione el Nro de canción que desea " + action + ": ");

        indexSong = scanner.nextLine();

        if (validateNumber(indexSong)) {
            int index = Integer.parseInt(indexSong);

            if (index <= myList.size() && index > 0) {
                chosenSong = myList.get(index - 1);
            } else {
                System.out.println("El numero ingresado no corresponde a una canción");
            }
        }
        System.out.println("Debe ingresar un numero");

        return chosenSong;
    }

    private Boolean validateNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
