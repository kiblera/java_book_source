package main.java.bookpack;

/**
* Created by ryandesmond on 3/27/17.
*/
public class Book {
    private String title;
    private String author;
    private int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

