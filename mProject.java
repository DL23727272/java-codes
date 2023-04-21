import java.io.*;
import java.util.*;

public class mProject {
    public static void main(String... args) throws IOException {
   
   BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));
   int loop = 0, choice = 0;
   do{
        String firstName, lastName, nameOfRestaurant = "DL Eatery";

        System.out.print("\nEnter Your First Name: ");
        firstName =  DL.readLine();
        System.out.print("Enter Your Last Name: ");
        lastName =  DL.readLine();

        System.out.println("\nWelcome to " + nameOfRestaurant + ", " + firstName + " " + lastName + "\n");

        String [] pName = {"Coke", "Sting", "Turon", "Water", "Sandwich"};
        int [] price = {15, 20, 20, 15, 30};

            System.out.println("\n       Menu       ");
            System.out.println("\nProducts" + "  " + "  Price");
                
            for(int i = 0; i < pName.length; i++){

                System.out.print("["+ i +"]");
                System.out.printf("%-10s %2d\n" , pName[i] , price[i]);

            }

            HashMap<String, Integer> order = new HashMap<String, Integer>();

            System.out.print("\nChoose an item: ");
            int item  = Integer.parseInt(DL.readLine());

            switch(item) {
                case 0:
                    order.put(pName[0], 0);
                    System.out.print("How many "+ pName[0] + " are you going to buy: ");
                    int qty = Integer.parseInt(DL.readLine());
                    order.put(pName[0], qty);
                    break;

                case 1:
                    order.put(pName[1], 0);
                    System.out.print("How many "+ pName[1] + " are you going to buy: ");
                    qty = Integer.parseInt(DL.readLine());
                    order.put(pName[1], qty);
                    break;

                case 2:
                    order.put(pName[2], 0);
                    System.out.print("How many "+ pName[2] + " are you going to buy: ");
                    qty = Integer.parseInt(DL.readLine());
                    order.put(pName[2], qty);
                    break;

                case 3:
                    order.put(pName[3], 0);
                    System.out.print("How many "+ pName[3] + " are you going to buy: ");
                    qty = Integer.parseInt(DL.readLine());
                    order.put(pName[3], qty);
                    break;

                case 4:
                    order.put(pName[4], 0);
                    System.out.print("How many "+ pName[4] + " are you going to buy: ");
                    qty = Integer.parseInt(DL.readLine());
                    order.put(pName[4], qty);
                    break;
            }

                    boolean addMore = true;
                    while (addMore) {
                        System.out.print("Do you want to add more items? (Y/N): ");
                        String answer = DL.readLine().toUpperCase();
                        if (answer.equals("Y")) {
                            System.out.print("\nChoose an item: ");
                            item  = Integer.parseInt(DL.readLine());
                            switch(item) {
                                case 0:
                                    order.put(pName[0], 0);
                                    System.out.print("How many "+ pName[0] + " are you going to buy: ");
                                    int qty = Integer.parseInt(DL.readLine());
                                    order.put(pName[0], qty);
                                    break;
                    
                                case 1:
                                    order.put(pName[1], 0);
                                    System.out.print("How many "+ pName[1] + " are you going to buy: ");
                                    qty = Integer.parseInt(DL.readLine());
                                    order.put(pName[1], qty);
                                    break;
                    
                                case 2:
                                    order.put(pName[2], 0);
                                    System.out.print("How many "+ pName[2] + " are you going to buy: ");
                                    qty = Integer.parseInt(DL.readLine());
                                    order.put(pName[2], qty);
                                    break;
                    
                                case 3:
                                    order.put(pName[3], 0);
                                    System.out.print("How many "+ pName[3] + " are you going to buy: ");
                                    qty = Integer.parseInt(DL.readLine());
                                    order.put(pName[3], qty);
                                    break;
                    
                                case 4:
                                    order.put(pName[4], 0);
                                    System.out.print("How many "+ pName[4] + " are you going to buy: ");
                                    qty = Integer.parseInt(DL.readLine());
                                    order.put(pName[4], qty);
                                    break;
                            }
                        } 
                        else {
                            addMore = false;
                        }
                    }

                            int totalCost = 0;
                            System.out.println("-----------------------------");
                            System.out.println("\nOrder Details");
                            System.out.println("Product\tQuantity\tPrice");
                            for (String itemName : order.keySet()) {
                                int qty = order.get(itemName);
                                int itemPrice = price[Arrays.asList(pName).indexOf(itemName)];
                                int itemCost = qty * itemPrice;
                                System.out.printf("%s\t%d\t%d\n", itemName, qty, itemCost);
                                totalCost += itemCost;
                            }
                            System.out.println("-----------------------------");
                            System.out.println("Total Cost: " + totalCost);
                            System.out.println("\nPlease Pay the amount: "+ totalCost);
                            System.out.print("How much is your cash?: ");
                            int cash = Integer.parseInt(DL.readLine());
                
                            if(cash < totalCost){

                                System.out.println("Insuficient Funds!!");
                                System.out.println("\nPlease Pay the amount: "+ totalCost);
                                System.out.print("How much is your cash?: ");
                                cash = Integer.parseInt(DL.readLine());

                                if(cash < totalCost){
                                    System.out.println("Insuficient Funds!!");
                                    System.out.println("\nPlease Pay the amount: "+ totalCost);
                                    System.out.print("How much is your cash?: ");
                                    cash = Integer.parseInt(DL.readLine());
                                }
                                else if(cash >= totalCost){
                                    int change = cash - totalCost;
                                    System.out.println("Thank You sir "+firstName +", your total order amount is " + totalCost + ", and your change is: " + change);
                                }
                            }
                            else if(cash >= totalCost){
                                
                                int change = cash - totalCost;
                                System.out.println("Thank You sir "+firstName +", your total order amount is " + totalCost + ", and your change is: " + change);
                            }
                            System.out.println("\n-----------------------------------------------------------------------------\n");
                            System.out.println("Enter (Y) to Return, otherwise, press any key to exit.\n");
                            System.out.print("Do You want to Order Again ?: ");
                            char key = DL.readLine().charAt(0);
    
                            if (key == 'y' || key == 'Y') {
                                loop++;
                            } else {
                                System.out.println("\nThank You!! ");
                                System.out.println("EXIT ...");
                                System.exit(0);
                            }//DL BSIT 2-C

                }while (loop >= 1);

   }
}
