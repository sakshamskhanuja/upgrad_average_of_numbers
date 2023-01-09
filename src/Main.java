import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores how many numbers are to be entered.
        int number = scanner.nextInt();

        // Stores the sum of entered numbers.
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int n = scanner.nextInt();
            sum += n;
        }

        // Prints the average.
        System.out.println(sum / number);
    }
}