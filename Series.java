public class Series{
public static void main(String[] args){
int input1=1,input2=3,input3=6,input4=19;
int current = input1;
int diff1 = input2-input1;
int diff2 = input3-input2;
for(int i=0;i<input4;i++){
if(i%2!=0){
current += diff1;
} else{
current += diff2;
}
}
System.out.println(current);
}
}
