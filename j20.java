import java.util.Scanner;

public class j20 {
    public static void main(String args[]) {

         Scanner DL= new Scanner(System.in);
         
         System.out.println("Enter a number: ");
         int num = DL.nextInt();

         for(int x=1; x <= num; x++){
            System.out.println(x);
         }
    }
}
