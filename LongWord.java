public class LongWord{
public static void main(String[] args){
String s="internationalization";
int n = s.length();
String ans= "";
for(int i=0;i<n;i++){
char c = s.charAt(i);
if(n>10){
ans = s.charAt(0)+Integer.toString(n-2)+s.charAt(n-1);
}
else{
ans = s;
}
}
System.out.println("ans:"+ans);
}
}
