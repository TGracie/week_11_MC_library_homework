import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book2;


    @Before
    public void before(){
        library = new Library();
        book = new Book("Ruby", "Chris Pine", "Textbook");
        book2 = new Book("JAVA for Dummies", "Barry Burd", "Textbook");
    }

    @Test
    public void libStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBooks(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBooks(){
        library.addBook(book);
        library.addBook(book2);
        library.removeBook(book2);
        assertEquals(1, library.bookCount());

    }
}
