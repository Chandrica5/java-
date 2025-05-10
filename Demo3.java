import java.util.Scanner;
public class Demo3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Str:");
String s = sc.nextLine();
int n = s.length();
String c = (s.charAt(0)+""+s.charAt(1)).repeat(n);
System.out.println(c);
}
}