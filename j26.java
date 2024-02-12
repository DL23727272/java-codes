import java.util.*;
public class j26 {
    public static void main(String[] args) {
        Scanner DL = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter a number: ");
        int num = DL.nextInt();

        for(int i = 1 ; i <= num; i++){
            System.out.println(i);
            sum += i;
        }
       
        System.out.println("The sum of 1 to " + num + "is: " + sum);
    }
}
