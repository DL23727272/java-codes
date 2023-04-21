import java.util.ArrayList;
import java.util.List;
import java.io.*;

// Gamoso, DL
// EL4 Assignment

public class act2 {
    public static void main(String... args) throws IOException {
        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));

        int size = 3, nums, sum = 0, product = 0, modulus = 0;
        
        System.out.println("\nAssignment of DL GAMOSO");
       /*  System.out.print("\nEnter the list size: ");
        size = Integer.parseInt(DL.readLine());*/

        List<Integer> numbers = new ArrayList<>(); // creates an empty list of Integers using an ArrayList

        System.out.println("Enter [10, 30, 20] in the list:");
        for (int i = 0; i < size; i++) {
            nums = Integer.parseInt(DL.readLine());
            numbers.add(nums);
            
        } 
            sum = numbers.get(0) + numbers.get(1); // sum of the first two numbers
            product = numbers.get(0) * numbers.get(2); // product of first and third number
            modulus = numbers.get(0) % numbers.get(1); // modulus of the first two numbers
        
         
        if(sum > numbers.get(0) ){
            System.out.println("\nGREAT");
            System.out.println("Sum of the first two numbers: " + sum);
        }
        else if(product < numbers.get(1) ){
            System.out.println("\nLESS");
            System.out.println("Product:" + product);
        }
        else if(modulus < 5 ){
            System.out.println("\nFIVE");
            System.out.println("Remainder:" + modulus);
        }
        else{
            System.out.println("DONE");
        }
      
    }
}
