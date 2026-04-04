public class Main {
    public static void main(String[] args) {
        BookList firstBook = new BookList(1, "The War of Art");
        firstBook.MarkDone();
        System.out.println(firstBook);
    }

}