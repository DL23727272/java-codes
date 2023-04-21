import java.util.Scanner;

public class J17 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        {
            int num1;
            System.out.println("Input first number: ");
            num1 = scan.nextInt();

            int num2;
            System.out.println("Input second number: ");
            num2 = scan.nextInt();

            int num3;
            System.out.println("Input third number: ");
            num3 = scan.nextInt();

            System.out.println("The average is: " + (num1 + num2 + num3) / 3);

        }
    }
}