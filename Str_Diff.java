public class Str_Diff{
public static void main(String[] args){
String s1 = "something";
String s2 = "else";
char[] c1 = s1.toCharArray();
char[] c2 = s2.toCharArray();
String result="";
for(int i=0;i<c1.length;i++){
Boolean found=false;
for(int j=0;j<c2.length;j++){
if(c1[i]==c2[j]){
found=true;
}
}
if (!found) {
result += c1[i];
}
}
System.out.println(result);
}
}

