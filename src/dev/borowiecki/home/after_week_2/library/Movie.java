package dev.borowiecki.home.after_week_2.library;

public class Movie extends Item {

    final Media mediaType;

    public Movie(String id, String name, String author, Media mediaType) {
        super(id, name, author);
        this.mediaType = mediaType;
    }
}
