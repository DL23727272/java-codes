import java.util.Scanner;

public class loop22 {

    public static void main(String[] args) {
        int loop = 0;
        do {
            Scanner DL = new Scanner(System.in);
            System.out.println("Press 1 for Addition: ");
            System.out.println("Press 2 for Subtraction: ");
            System.out.println("Press 3 for Multiplication: ");
            System.out.println("Press 4 for Division: ");
            System.out.print("Input your choice: ");
            int select = DL.nextInt();

            System.out.println("Enter First Number: ");
            double num1 = DL.nextDouble();

            System.out.println("Enter Second Number: ");
            double num2 = DL.nextDouble();

            if (select == 1) {

                double result = (num1 + num2);
                System.out.println("You Have Selected Addition : ");
                System.out.println("The Sum is : " + result);

            } else if (select == 2) {

                double result = (num1 - num2);
                System.out.println("You Have Selected Subtraction : ");
                System.out.println("The Difference is : " + result);

            } else if (select == 3) {

                double result = (num1 * num2);
                System.out.println("You Have Selected Multiplication : ");
                System.out.println("The Product is : " + result);

            } else if (select == 4) {

                double result = (double) num1 / num2;
                System.out.println("You Have Selected Division : ");
                System.out.println("The Quotient is : " + result);

            }
              double result = (double)(num1 + num2)/2;
               System.out.print("The Average is: " + result);
                
               System.out.println("");

            System.out.println("Enter (Y) to compute, otherwise, press any key to exit.\n");
            System.out.print("Do You want to Compute Again: ");
            char key = DL.next().charAt(0);

            if (key == 'y' || key == 'Y') {
                loop++;
            } 
            else {
                System.out.println("\n! Invalid input ");
                System.out.println("EXIT ...");
                System.exit(0);
            }
        } while (loop >= 1);

    }

}
