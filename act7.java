import java.util.Scanner;
public class act7 {
    public static void main(String[] args) {

        Scanner DL = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = DL.nextInt();

        System.out.println();
        if(x > 0){
            System.out.println("Positive Number");
        }
        else if(x < 0){
            System.out.println("Negative Number");
        }
        else if(x == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Error");
        }



    }
}
