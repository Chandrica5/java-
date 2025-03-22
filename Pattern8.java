class Pattern8 {
    public static void main(String[] args) {
        int n = 8; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n+1; j++) { 
                
                if (j == 0 ||  
                    (j==n-1 ||
					(i==n/2-1 &&j<n-1))
					{ 
                    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
