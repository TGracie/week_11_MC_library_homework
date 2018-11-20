import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library (){
        this.books = new ArrayList<>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
        System.out.println("Book Added!");
    }

    public Book removeBook(Book outBook) {
        int index = this.books.indexOf(outBook);
        this.books.remove(index);
        return outBook;
    }
}
