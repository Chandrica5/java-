public class WordCount{
    public static void main(String[] args){
        String s="I am an Indian";
        String ss=s.trim();
        int wc=1;
        for(int i=0;i<s.length();i++){
            char ch = ss.charAt(i);
            if(ch==' '){
                wc++;
            }
        }
        System.out.println("Count:"+wc);
    }
}