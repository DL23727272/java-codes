import java.util.Scanner;

class Process{

    //method
    void logInProcess(String name) {
        if (name.equals("DL")) {
            System.out.println("Logged in");
        } 
        else if (name.equals("Angela")) {
            System.out.println("Logged in");
        } 
        else {
            System.out.println("Not logged in");
        }
    }

}

public class j34 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String name = scanner.nextLine();

        Process loginMethod = new Process(); //calling the class which has a method
        loginMethod.logInProcess(name);
    }

}
