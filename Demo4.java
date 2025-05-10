import java.util.Scanner;
public class Demo4{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("str:");
String s = sc.nextLine();
System.out.println(s.length()%2==0 ? s.substring(0,s.length()/2) : "null");
}
}
