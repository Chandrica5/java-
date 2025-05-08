import java.util.Scanner;
public class AlphabetOrder{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter c1:");
char c1 = sc.nextLine().charAt(0);
System.out.println("enter c2:");
char c2 = sc.nextLine().charAt(0);
if(c1<c2){
System.out.println(c1+","+c2);
}
else{
System.out.println(c2+","+c1);
}
}
}
