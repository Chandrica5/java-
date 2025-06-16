import java.util.*;
public class SteppingNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        
        int nums = sc.nextInt();
        String s = String.valueOf(nums);
        int len = s.length();
        
        boolean isStepping = true;   
        
        for(int i = 0; i < len - 1; i++) {
            if(s.charAt(i + 1)-s.charAt(i) !=1) {
                isStepping = false;
                break; 
            }
        }
        
        if(isStepping) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
