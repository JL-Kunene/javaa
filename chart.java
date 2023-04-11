import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept five numbers as input
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter number 4: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter number 5: ");
        int num5 = scanner.nextInt();

        // Create an array of the input numbers
        int[] numbers = {num1, num2, num3, num4, num5};

        // Find the maximum number in the array
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        // Loop through each number and create a bar chart using asterisks
        for (int i = maxNum; i >= 1; i--) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
