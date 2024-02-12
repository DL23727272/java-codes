import java.util.*;
public class j27 {
    public static void main(String[] args) {
        Scanner DL = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = DL.nextInt();
        System.out.print("Ascending: ");
        for(int i = 1 ; i <= num; i++){
            System.out.print(i + " ");
           
        }
        System.out.print("\nDescending: ");
        for(int j = num  ; j >= 1; j--){
            System.out.print(j + " ");
           
        }
    }
}
