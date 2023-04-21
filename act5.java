import java.util.Scanner;
//Gamoso, DL
public class act5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
            int [] nums = new int[3];
          
            System.out.print("\nInput first number: ");
            nums[0] = scan.nextInt();

            System.out.print("Input second number: ");
            nums[1] = scan.nextInt();

            System.out.print("Input third number: ");
            nums[2] = scan.nextInt();

            System.out.println("\nAnswers");
            System.out.println("\nSum of the 3 integers: "+ (nums[0] + nums[1] + nums[2]));
            System.out.println("Difference of the first and third ints: " + (nums[0] - nums[2]));
            System.out.println("Quotient of the first and third ints: "+ ((double) nums[0] / nums[2]));
            System.out.println("Product of the 3 integers: " + (nums[0] * nums[1] * nums[2]));
            

        }

    }

