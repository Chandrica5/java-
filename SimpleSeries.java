public class SimpleSeries{
    public static void main(String[] args){
        int a=1,b=3,c=6,n=17;
        int diff1=b-a;
        int diff2=c-b;
        int current=a;
        for(int i=0;i<n;i++){
            if(i%2==1){
                current = current+diff1;
                
            }
            else{
                current = current+diff2;
            }
        }
        System.out.println(n+"th element is:"+current);
    }
}