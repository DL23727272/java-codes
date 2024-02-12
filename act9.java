import java.util.Scanner;
public class act9 {

    public static void main(String args[]) {
        
        Scanner DL = new Scanner(System.in);
        
        System.out.print("Enter a First Number: ");
        int numOne = DL.nextInt();

        System.out.print("Enter a Second Number: ");
        int numTwo = DL.nextInt();

        numOne += numTwo;
        
        int nOne = 1;
        int nTwo = 2;

        nOne += nTwo;
        
        System.out.println(nOne);
        System.out.print(numOne);


    }
    
}
