import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Opdracht8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("three numbers: ");
        String numbers = scanner.nextLine();
        String[] numberlist = numbers.split(" ");
        int[] list = new int[numberlist.length];
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.valueOf(numberlist[i]);
        }
        int x = 0;
        for (int j = 0; j < list.length - 1; j++) {
            if (list[j] > list[j + 1]) {
               x = list[j];
            }
            else {x = list[j + 1];}
        }
        if (list[0] > x){
            x = list [0];
        }

        System.out.print(x);
    }
}
