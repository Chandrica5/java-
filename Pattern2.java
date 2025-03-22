class Pattern2 {
    public static void main(String[] args) {
        int n = 7; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                
                if (j == n - i || j == n + i || (i == n / 2 && j > n - i && j < n + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
