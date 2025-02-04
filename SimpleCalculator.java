import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter an operation (a for addition, s for subtraction, m for multiplication, d for division, u for modulus): ");
        char operation = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int result = 0;
        boolean validOperation = true;

        switch (operation) {
            case 'a': result = num1 + num2; break;
            case 's': result = num1 - num2; break;
            case 'm': result = num1 * num2; break;
            case 'd': 
                if (num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Error! Division by zero.");
                    validOperation = false;
                }
                break;
            case 'u': 
                if (num2 != 0) result = num1 % num2;
                else {
                    System.out.println("Error! Modulus by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println(num1 + "" + operation + "" + num2 + " = " + result);
        }
        
        scanner.close();
    }
}
