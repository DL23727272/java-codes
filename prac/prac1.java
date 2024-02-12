import java.util.*;
public class prac1{

    public static float add(float numOne, float numTwo){
        return (numOne + numTwo);
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float numOne = scan.nextFloat();

        System.out.print("Enter second number: ");
        float numTwo = scan.nextFloat();

        float answer = add(numOne, numTwo);

        System.out.println(answer);


    }
}