import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        
        int strLength;
        char rev;
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        strLength = name.length();

        for(int i = 0; i < strLength; i++){

            rev = name.charAt(i);
            System.out.println("  ");
            System.out.println(rev);
        }

    }
}
