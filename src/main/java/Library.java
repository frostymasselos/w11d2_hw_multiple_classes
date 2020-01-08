import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
//    public Library(ArrayList<Book> books){
//        this.books = books;
//    }

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 100;
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addBook(Book book1) {
        if (capacity >= 1) {
            books.add(book1);
            capacity -= 1;
        }
    }





//    How we'd write it to start off with 5 books. Could only do that using an array w/5 nulls!
}
