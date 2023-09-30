//ORVIE S. TOLOSA
package TOLOSA
;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        int sumPositive = 0;
        int largestPositive = Integer.MIN_VALUE;
        int largestNegative = Integer.MIN_VALUE;
        int lowestPositive = Integer.MAX_VALUE;
        int lowestNegative = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            int number = array[i];

            if (number > 0) {
                sumPositive += number;
                if (number > largestPositive) {
                    largestPositive = number;
                }
                if (number < lowestPositive) {
                    lowestPositive = number;
                }
            } else if (number < 0) {
                if (number > largestNegative) {
                    largestNegative = number;
                }
                if (number < lowestNegative) {
                    lowestNegative = number;
                }
            }
        }
      
        
           System.out.println("Sum of positive numbers: " + sumPositive);
        System.out.println("Largest positive number: " + largestPositive);
        System.out.println("Largest negative number: " + lowestNegative);
        System.out.println("Lowest positive number: " + lowestPositive);
        System.out.println("Lowest negative number: " + largestNegative);

        scanner.close();
    }
}