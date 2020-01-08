import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books = books;
    }

    public int bookCount(){
        return books.size();
    }

    public void addBook(Book book){
        books.add(book);
    }
}
