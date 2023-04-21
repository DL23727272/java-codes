
import java.util.Scanner;

public class J8 {
    public static void main(String[] args) {

        String user_name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        user_name = sc.nextLine();

        if (user_name.equals("DL")) {
            System.out.println("You are logged in as: " + user_name);
        } else {
            System.out.println("The username you entered is invalid!");
        }

    }

}
