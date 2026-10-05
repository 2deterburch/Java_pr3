package publication;

public class Book extends Publication {

    public String label = "Книга";

    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
        System.out.println("[Book] конструктор");
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Автор книги: " + author);
    }
}