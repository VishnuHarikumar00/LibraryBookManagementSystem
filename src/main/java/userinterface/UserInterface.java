package userinterface;

import model.Book;

import java.util.Scanner;

import static service.BookImplementation.*;
import static service.LibraryImplementation.*;

public class UserInterface
{
    private static final Scanner scan = new Scanner(System.in);

    public static int getTask()
    {
        System.out.println( "1)Add a book\n" +
                            "2)View books\n" +
                            "3)Search a book\n" +
                            "4)Update a book\n" +
                            "5)Delete a book\n" +
                            "6)Exit");
         int taskId=scan.nextInt();
         scan.nextLine();
        return taskId;

    }
    public static void printBook(String bookId, String title, String author, String genre, String status)
    {
        System.out.println("------------------------------------------------");

        System.out.println( "Book ID -" +bookId+
                "\nTitle of the book -" +title+
                "\nAuthor of the book -" +author+
                "\nGenre of the book -" +genre+
                "\nStatus -"+status);
        System.out.println("------------------------------------------------");

    }
    public static Boolean verifyNewBook(String bookId, String title, String author, String genre, String status)
    {
        printBook( bookId,  title,  author,  genre,  status);
        System.out.println("\nIs the provided data correct?Yes(y)/No(n)");
        String validation=scan.nextLine();
        return validation.equals("y");

    }
    public static void newBook()
    {
        System.out.println( "Book ID -");
        String bookId=scan.nextLine();
        System.out.println( "Title of the book -");
        String bookTitle=scan.nextLine();
        System.out.println( "Author of the book -");
        String bookAuthor=scan.nextLine();
        System.out.println( "Genre of the book -");
        String bookGenre=scan.nextLine();
        System.out.println( "Status -");
        String bookStatus=scan.nextLine();
        if(verifyNewBook(bookId,bookTitle,bookAuthor,bookGenre,bookStatus))
        {
            createBook(bookId,bookTitle,bookAuthor,bookGenre,bookStatus);

        }
        else
        {
            newBook();
        }

    }
    public static void searchBook()
    {
        Book searchBook = null;
        System.out.println("1)Search book by ID" +
                            "\n2)Search book by title");
        int searchOption=scan.nextInt();
        scan.nextLine();
        switch (searchOption)
        {
            case 1:
                System.out.println("Book Id -");
                String bookId=scan.nextLine();
                searchBook = findBookById(bookId);
                break;
            case 2:
                System.out.println("Book Title -");
                String bookTitle=scan.nextLine();
                searchBook = findBookByTitle(bookTitle);
                break;

        }
        if(searchBook!=null)
        {
            printBook(  searchBook.getBookId(),
                        searchBook.getTitle(),
                        searchBook.getAuthor(),
                        searchBook.getGenre(),
                        searchBook.getStatus());
        }
    }
    public static void updateBook()
    {

    }
}
