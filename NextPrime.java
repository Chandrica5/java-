import java.util.Scanner;

public class NextPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int nextPrime(int n) { 
        if (!isPrime(n)) { 
            System.out.println("Input is not a prime number.");
            return -1;
        }
        int nextNum = n + 1;
        while (!isPrime(nextNum)) {
            nextNum++;
        }
        return nextNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a prime number: ");
        int num = scanner.nextInt();
        int nextNum = nextPrime(num);
        if (nextNum != -1) { 
            System.out.println("Next prime number: " + nextNum);
        }
        scanner.close(); 
    }
}
