package task4;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> songs = new ArrayList<>();

    public abstract void addSong(Song song);

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                '}';
    }
}
