import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;


    @Before
    public void before() {
        book = new Book("American Gods", "Neil Gaiman", "Fantasy");
    }

    @Test
    public void hasDetails(){
        assertEquals("American Gods", book.getTitle());
        assertEquals("Neil Gaiman", book.getAuthor());
        assertEquals("Fantasy", book.getGenre());
    }
}
