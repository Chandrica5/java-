 
public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 13, 16, 21, 24, 30};
        int count = 0; 
        int i = 0;

        while (i < numbers.length) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
            i++;
        }

        System.out.println("Total even numbers: " + count);
    }
}

