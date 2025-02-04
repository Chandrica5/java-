import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The roots are imaginary");
        }
    }
}
