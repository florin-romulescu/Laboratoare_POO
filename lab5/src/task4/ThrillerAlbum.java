package task4;

public class ThrillerAlbum extends Album{
    @Override
    public void addSong(Song song) {
        if (song.getId() % 2 == 1) {
            return;
        }
        if (!song.getComposer().equals("Michael Jackson")) {
            return;
        }
        songs.add(song);
    }
}
