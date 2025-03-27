package model;

import java.util.Collection;
import java.util.HashMap;

public class Library
{
    private static final HashMap<String,Book> libDataBase=new HashMap<>();
    public static void addBookToDB(Book book)
    {
        libDataBase.put(book.getBookId(), book);
    }
    public static Book fetchBookById(String bookID)
    {
        return libDataBase.get(bookID);
    }
    public static Book fetchBookByTitle(String title)
    {
        return libDataBase.get(title);
    }
    public Collection<Book> getAllBooks()
    {
        return libDataBase.values();
    }
    public void deleteBookById(String bookId)
    {
        libDataBase.remove(bookId);
    }

}
