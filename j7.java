import java.util.Scanner;

public class j7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner ln = new Scanner(System.in);

        System.out.println("Enter your Firstname:");
        String Firstname = ln.nextLine();

        System.out.println("Enter your Lastname");
        String Lastname = ln.nextLine();

        System.out.println("Your first name is " + Firstname + ", which has" + Firstname.length() + "characters.");
        System.out.println("Your first name is " + Lastname + ", which has" + Lastname.length() + "characters.");
    }

}