package service;

import model.Book;

import static service.LibraryImplementation.addBook;

public class BookImplementation extends Book
{
    public BookImplementation(String bookId, String title, String author, String genre, String status) {
        super(bookId, title, author, genre, status);
    }

    public static void createBook(String bookId, String title, String author, String genre, String status)
    {
        Book newBook=new Book(bookId,title,author,genre,status);
        addBook(newBook);
    }
    public void updateBookTitle(String bookTitle)
    {
        this.setTitle(bookTitle);
    }
    public void updateBookAuthor(String bookAuthor)
    {
        this.setAuthor(bookAuthor);
    }
    public void updateBookGenre(String bookGenre)
    {
        this.setGenre(bookGenre);
    }
    public void updateBookAvailabilityStatus(String bookStatus)
    {
        this.setStatus(bookStatus);
    }
    public void viewBook()
    {
        System.out.println(this.getBookId()+" "+this.getTitle()+" "+this.getAuthor()+" "+this.getGenre()+" "+this.getStatus());
    }
}
