import java.util.Scanner;
public class Demo10{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Str:");
String s = sc.nextLine();
System.out.println("n:");
int n = sc.nextInt();
System.out.println(s.substring(s.length()-3).repeat(n));
}
}
