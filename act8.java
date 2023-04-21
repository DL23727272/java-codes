import java.util.Scanner;

public class act8 {
    public static void main(String[] args) {

        Scanner DL = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = DL.nextInt();
        
        if (num % 2 == 0)
            System.out.println(num + " is even.");

        else{
            System.out.println(num + " is odd.");
        }
    }
}
