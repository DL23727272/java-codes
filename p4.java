import java.io.*;
import java.util.LinkedList;
import java.util.Iterator;

class p4 {

    public static void main(String... args) throws IOException {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("10H - Guava");
        fruits.add("12H - Banana");
        fruits.add("15H - Grapes");
        fruits.add("20H - Apple");
        fruits.add("25H - Mango");
        fruits.add("30H - Dragon Fruit");

        System.out.println("List : " + fruits);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position, choice = 0;

        while (choice < 4) {
            System.out.println("\n LINKEDLIST OPERATIONS");
            System.out.println("1.Add an Element");
            System.out.println("2.Remove an Element");
            System.out.println("3.Change an Element");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.println("Enter your choice");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter Element ");
                    element = br.readLine();

                    System.out.println("At what position");
                    position = Integer.parseInt(br.readLine());
                    fruits.add(position - 1, element);
                    break;

                case 2:
                    System.out.print("Enter Position ");
                    position = Integer.parseInt(br.readLine());
                    fruits.remove(position - 1);
                    break;

                case 3:
                    System.out.print("Enter position ");
                    position = Integer.parseInt(br.readLine());

                    System.out.println("Enter new Element");
                    element = br.readLine();
                    fruits.set(position - 1, element);

                    break;
                case 4:
                    System.out.println("List :");
                    Iterator it = fruits.iterator();
                    while (it.hasNext()) {
                        System.out.print(it.next() + ", ");
                    }

                case 5:
                    System.exit(0);

                default:
                    System.out.println("wrong choice");
            }
        }
    }
}