package ru.javabegin.oop.dz.music;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements iPlaylist{

    Song song;
    List <iSong> playlist = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(Song song) {
        this.song = song;
    }


    @Override
    public void addSong(iSong song) {
        playlist.add(song);
    }

    @Override
    public void playAllSongs() {
        for (iSong song: playlist) {
            song.play();
        }
    }
}
