public class LenLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words=s.trim().split(" ");
        return words[words.length-1].length();
    
    }
public static void main(String[] args){
String s = "Hello World";
int len = lengthOfLastWord(s);
System.out.println("length of last word:"+len);
}
}