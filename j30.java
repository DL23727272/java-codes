import java.util.*;

public class j30 {
    public static void main(String[] args) {
        Scanner DL = new Scanner(System.in);

        int x, y;
        for (x = 1; x <= 6; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
