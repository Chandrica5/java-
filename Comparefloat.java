import java.util.Scanner;
public class Comparefloat {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        float num1 = Scanner.nextFloat();
        System.out.print("Enter the second float number: ");
        float num2 = Scanner.nextFloat();
        if (Math.round(num1 * 1000) == Math.round(num2 * 1000)) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are not equal up to three decimal places.");
        }
    }
}