package publication;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== 1. Перевизначення методу та super ===");

        Book book = new Book(
                "Місто",
                "Валер'ян Підмогильний"
        );

        book.describe();


        System.out.println("\n=== 2. Порядок виклику конструкторів ===");

        Magazine magazine = new Magazine(
                "Наука і суспільство",
                10
        );

        magazine.describe();


        System.out.println("\n=== 3. Поліморфізм ===");

        Publication publication = new Book(
                "Танці з кістками",
                "Андрій Сем'янків"
        );

        System.out.println("Поле label: " + publication.label);

        System.out.println("Метод describe():");
        publication.describe();


        System.out.println("\n=== 4. Інший похідний клас ===");

        Publication publication2 = new Magazine(
                "Всесвіт",
                5
        );

        System.out.println("Поле label: " + publication2.label);

        System.out.println("Метод describe():");
        publication2.describe();


        //Book wrongBook = new Publication("Публікація");
    }
}