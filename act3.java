import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class act3 {
    public static void main(String... args) throws IOException {
        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));
/* 
        int size, nums, sum = 0;
        System.out.print("\nEnter the list size: ");
        size = Integer.parseInt(DL.readLine());

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers in the list:");
        for (int i = 0; i < size; i++) {
            nums = Integer.parseInt(DL.readLine());
            numbers.add(nums);
            sum += nums;
            
            // add the first two numbers
            if (i == 1) {
                sum = numbers.get(0) + numbers.get(1);
                int modulus = numbers.get(0) % numbers.get(1);
                System.out.println("Modulus of the first two numbers: " + modulus);
                if (modulus < 5) {
                    System.out.println("Five");
                }
            }
        }
        System.out.println("Numbers in the list: " + numbers);
        System.out.println("Sum of the first two numbers: " + sum);*/

        /* 
        int num1 = 10;
        int num2 = 30;
        int num3 = 20;

        // Conditional statement with the given conditions and outputs
        if (num1 + num2 > num1) {
            System.out.println("GREAT");
        } else if (num1 * num3 < num2) {
            System.out.println("LESS");
        } else if (num1 % num2 < 5) {
            System.out.println("FIVE");
        } else {
            System.out.println("DONE");
        }*/

        
        /* 
        int[] nums = {10, 30, 20};
        
        if (nums[0] + nums[1] > nums[0]) {
            System.out.println("GREAT");
        } else if (nums[0] * nums[2] < nums[1]) {
            System.out.println("LESS");
        } else if (nums[0] % nums[1] < 5) {
            System.out.println("FIVE");
        } else {
            System.out.println("DONE");
        }*/

        int[] list = {10, 30, 20};

        int sum = 0, product = 0, remainder = 0;

        sum = list[0] + list[1];
        product = list[0] * list[2];
        remainder = list[0] % list[1];

        if ( sum > list[0]) {
            System.out.println("GREAT");
        } else if (product < list[1]) {
            System.out.println("LESS");
        } else if ( remainder < 5) {
            System.out.println("FIVE");
        } else {
            System.out.println("DONE");
        }


    }
    }


