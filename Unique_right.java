public class Unique_right {
    public static void main(String[] args) {
        String s = "22558991";
        char[] c = s.toCharArray();
        
        for (int i = c.length - 1; i >= 0; i--) { 
            boolean unique = true;
            for (int j = 0; j < c.length; j++) {
                if (i != j && c[i] == c[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(c[i]);
                return;
            }
        }
        
        System.out.println("-1"); 
    }
}
