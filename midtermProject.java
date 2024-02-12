import java.io.*;
import java.util.*;
//Gamoso, DL
class midtermProject {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstName, lastName, nameOfRestaurant = "Helios Eatery";
        System.out.print("Enter Your First Name: ");
        firstName =  br.readLine();
        System.out.print("Enter Your Last Name: ");
        lastName =  br.readLine();

        System.out.println("\nWelcome to " + nameOfRestaurant + ", " + firstName + " " + lastName + "\n");

        HashMap<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("Coke", 20);
        menu.put("Sting", 25);
        menu.put("Turon", 5);
        menu.put("Maruya", 12);
        menu.put("Dinosaur", 9);
        menu.put("Alien", 17);

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(menu.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        System.out.printf("%-10s %s\n", "Products", "Price");
        System.out.println("---------------");

        for (Map.Entry<String, Integer> entry : list) {
            System.out.printf("%-10s %2d\n", entry.getKey(), entry.getValue());
        }

        System.out.print("\nWould you like to order now? y/n:");
        char key = br.readLine().charAt(0);

        if(key == 'y') {
            int totalPrice = 0;
            Map<String, Integer> orders = new LinkedHashMap<String, Integer>();
             
            for (;;) {
                System.out.print("\nWhat would you like to buy? ");
                String product = br.readLine();
                System.out.print("How many " + product + " would you like? ");
                int quantity = Integer.parseInt(br.readLine());
                
                if (orders.containsKey(product)) {
                    int prevQuantity = orders.get(product);
                    orders.put(product, prevQuantity + quantity);
                } else {
                    orders.put(product, quantity);
                }

                int itemTotalPrice = menu.get(product) * quantity;
                totalPrice += itemTotalPrice;

                System.out.print("\nBuy another product? y/n:");
                char order = br.readLine().charAt(0);
                if (order == 'n') {
                    System.out.println("\nOrder Summary:");
                    System.out.println("-----------------------------");
                    System.out.printf("%-10s %5s %s\n", "Products", "Qty", "Price");
                    System.out.println("-----------------------------");

                    for (Map.Entry<String, Integer> entry : orders.entrySet()) {
                        String orderItem = entry.getKey();
                        int itemQty = entry.getValue();
                        int itemPrice = menu.get(orderItem);
                        System.out.printf("%-10s %5d %2d\n", orderItem, itemQty, itemPrice);
                    }

                    System.out.println("-----------------------------");
                    System.out.printf("%-10s %2d\n", "Total", totalPrice);
                    System.out.println("\nPlease Pay the amount: "+ totalPrice);
                    System.out.print("How much is your cash?: ");
                    int cash = Integer.parseInt(br.readLine());

                    if(cash < totalPrice){

                        System.out.println("Insuficient Funds!!");
                        System.out.println("\nPlease Pay the amount: "+ totalPrice);
                        System.out.print("How much is your cash?: ");
                        cash = Integer.parseInt(br.readLine());

                        if(cash < totalPrice){
                            System.out.println("Insuficient Funds!!");
                            System.out.println("\nPlease Pay the amount: "+ totalPrice);
                            System.out.print("How much is your cash?: ");
                            cash = Integer.parseInt(br.readLine());
                        }
                        else if(cash >= totalPrice){
                            int change = cash - totalPrice;
                            System.out.println("Ma'am/Sir "+firstName +", your total order amount is " + totalPrice + ", and your change is: " + change + ", Thank You.");
                        }
                    }
                    else if(cash >= totalPrice){
                        
                        int change = cash - totalPrice;
                        System.out.println("Ma'am/Sir "+firstName +", your total order amount is " + totalPrice + ", and your change is: " + change + ", Thank You.");
                    }
                    break;
                }
            }
        }
    }
}
