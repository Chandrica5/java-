import java.util.Scanner;
public class ReplaceOddEven{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter str:");
String s = sc.nextLine();
System.out.println("Enter choice odd or even:");
String choice = sc.nextLine().toLowerCase();
char[] arr=s.toCharArray();
String temp="";
for(int i=(choice.equals("odd")?0:1);i<arr.length;i+=2){
temp = arr[i]+temp;
}
int j=0;
for(int i=(choice.equals("odd")?0:1);i<arr.length;i+=2){
arr[i]=temp.charAt(j++);
}
System.out.println("ans:"+new String(arr));
}
}
