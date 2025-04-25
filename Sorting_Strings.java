public class Sorting_Strings{
public static void main(String[] args){
String s="zaabyx";
char[] c = s.toCharArray();
for(int i=0;i<c.length-1;i++){
if(c[i]>c[i+1]){
char temp=c[i];
c[i]=c[i+1];
c[i+1]=temp;
i=-1;
}
}
System.out.println("Sorted String:"+new String (c));
}
}