public class Adding{
    public static void main(String[] args){
        String s="5et55t6j";
        int sum = 0;
        String temp="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }
            else {
                if(!temp.equals("")){
                    sum += Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if(!temp.equals("")){
            sum += Integer.parseInt(temp);
            temp="";
        }
        System.out.println("Sum:"+sum);
    }
}








