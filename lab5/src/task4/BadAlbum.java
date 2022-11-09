package task4;

public class BadAlbum extends Album{
    @Override
    public void addSong(Song song) {
        int inv = 0;
        int id = song.getId();

        while (id != 0) {
            inv = inv * 10 + id % 10;
            id /= 10;
        }
        if (song.getId() != inv) {
            return;
        }
        if (song.getName().length() != 3) {
            return;
        }
        songs.add(song);
    }
}
