public class BookList {
    int id;
    String title;
    boolean read;

    BookList(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void MarkDone() {
        this.read = true;
    }

    @Override
    public String toString() {
        return id + " " + title + " [" + (read ? "x" : " ") + "]";
    }

}