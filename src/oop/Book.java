package oop;

public class Book {
    private String author;
    private int numberOfPages;

    public Book(String author, int numberOfPages) {
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getNumberOfPages() { return numberOfPages; }
    public void setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }
}
