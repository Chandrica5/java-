import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        String a = sc.nextLine();  // Read first string
        System.out.println("b:");
        String b = sc.nextLine();  // Read second string
        
        String result = "";  // Initialize the result string
        int i = 0;

        // Loop to alternate characters
        while (i < a.length() && i < b.length()) {
            result += a.charAt(i);  // Add character from 'a'
            result += b.charAt(i);  // Add character from 'b'
            i++;
        }

        // Append the remaining parts of the longer string
        result = result + a.substring(i) + b.substring(i);

        System.out.println(result);  // Print the final result
    }
}
