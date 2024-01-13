package ru.javabegin.oop.dz.music;

public class Song implements iSong{

    String songName;
    Author author;

    public Song() {
    }

    public Song(String songName, Author author) {
        this.songName = songName;
        this.author = author;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println("Играет песня: " + songName + ", автор: " + getAuthor().getName());
    }
}
