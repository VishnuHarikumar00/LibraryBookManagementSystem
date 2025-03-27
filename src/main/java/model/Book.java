package model;

public class Book
{
    //required data of a book
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private String status;

    //Constructor to create a new book
    public Book(String bookId, String title, String author, String genre, String status)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
