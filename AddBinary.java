public class AddBinary {
    public static String addBinary(String a, String b) {
        int carry = 0; 
        String result = "";

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            

            if (i >= 0) sum += a.charAt(i--) - '0';
            
     
            if (j >= 0) sum += b.charAt(j--) - '0';
            
           
            result = (sum % 2) + result;
           
            carry = sum / 2;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        
        System.out.println("Sum of binary strings: " + addBinary(a, b));
    }
}
