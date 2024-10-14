import java.util.Arrays;
import java.util.Scanner;

public class AOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        System.out.println("Enter the Names");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();

        }
        System.out.println(Arrays.toString(str));
    }

}
