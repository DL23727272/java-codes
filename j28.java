import java.util.*;

public class j28 {
    public static void main(String[] args) {
        Scanner DL = new Scanner(System.in);


        System.out.print("Enter a multiplier: ");
        int multiplier = DL.nextInt();

        System.out.print("Enter a range: ");
        int range = DL.nextInt();

        System.out.print("Ascending: ");
        for (int i = 1; i <= range; i++) {
            int as = i * multiplier;
            System.out.print( as + " ");
        }

        System.out.print("\nDescending: ");
        for (int j = range; j >= 1; j--) {
            int des = j * multiplier ;
            System.out.print( des + " ");
        }
    }
}
