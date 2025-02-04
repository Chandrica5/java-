import java.util.Scanner;
class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number of an month: ");
        int year = sc.nextInt();

        if (year == 12 || year == 1 || year ==2){
            System.out.println("Season: Winter");
        }else if (year == 3 || year == 4 || year == 5){
            System.out.println("Season: Spring");
        }else if (year == 6 || year == 7 || year == 8 || year == 9){
            System.out.println("Season: Summer");
        }else if (year == 10 || year == 11){
            System.out.println("Season: Autumn");
        }else{
            System.out.println("Enter a valid number from 1 to 12");
        }
    }
}
