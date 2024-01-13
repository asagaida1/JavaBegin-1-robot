package ru.javabegin.oop.dz.music;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Song song1 = new Song("Щелкунчик", new Author("Чайковский"));
        Song song2 = new Song("Лебединое озеро", new Author("Чайковский"));
        Song song3 = new Song("Времена года", new Author("Вивальди"));
        Song song4 = new Song("Цвет настроения синий", new Author("Киркоров"));
        Song song5 = new Song("Shape of My Heart", new Author("Sting"));
        Song song6 = new Song("Show must go on", new Author("Queen"));
        Song song7 = new Song("We will rock you", new Author("Queen"));

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song7);

        playlist.playAllSongs();
    }
}
