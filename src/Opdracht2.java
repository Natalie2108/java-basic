import java.util.Scanner;

public class Opdracht2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature (C): ");
        double Celsius = scanner.nextInt();
        double Fahrenheit = 1.8 * Celsius + 32;
        System.out.println("Temperature (Fahrenheit)= " + Fahrenheit);
    }
    }
