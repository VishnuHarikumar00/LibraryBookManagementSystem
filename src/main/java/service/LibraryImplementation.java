package service;

import model.Book;
import model.Library;

import java.util.Collection;

import static userinterface.UserInterface.printBook;

public class LibraryImplementation extends Library
{
    public void viewAllBooks()
    {
        Collection<Book> books=this.getAllBooks();
        for(Book book:books)
        {

            printBook(book.getBookId(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getGenre(),
                    book.getStatus());
        }
    }
    public static Book findBookById(String bookId)
    {
        return fetchBookById(bookId);
    }
    public static Book findBookByTitle(String bookTitle)
    {
        return fetchBookById(bookTitle);
    }
    public static void addBook(Book book)
    {
        addBookToDB(book);
    }

}
