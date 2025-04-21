public class FirstRepeatingNum{
    public static void main(String[] args){
        int arr[]={1,2,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("First repeating num:"+arr[i]);
                    return;
                }
            }
        }
        System.out.println("No repeating number");
    }
}