public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.setTitle("The War of Art");
        firstBook.setAuthor("Forgot his Name lol ");
        firstBook.setId(1);
        System.out.println("The Book #" + firstBook.getId() + " Title is: " + firstBook.getTitle() + " The Author is "
                + firstBook.getAuthor());
    }

}
