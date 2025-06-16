import java.util.*;

public class CyclicSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        
        int nums = sc.nextInt();
        String s = Integer.toString(nums);
        int ts = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int sum = 0;
            for(int j = i; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            ts += sum;
        }
        
        System.out.println("Total sum: " + ts);
        sc.close();
    }
}
