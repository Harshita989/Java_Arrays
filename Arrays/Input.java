import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Elements are");
        // for (int j : arr) {
        // System.out.println(j);

        // }
        System.out.println(Arrays.toString(arr));

    }
}
