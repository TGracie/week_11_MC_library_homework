import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;
    private int capacity;

    public Borrower(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if(this.bookCount() < this.capacity) {
            this.collection.add(book);
            System.out.println("Book Added!");
        } else {
            System.out.println("No more books!");
        }
    }

    public Book removeBook(Book outBook) {
        int index = this.collection.indexOf(outBook);
        this.collection.remove(index);
        return outBook;
    }

    public void checkOut(Book book, Library library){
        Book myBook = library.removeBook(book);
        this.addBook(myBook);
    }
}
