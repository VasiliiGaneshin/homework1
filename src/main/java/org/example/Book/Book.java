package org.example.Book;

public class Book implements Displayable {
    private String name;
    private String author;
    private int year;

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setAuthor(String author) {
        this.author = author;
    }

    //getter
    public String getAuthor() {
        return author;
    }

    //setter
    public void setYear(int year) {
        this.year = year;
    }

    //getter
    public int getYear() {
        return year;
    }


    @Override
    public void display() {
        System.out.println("Book: " + name);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}
