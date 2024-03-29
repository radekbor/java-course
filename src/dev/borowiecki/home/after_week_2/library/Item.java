package dev.borowiecki.home.after_week_2.library;

public abstract class Item {

    public final String id;
    public final String name;
    public final String author;

    public Item(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}
