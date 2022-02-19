package Raphael.Mulenda;
/**
 * Created by Raphael Mulenda on 19/Feb/2022.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
private static ArrayList<Album> albums = new ArrayList<Album>();
private static LinkedList<Song> playlist = new LinkedList<Song>();
    public static void main(String[] args) {
	// write your code here

        Album album = new Album("The One","Jackson");
        album.addSong("first date",2.5);
        album.addSong("labas",3);
        album.addSong("the only one",4);
        albums.add(album);
        album = new Album("My life","Celine Dione");
        album.addSong("wrong direction",2.5);
        album.addSong("titanic",4);
        albums.add(album);

        albums.get(0).addToPlayList(1,playlist);
        albums.get(0).addToPlayList(2,playlist);
        albums.get(1).addToPlayList("wrong direction",playlist);
    }
}
