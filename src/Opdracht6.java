import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("five scores: ");
        String scores = scanner.nextLine();
        String[] scorelist = scores.split(" ");
        int[] list = new int[scorelist.length];
        for (int i = 0; i < scorelist.length; i++){
            list[i] = Integer.valueOf(scorelist[i]);
        }
        int x = 0;
        for (int j = 0; j < list.length; j++){
            if (list[j] > 7) {
                x = x + 1;
            }
        }

        System.out.println("numbers greater than 7 =" + x);
    }
}
