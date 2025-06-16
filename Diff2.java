import java.util.*;
public class Diff2{
public static int reducedSubtracted(int num){
while(num>99){
String s = String.valueOf(num);
StringBuilder sb = new StringBuilder();
for(int i=0;i<s.length()-1;i++){
int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
sb.append(diff);
}
nums = Integer.parseInt(sb.toString());
}
return nums;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("num:");
nums = sc.nextInt();
System.out.println(reducedSubtracted(nums));
}
}
