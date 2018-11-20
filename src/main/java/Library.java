import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library (int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(this.bookCount() < this.capacity) {
            this.books.add(book);
            System.out.println("Book Added!");
        } else {
            System.out.println("No more books!");
        }
    }

    public Book removeBook(Book outBook) {
        int index = this.books.indexOf(outBook);
        this.books.remove(index);
        return outBook;
    }
}
