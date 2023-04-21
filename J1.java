import java.util.Scanner;

public class J1 {
    public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
         {
            int num1, num2;
            System.out.println("Input first number: ");
            num1 = scan.nextInt();

            System.out.println("Input second number: ");
            num2 = scan.nextInt();

            System.out.println("Answers");
            System.out.println(num1 + num2);
            System.out.println(num1 - num2);
            System.out.println(num1 * num2);
            System.out.println(num1 / num2);
           
        }

    }

}