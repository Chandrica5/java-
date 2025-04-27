public class SumNonprime {
public static void main(String[] args){
int arr[] = {10,20,30,40,50,60,70,80,90,100};
int n=arr.length;
int sum=0;
for(int i=0;i<n;i++){
if(i==0||i==1||i==4||i==6||i==8||i==9){
sum += arr[i];
}
}
System.out.println("Sum:"+sum);
}
}
