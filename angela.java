import java.util.Scanner;

public class angela {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = scan.nextInt();

        switch (age) {
            case 0:
            case 1:
                System.out.println("Infant");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Child");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Adolescent");
            default: 
                System.out.println("Adult");
                break;
        }
    }
}
