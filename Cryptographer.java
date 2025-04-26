import java.util.Scanner;
public class Cryptographer {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the str:");
String s = sc.nextLine();
String ans="";
for(int i=0;i<s.length();i++){
char c = s.charAt(i);
if(c=='a'){
ans += 'z';
}
else{
ans += (char)(c-1);
}
}
System.out.println("Result:"+ans);
}
}