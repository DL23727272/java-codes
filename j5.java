import java.util.Scanner;

public class j5 {

    public static void main(String[] args) {

        Scanner ln = new Scanner(System.in);
        int i, len;
        char chr;

        System.out.println("Enter Name:");
        String str = ln.nextLine();

        len = str.length();
        for (i = 0; i < len; i++)

        {
            chr = str.charAt(i);
            System.out.println("  ");
            System.out.println(chr);
        }

    }

}
