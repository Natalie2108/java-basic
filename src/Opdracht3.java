import java.util.Scanner;
import java.lang.Math;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Side 1: ");
        double side1 = scanner.nextInt();
        System.out.print("Side 2: ");
        double side2 = scanner.nextInt();
        System.out.println(Math.sqrt(side1*side1+side2*side2));

    }
}
