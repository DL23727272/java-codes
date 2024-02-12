import java.util.Scanner;

public class order {
    public static int count;
    public static double total, pay, change;

    public static void menu() {
        System.out.println("=============================================");
        System.out.println("         BT21 PRODUCTS        ");
        System.out.println("(Product)-------------(Prices)");
        System.out.println("1. Tata---------------Php500.00");
        System.out.println("2. Cookie-------------Php600.00");
        System.out.println("3. Chimmy-------------Php550.00");
        System.out.println("=============================================");
    }

    public static void main(String[] args) {
        Scanner gela = new Scanner(System.in);
        String fname, lname;

        System.out.print("Enter your First Name: ");
        fname = gela.nextLine();

        System.out.print("Enter your Last Name: ");
        lname = gela.nextLine();

        System.out.println("\nWelcome to BT21 Shop, " + fname + " " + lname + "!");
        menu();

        System.out.print("Enter your order count: ");
        count = gela.nextInt();

        String[] product = new String[count];
        Double[] quantity = new Double[count];
        double[] price = new double[count];
        double[] output = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("\nProduct Name: ");
            product[i] = gela.next();

            System.out.print("Quantity: ");
            quantity[i] = gela.nextDouble();

            System.out.print("Price: ");
            price[i] = gela.nextDouble();
        }

        

        System.out.println("\n=============================================");
        System.out.println("Order Details");
        System.out.println("PRODUCT \t\t QTY. \t\t PRICE");

        for (int i = 0; i < count; i++) {
            System.out.println(product[i] + "\t\t\t " + quantity[i] + " \t\t" + price[i]);
            output[i] = quantity[i] * price[i];
            total += output[i];
        }
        System.out.print("\nEnter payment: ");
        pay = gela.nextDouble();

        if (pay < total) {
            System.out.println("Not enough payment! Your total is " + total + ".");
            System.out.print("Enter payment: ");
            pay = gela.nextDouble();
            if (pay < total) {
                System.out.println("Not enough payment! Your total is " + total + ".");
                System.out.print("Enter payment: ");
                pay = gela.nextDouble();
            }
            else if(pay >= total){
            System.out.println("=============================================");
            System.out.println("Thank you for shopping with us, " + fname + "!");
            System.out.println("Your cash is " + pay);
            System.out.println("Your total order amount is " + total);
            change = pay - total;
            System.out.println("Your change is " + change);
            System.out.println("Please come again!");
            System.out.println("=============================================");
        }
        }
        else if(pay >= total){
        System.out.println("=============================================");
        System.out.println("Thank you for shopping with us, " + fname + "!");
        System.out.println("Your cash is " + pay);
        System.out.println("Your total order amount is " + total);
        change = pay - total;
        System.out.println("Your change is " + change);
        System.out.println("Please come again!");
        System.out.println("=============================================");
    }
    }
}
