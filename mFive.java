import java.io.*;
import java.util.*;

/*
1 problem and solution for an ARRAY
Menu for a Restaurant
 Gamoso DL
 
 */
class mFive {
    public static void main(String... args) throws IOException {

        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));
        String firstName, lastName, nameOfRestaurant = "Helios Eatery";
        System.out.print("Enter Your First Name: ");
        firstName = DL.readLine();
        System.out.print("Enter Your Last Name: ");
        lastName = DL.readLine();

        System.out.println("\nWelcome to " + nameOfRestaurant + ", " + firstName + " " + lastName + "\n");

        String[] products = { "Coke", "Sting", "Turon", "Water", "Sandwich" };
        int[] price = { 20, 25, 5, 20, 24 };

        System.out.printf("%-10s %s\n", "Products", "Price");
        System.out.println("---------------");

        
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%-10s %2d\n",products[i], price[i]);
        }

    }
}
