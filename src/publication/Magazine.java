package publication;

public class Magazine extends Publication {

    public String label = "Журнал";

    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
        System.out.println("[Magazine] конструктор");
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Номер журналу: " + issueNumber);
    }
}