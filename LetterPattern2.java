public class LetterPattern2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
               
                char ch = (char) ('A' + n - 1 - i);
                for (int j = 0; j < n - i; j++) {
                    System.out.print(ch-- + " ");
                }
            } else {
                
                char ch = 'A';
                for (int j = 0; j < n - i; j++) {
                    System.out.print(ch++ + " ");
                }
            }
            System.out.println();
        }
    }
}
