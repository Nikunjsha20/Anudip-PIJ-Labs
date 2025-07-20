package collectionlab;
import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;


    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

public class BookList {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();


        bookList.add(new Book(1, "The art of being alone", "Renuka Gavrani"));
        bookList.add(new Book(2, "Clean Code", "Robert C. Martin"));
        bookList.add(new Book(3, "Java: The Complete Reference", "Herbert Schildt"));


        for (Book book : bookList) {
            System.out.println("Book ID: " + book.bookId);
            System.out.println("Book Name: " + book.bookName);
            System.out.println("Author: " + book.authorName);
        }
    }
}
