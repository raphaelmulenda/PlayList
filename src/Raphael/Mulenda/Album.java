package Raphael.Mulenda;
/**
 * Created by Raphael Mulenda on 19/Feb/2022.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String songTitle){
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong(String songTitle, double duration){
        if (findSong(songTitle) !=null){
            Song newSong = new Song(songTitle,duration);
            this.songs.add(newSong);
            return true;

        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if ((trackNumber >0 ) && trackNumber <= this.songs.size()){
            playlist.add(this.songs.get((trackNumber-1)));
            System.out.println("The tract number " + trackNumber + " song: " + this.songs.get(trackNumber).getTitle() + " added to Playlist");
            return true;
        }
        System.out.println("There is not song with Track Number: " + trackNumber);
        return false;

    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList){
        if (findSong(songTitle) !=null){
            playList.add(findSong(songTitle));
            System.out.println(songTitle + " has been added to playlist");
            return true;
        }
        System.out.println(songTitle + " does not exist in Song list");
        return false;
    }
}
