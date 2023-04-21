
import java.io.*;

public class search {
    private static int binarySearch(int[] number, int search) {
        int low = 0;
        int high = number.length - 1;

        do {
            int mid = low + (high - low) / 2;
            int value = number[mid];

            // System.out.println("mid: " + value);

            if (value < search) {
                low = mid + 1;
            } else if (value > search) {
                high = mid - 1;
            } else {
                return mid;
            }
        } while (high >= low);
        return -1;
    }

    private static int linearSearch(int[] arr, int num) {
        int i = 0;
        do {
            if (arr[i] == num) {
                return i;
            }
            i++;
        } while (i < arr.length);
        return -1;
    }

    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int n;
        System.out.print("Enter number range from 1 to: ");

        n = Integer.parseInt(br.readLine());

      

        int[] number = new int[n];
        System.out.println("The numbers range from 1 to  " + n);
        System.out.print("\nEnter a number to find: ");
        int search = Integer.parseInt(br.readLine());

        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }

        int binary = binarySearch(number, search);

        if (binary != -1) {
            System.out.println(binary + " is found using Binary Search");
        } else {
            System.out.println("Element not found");
        }

        int linear = linearSearch(number, search);

        if (linear != -1) {
            System.out.println(linear + " is found using Linear Search");
        } else {
            System.out.println("Element not found");
        }
    }
}