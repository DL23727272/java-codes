import java.util.*;

public class prac2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float numOne = scan.nextFloat();

        System.out.print("Enter second number: ");
        float numTwo = scan.nextFloat();

        // Import prac1 class and use the add function
        float answer = prac1.add(numOne, numTwo);

        System.out.println("The sum is: " + answer);
    }
}
