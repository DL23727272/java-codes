import java.util.Scanner;

public class j19 {
    public static void main(String args[]) {

        Scanner DL = new Scanner(System.in);

        System.out.println("Enter value of D: ");
        int D = DL.nextInt();

        System.out.println("Enter value of L: ");
        int L = DL.nextInt();

        System.out.println("Enter value of G: ");
        int G = DL.nextInt();

        int sum = (D + L + G);
        System.out.print("Sum is: " + sum); 
    }

}
