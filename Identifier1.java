public class Identifier1{
    public static void main(String[] args){
        String s="@rollno";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0){
                if(!(ch=='$' || ch=='_' || (ch>=65 && ch<=90)||(ch>=97&&ch<=122))){
                    System.out.println("Identifier is invalid");
                    break;
                }
            }
            else{
                if(!(ch=='$' || ch=='_' || (ch>=65 && ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57))){
                    System.out.println("Identifier is invalid");
                    break;
                    
                }
            }
            if(i==s.length()-1){
                System.out.println("Identifier is valid");
            }
        }
    }
}