import java.util.Arrays;
import java.util.Scanner;

public class Multidm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2]; // 2D array of size 3x2

        // Input values into the 2D array
        System.out.println("Enter the elements of the array:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt(); // Read input values
            }
        }

        // Print the 2D array
        System.out.println("The 2D array is:");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row])); // Print each row
        }

        sc.close(); // Close the scanner
    }
}
