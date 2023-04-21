import java.util.Scanner;

public class J3 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Type your height in Feet");
        System.out.println("Feet : ");
        double Feet = in.nextDouble();
        System.out.println("Inches : ");
        double Inches = in.nextDouble();

        System.out.println("This is your height in centimeters: " + (30.48 * Feet + 2.54 * Inches));

    }
}
