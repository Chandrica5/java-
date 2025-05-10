import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // e.g., hello,world
        String[] words = input.split(",");
        System.out.println((words[0] + words[1]).toLowerCase());
    }
}
