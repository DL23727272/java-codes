import java.util.*;

public class j31 {
    public static void main(String[] args) {
        Scanner DL = new Scanner(System.in);
        
        System.out.print("Enter a num: ");
        int num = DL.nextInt();

     
        int x, y;
        for (x = num; x >=  1; x-- ){
            for (y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
