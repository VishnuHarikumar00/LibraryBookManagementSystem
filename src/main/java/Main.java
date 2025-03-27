import model.Library;
import service.LibraryImplementation;

import java.util.Scanner;

import static userinterface.UserInterface.*;


public class Main {
    static LibraryImplementation library=new LibraryImplementation();
    public static void main(String[] args)
    {

        int taskId;
       do
       {
           taskId=getTask();
           switch(taskId)
           {
               case 1:
                   newBook();
                   break;
               case 2:
                   library.viewAllBooks();
                   break;
               case 3:
                   searchBook();
                   break;
               case 4:
                //   updateBook();
           }

       }while(taskId!=6);




    }

}