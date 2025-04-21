public class Count {
    public static void main(String[] args) {
        String s = "engin@eering11";
        int vc = 0, c = 0, num = 0, sp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vc += 1;  
                } else {
                    c += 1;  
                }
            }
            else if (ch >= 48 && ch <= 57) {
                num += 1;  
            }
            else {
                sp += 1;  
            }
        }
        System.out.println("Vowel count: " + vc);
        System.out.println("Consonant count: " + c);
        System.out.println("Number count: " + num);
        System.out.println("Special character count: " + sp);
    }
}
