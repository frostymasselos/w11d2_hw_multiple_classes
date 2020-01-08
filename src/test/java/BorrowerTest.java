import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower morgaine;
    private Book book1;

    @Before
    public void before(){
        morgaine = new Borrower();
        book1 = new Book("Harry Potter 1", "J.K Rowling", "fantasy");
    }

    @Test
    public void startingBooksZero(){
        assertEquals(0, morgaine.bookCount());
    }

//    @Test
//    public void addBookRandomly(){
//        morgaine.addBook(book1);
//        assertEquals(1, morgaine.bookCount());
//    }
}

