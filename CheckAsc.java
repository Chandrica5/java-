import java.util.*;
public class CheckAsc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        
        int nums = sc.nextInt();
        String s = String.valueOf(nums);
        int len = s.length();
        
        boolean isAscending = true;  
        
        for(int i = 0; i < len - 1; i++) {
            if(s.charAt(i) >= s.charAt(i + 1)) {
                isAscending = false;
                break;  
            }
        }
        
        if(isAscending) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
