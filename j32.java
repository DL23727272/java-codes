import java.util.*;

public class j32 {
    public static void main(String[] args) {
        Scanner DL = new Scanner(System.in);

        System.out.print("Enter a number of rows: ");
        int num = DL.nextInt();

        int x, y;
        for (x = 1; x <= num; x++) {
            for (y = 1; y <= num - x; y++) {
                System.out.print("  "); // Print spaces for indentation
            }
            for (y = 1; y <= 2 * x - 1; y++) {
                System.out.print("* "); // Print asterisks
            }
            System.out.println();
        }
    }
}
