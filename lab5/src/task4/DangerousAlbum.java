package task4;

public class DangerousAlbum extends Album{

    @Override
    public void addSong(Song song) {
        if (song.getId() <= 0) {
            return;
        }

        for (int i = 2; i < song.getId(); ++i) {
            if (song.getId() % i == 0) {
                return;
            }
        }

        songs.add(song);
    }
}
