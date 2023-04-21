import java.util.Scanner;

public class j23 {

    public static void main(String[] args) {

        Scanner DL = new Scanner(System.in); {
            {
               double num1;
               System.out.println("Input first number: ");
               num1 = DL.nextDouble();

               double num2;
               System.out.println("Input second number: ");
               num2 = DL.nextDouble();

               System.out.println("Answers");
               System.out.println("The Sum is: " + (num1 + num2));
               System.out.println("The Difference is: " + (num1 - num2));
               System.out.println("The Product is: " + (num1 * num2));
               double div = (double)num1 / num2;
               System.out.println("The Quotient is: " + div);
               double ave = (double)(num1 + num2)/2;
               System.out.print("The Average is: " + ave);
   }
        }

}
}
