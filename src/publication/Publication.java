package publication;

public class Publication {

    public String label = "Публікація";

    private String title;

    public Publication(String title) {
        this.title = title;
        System.out.println("[Publication] конструктор");
    }

    public void describe() {
        System.out.println("Назва публікації: " + title);
    }

    public String getTitle() {
        return title;
    }
}