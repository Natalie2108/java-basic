import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x= ");
        double x1 = scanner.nextDouble();
        System.out.print("y= ");
        double y1 = scanner.nextDouble();
        double x;
        if ((x1 / y1) == 5.0) {x = 100; }
        else x = x1;
        if (x1 * y1 == 5) {x = 1; }
        else x = x1;
        if (x1 < y1) {x = x * 2;}
        if (x1 > y1) {x = x + 1;}
        System.out.println(x);

    }
}
