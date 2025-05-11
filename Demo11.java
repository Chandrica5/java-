import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Str:");
        String s = sc.nextLine();
        String result = "";

        int index = 0;
        
        while ((index = s.indexOf("XY", index)) != -1) {
            
            if (index > 0) result += s.charAt(index - 1);
           
            if (index + 2 < s.length()) result += s.charAt(index + 2);
            
           
            index += 2;
        }

        System.out.println(result);
    }
}
