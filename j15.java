import java.util.Scanner;

public class j15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char choice;

        do {

            System.out.println("Enter your First Grade:");
            int First = scan.nextInt();

            System.out.println("Enter your Second Grade:");
            int Second = scan.nextInt();

            System.out.println("Enter your Final Grade:");
            int Final = scan.nextInt();

            int avg = (First + Second + Final) / 3;
            {
                System.out.println(" ");
            }
            {
                System.out.println("Your General Average is: " + avg);
            }
            {
                System.out.println(" ");
            }

            if (avg >= 90) {
                System.out.print("Your Grade is A\n");
            } else if (avg >= 70 && avg < 90) {
                System.out.print("Your Grade is B\n");
            } else if (avg >= 50 && avg < 70) {
                System.out.print("Your Grade is C\n");
            } else if (avg < 50) {
                System.out.print("Your Grade is D\n");
            }

            {
                System.out.println(" ");
            }
            {
                System.out.println("Grade: ");
            }

            {
                System.out.println("50 - 70 -- Failed");
            }
            {
                System.out.println("70 - 79 -- Below average");
            }
            {
                System.out.println("80 - 89 -- Above average");
            }
            {
                System.out.println("90 & Above -- Outstanding Performance");
            }

            System.out.print("Compute again? : ");

            choice = scan.next().charAt(0);

        }

        while (choice == 'y' || choice == 'Y');

    }

}