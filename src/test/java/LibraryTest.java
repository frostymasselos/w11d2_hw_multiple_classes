import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Library library1;

    @Before
    public void before(){
        book1 = new Book("Harry Potter 1", "JK Rowling", "fantasy");
        book2 = new Book("Harry Potter 2", "JK Rowling", "fantasy");
        library1 = new Library();
    }
    @Test
    public void getBooksInEmptyLibrary(){
        assertEquals(0, library1.getNumberOfBooks());
    }

    @Test
    public void capacityStartsOneHundred(){
        assertEquals(100, library1.getCapacity());
    }

    @Test
    public void addBookToLibrary(){
        library1.addBook(book1);
        assertEquals(1, library1.getNumberOfBooks());
        assertEquals(99, library1.getCapacity());
    }
}
