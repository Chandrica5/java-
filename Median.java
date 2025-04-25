public class Median{
public static void main(String[] args){
int arr[]={1,2,3,4,5,6};
int middle=0;
int n = arr.length;

for(int i=0;i<arr.length;i++){
if(n%2==0){
middle = (arr[n/2-1]+arr[n/2])/2;
}
else{
middle = arr[n/2];
}
break;
}
System.out.println("middle element:"+middle);
}
}