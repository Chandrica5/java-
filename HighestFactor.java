import java.util.Scanner;
public class HighestFactor{
public static int highestfactor(int n){
	if(n==0|| n==1){
		return n;
	}
	for(int i = n/2; i>=1; i--){
		if(n%i==0){
			return i;
		}
	}
	return n;
}
public static void main(String[] args){
	Scanner scanner= new Scanner(System.in);
	System.out.println("num:");
	String num=scanner.next();
	String result="";
	for(char c: num.toCharArray()){
		int digit=c-'0';
		result+= highestfactor(digit);
	}
	System.out.println("ans:"+result);
	scanner.close();
}
}