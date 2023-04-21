import java.util.Scanner;

public class j6 {

    public static void main(String[] args) {

        String DL, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Name to reverse:");
        DL = in.nextLine();

        int length = DL.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + DL.charAt(i);

        System.out.println("Reversed: ");
        System.out.println(reverse);

    }

}
