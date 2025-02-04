import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers: ");
        int n = scanner.nextInt();
        int sum = 0;

        System.out.println("Natural Numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of natural numbers up to " + n + ": " + sum);
    }
}
