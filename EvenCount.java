import java.util.*;
public class EvenCount{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("num:");

int nums = sc.nextInt();
String s = String.valueOf(nums);
StringBuilder sb = new StringBuilder();
int len = s.length();

int[] oddDigits = new int[len];
int[] evenDigits = new int[len];
int oddCount=0,evenCount=0,oddSum = 0;

for(int i=0;i<len;i++){
int digit = s.charAt(i) - '0';
if(digit%2!=0){
oddDigits[oddCount++] = digit;
oddSum += digit;
} else{
evenDigits[evenCount++] = digit;
}
}

System.out.println("Rearranged num:");
for(int i=0;i<oddCount;i++){
System.out.print(oddDigits[i]);
}
for(int i=0;i<evenCount;i++){
System.out.print(evenDigits[i]);
}
System.out.println();
System.out.println("even count:"+evenCount);
sc.close();
}
}

