import java.util.List;
import java.util.ArrayList;

public class TaskSerice {
    private List<BookList> books = new ArrayList<>();
    private int nextId = 1;

    public void addBook(String title){
        new BookList(books);
        books.add(nextId, title);
        nextId++;
    }
    
}
