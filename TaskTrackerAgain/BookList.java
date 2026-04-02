public class BookList {
    int id;
    String title;
    boolean read;

    BookList(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void MarkDone() {
        this.read = true;
    }

    public String toString() {
        return id + " " + title + " [" + (read ? "x" : " ") + "]";
    }

}