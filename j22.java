import java.util.Scanner;

public class j22 {

  
    public static void main(String[] args) {
       
        Scanner DL = new Scanner(System.in);
        System.out.println("Press 1 for Addition, Press 2 for Subtraction, Press 3 for Multiplication, Press 4 for Division: ");
        int select = DL.nextInt();

       

        System.out.println("Enter First Number: ");
        int num1 = DL.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = DL.nextInt();

        if (select == 1) {
            
            double result = (num1 + num2);
            System.out.println("You Have Selected Addition : ");
            System.out.println("The Sum is : " + result );

        } else if (select == 2) {
            
            double result = (num1 - num2);
            System.out.println("You Have Selected Subtraction : ");
            System.out.println("The Difference is : " + result );

        }
        else if (select == 3) {
            
            double result = (num1 * num2);
            System.out.println("You Have Selected Subtraction : ");
            System.out.println("The Product is : " + result );

        }
        else if (select == 4) {
            
            double result = (double)num1 / num2;
            System.out.println("You Have Selected Division : ");
            System.out.println("The Quotient is : " + result );

        }
        
        double result = (double)(num1 + num2)/2;
        System.out.print("The Average is: " + result);

    }

}
