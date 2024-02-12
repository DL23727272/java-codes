import java.util.Scanner;

public class j33 {
    public static void main(String[] args) {
        Scanner DL = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = DL.nextDouble();

        int num2 = (int) num; // set the num to to the value of the num1 or the num
        double result = num2 - num;
        //if the num is not equal to 0 it is not a whole number

        if (result == 0) {
            System.out.println("The number is a whole number");
        } else {
            System.out.println("The number is not a whole number");
        }
    }
}
