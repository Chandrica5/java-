public class CommandLineargs1{
public static void main(String[] args){
if(args.length!=2){
System.out.println("enter 2 strings");
}
String company = args[0];
String city = args[1];
System.out.println(company+" technologies "+city);
}
}
