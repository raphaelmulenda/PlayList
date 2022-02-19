package Raphael.Mulenda;

/**
 * Created by Raphael Mulenda on 19/Feb/2022.
 */

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return (this.title + " : " + this.duration);
    }}