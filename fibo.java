//3
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

        try (Scanner DL = new Scanner (System.in)) {
            System.out.print("Input Terms: ");
            int term = DL.nextInt();

            int t1 = 0, t2 = 1;

            System.out.println("fibonacci of " + term + " terms:");
            
            for (int i = 1; i <= term; ++i){
               
                System.out.print(t1);
                if (i < term){
                    System.out.print(" + ");
                }

                int nt = t1 + t2;
                t1 = t2;
                t2 = nt;
            }
        }
        
    }

}
