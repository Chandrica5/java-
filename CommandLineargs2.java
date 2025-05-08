public class CommandLineargs2{
public static void main(String[] args){
if(args.length!=1){
System.out.println("enter atleast 1 string");
}
String name = args[0];
System.out.println(" Welcome "+name);
}
}
