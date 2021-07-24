/*
Name: young cheol ko
Class: CS55
Project 5
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

public class Book {

    private String title;
    private String author;
    private String publisher;
    private double price;
    private String copyrightDate;

    public Book() {
        title = "";
        author = "";
        publisher = "";
        price = 0.0;
        copyrightDate = null;
    }

    public Book(String title, String author, String publisher, double price, String copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.copyrightDate = copyrightDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    public String toString() {

        String toString = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher +
                "\nPrice: $" + price + "\nCopyright Date: " + copyrightDate;
        return toString;
    }

    public boolean isDuplicate(Book b) {
        return getTitle().equals(b.getTitle()) && getPublisher().equals(b.getPublisher());
    }
}
