import java.util.Scanner;
public class Demo7{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Str:");
String s = sc.nextLine();
if(s.charAt(0)=='x'&&s.charAt(s.length()-1)=='x'){
System.out.println(s.substring(1,s.length()-1));
}
else{
System.out.println(s);
}
}
}