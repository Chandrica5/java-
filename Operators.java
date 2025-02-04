import java.util.Scanner;
class Operators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for A: ");
        int a = sc.nextInt();
        System.out.println("Enter a value for B: ");
        int b = sc.nextInt();

        //Arithmetic Operators
        System.out.println("Addition : " +(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));

        //Assignment Operators
        System.out.println("Add and Assign: " +(a+=b));
        System.out.println("Subtract and Assign: "+(a-=b));
        System.out.println("Multiply and Assign: "+(a*=b));
        System.out.println("Divide and Assign: "+(a/=b));
        System.out.println("Modulus and Assign: "+(a%=b));

        //Relational Operators
        System.out.println("Equal to: " +(a==b));
        System.out.println("Not equal to: "+(a!=b));
        System.out.println("Less than: "+(a<b));
        System.out.println("Less than or equal to: "+(a<=b));
        System.out.println("Greater than: "+(a>b));
        System.out.println("Greater than or equal to: "+(a>=b));

        //Logical Operators
        System.out.println("Logical AND: "+(a>b && a>=b));
        System.out.println("Logical OR: "+(a>b || a>=b));
        System.out.println("Logical NOT: "+!(a>b));

        //Unary Operators
        System.out.println("Pre-Increment(a): "+(++a));
        System.out.println("Pre-Increment(b): "+(++b));
        System.out.println("Post-Increment(a): "+(a++));
        System.out.println("Post-Increment(b): "+(b++));
        System.out.println("Pre-Decrement(a): "+(--a));
        System.out.println("Pre-Decrement(b): "+(--b));
        System.out.println("Post-Decrement(a): "+(a--));
        System.out.println("Post-Decrement(b): "+(b--));

        //Bitwise Operators
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println(("Bitwise OR: "+(a|b)));
        System.out.println("Bitwise XOR: "+(a^b));

        //Shift Operators
        System.out.println("Left Shift: "+(a<<b));
        System.out.println(("Right Shift: "+(a>>b)));
        System.out.println(("Unsigned Right Shift: "+(a>>>b)));
    }
}