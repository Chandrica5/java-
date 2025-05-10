import java.util.Scanner;
public class Demo6{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("a:");
String a = sc.nextLine();
System.out.println("b:");
String b = sc.nextLine();
String shortstr = a.length()<b.length() ?a:b;
String longstr = a.length()>b.length()?a:b;
System.out.println(shortstr+longstr+shortstr);
}
}