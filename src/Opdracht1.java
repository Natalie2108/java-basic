import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("article: ");
                String article = scanner.nextLine();
        System.out.println("noun: ");
                String noun = scanner.nextLine();
        System.out.println("verb: ");
                String verb = scanner.nextLine();

        System.out.println(article + " " + noun + " " + verb);
    }
}
