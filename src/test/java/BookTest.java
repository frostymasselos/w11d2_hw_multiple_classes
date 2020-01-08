import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("Harry Potter 1", "JK Rowling", "fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Harry Potter 1", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("JK Rowling", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("fantasy", book1.getGenre());
    }

}
