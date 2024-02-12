import java.util.Scanner;

public class j4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Farenheit to Celcius & Press 2 for Celcius to Farenheit1: ");
        int select = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter Number: ");
        double number = sc2.nextInt();

        if (select == 1) {
            float c = 5 / 9;
            double result = (number - 32) * 5 / 9;
            System.out.println("You Have Selected Farenheit to Celcius : ");
            System.out.println("//Calculating//....");
            System.out.println("Answer : " + result + "°C");

        } else if (select == 2) {
            float c = 5 / 9;
            double result = (number * 9 / 5) + 32;
            System.out.println("You Have Selected Celcius to Farenheit : ");
            System.out.println("//Calculating//....");
            System.out.println("Answer : " + result + "°F");

        }
        else if (select != 1 || select != 2){
            System.out.println("Invalid Option!");
        }

    }

}
