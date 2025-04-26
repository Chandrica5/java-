import java.util.Scanner;
import java.util.Arrays;
public class ArrangeLetters{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter the sentence:");
String sentence = sc.nextLine();
String[] words=sentence.split(" ");
for(String word : words){
char[] letters = word.toCharArray();
Arrays.sort(letters);
System.out.println(new String(letters)+"");
}
}
}