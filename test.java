import java.io.*;
import java.util.*;

public class test {
    public static void main(String... args) throws IOException {
   
   BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));

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

         switch(item){
            case 0:
            order.put(pName[0], price[0]);
            System.out.print("How many "+ pName[0] + " are you going to buy: ");
            int qty = Integer.parseInt(DL.readLine());
            int totalQty = price[0] * qty;
          
            break;

            case 1:
            order.put(pName[1], price[1]);
            System.out.print("How many "+ pName[1] + " are you going to buy: ");
             qty = Integer.parseInt(DL.readLine());
             totalQty = price[1] * qty;
           
            break;

            case 2:
            order.put(pName[2], price[2]);
            System.out.print("How many "+ pName[2] + " are you going to buy: ");
             qty = Integer.parseInt(DL.readLine());
             totalQty = price[2] * qty;
           
            break;

            case 3:
            order.put(pName[3], price[3]);
            System.out.print("How many "+ pName[3] + " are you going to buy: ");
             qty = Integer.parseInt(DL.readLine());
             totalQty = price[3] * qty;
            break;

            case 4:
            order.put(pName[4], price[4]);
            System.out.print("How many "+ pName[4] + " are you going to buy: ");
             qty = Integer.parseInt(DL.readLine());
             totalQty = price[4] * qty;
            
            break;

         }

            boolean addMore = true;
            while (addMore) {
                System.out.print("Do you want to add more items? (Y/N): ");
                String answer = DL.readLine().toUpperCase();
                if (answer.equals("Y")) {
                    System.out.print("\nChoose an item: ");
                     item  = Integer.parseInt(DL.readLine());
                    switch(item){
                        case 0:
                        order.put(pName[0], price[0]);
                        System.out.print("How many "+ pName[0] + " are you going to buy: ");
                        int qty = Integer.parseInt(DL.readLine());
                        int totalQty =  qty;
                      
                        break;
            
                        case 1:
                        order.put(pName[1], price[1]);
                        System.out.print("How many "+ pName[1] + " are you going to buy: ");
                         qty = Integer.parseInt(DL.readLine());
                         totalQty =  qty;
                       
                        break;
            
                        case 2:
                        order.put(pName[2], price[2]);
                        System.out.print("How many "+ pName[2] + " are you going to buy: ");
                         qty = Integer.parseInt(DL.readLine());
                         totalQty =  qty;
                       
                        break;
            
                        case 3:
                        order.put(pName[3], price[3]);
                        System.out.print("How many "+ pName[3] + " are you going to buy: ");
                         qty = Integer.parseInt(DL.readLine());
                         totalQty =  qty;
                        
                        break;
            
                        case 4:
                        order.put(pName[4], price[4]);
                        System.out.print("How many "+ pName[4] + " are you going to buy: ");
                         qty = Integer.parseInt(DL.readLine());
                         totalQty = qty;
                       
                        break;
            
                     }
                } 
                else {
                    addMore = false;
                }
            }
                /*
                int totalCost = 0;
                System.out.println("\nOrder Details");
                System.out.println("Product\tQuantity\tPrice");
                for (String itemName : order.keySet()) {
                    int Tqty = totalQty;
                    int itemPrice = price[Arrays.asList(pName).indexOf(itemName)];
                    int itemCost = itemPrice * qty;
                    System.out.printf("%s\t%d\t%d\n", itemName, qty, itemCost);
                    totalCost += itemCost;
                }
                System.out.println("Total Cost: " + totalCost);
                */

         



   }
}
