import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter str1:");
String s1 = sc.nextLine();
System.out.println("enter str2:");
String s2 = sc.nextLine();
char[] a1 = s1.toCharArray();
char[] a2 = s2.toCharArray();
Arrays.sort(a1);
Arrays.sort(a2);
boolean isAnagram = Arrays.equals(a1,a2);
System.out.println(isAnagram);
}
}
