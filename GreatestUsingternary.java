import java.util.Scanner;
class GreatestUsingternary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for A: ");
        int a = sc.nextInt();
        System.out.println("Enter value for B: ");
        int b = sc.nextInt();
        System.out.println("Enter value for C: ");
        int c = sc.nextInt();

        int greatest = (a > b)?(a > c ? a : b) : (b > c ? b : c);
        System.out.println("The greatest number is: "+greatest);
    }
}
