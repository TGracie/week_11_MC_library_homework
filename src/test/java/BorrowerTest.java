import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Library library;
    Book book;
    Book book2;
    Borrower me;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("Ruby", "Chris Pine", "Textbook");
        book2 = new Book("JAVA for Dummies", "Barry Burd", "Textbook");
        me = new Borrower(3);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, me.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book2);
        me.checkOut(book2, library);
        assertEquals(1, me.bookCount());
    }

}
