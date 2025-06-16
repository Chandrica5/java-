import java.util.*;
public class ReverseNum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int rev = 0 ;
while(num>0){
num = num%10;
rev = num*10+rev;
num = num/10;
}
System.out.println("reversed num:");
System.out.println(num);
sc.close();
}
}