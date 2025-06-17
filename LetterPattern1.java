public class LetterPattern1{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            char ch = (char)('E'-i);
            for(char j=ch;j>='A';j--){
                
                System.out.print(j);
            }
            System.out.println();
        }
    }
}