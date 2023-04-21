
/* Java program to implement basic stack
operations */
import java.io.*;

class Stack {
    int top;
    private int a[]; // Maximum size of Stack
    private int capacity;

    Stack(int n) {
        a = new int[n];
        capacity = n;
        top = -1;
    }

    // Push
    void push(int x) {

        if (top >= (capacity - 1)) {
            System.out.println("Stack Overflow");

        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");

        }
    }
    void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");

        } else {
            int x = a[top--];

        }
    }
    void peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");

        } else {
            int x = a[top];

        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}


   


// Driver code
class Stack_5 {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = 0, choice = 0;
        do {
            while (choice < 4) {
                System.out.println("\n \n-----------------------------------------------------------------------------");
                System.out.println("\n Choose a Number");
                System.out.println("(1) Add Elements on the Stack");
                System.out.println("(2) Remove 2 Elements from the Stack");
                System.out.println("(3) End");

                System.out.print("\nEnter your choice : ");
                choice = Integer.parseInt(br.readLine());

                int n, item;
                // String element;

                switch (choice) {
                    case 1:
                        System.out.print("\nHow many Elements u want in stack : ");

                        n = Integer.parseInt(br.readLine());

                        Stack s = new Stack(n);

                        System.out.println("\nEnter all the elements ( Integer Only! ): ");
                        for (int i = 0; i < n; i++) {
                            System.out.println("------------------------------");
                            item = Integer.parseInt(br.readLine());
                            s.push(item);

                        }
                        System.out.println("------------------------------");
                        System.out.print("Elements present in stack: ");
                        s.print();
                        break;
                    case 2:
                        System.out.println("-----------------------------------------------------------------------------\n");
                        System.out.println("Enter (Y) to add again, otherwise, press any key to exit.\n");
                        System.out.print("Do You want to Compute Again: ");
                        char key = br.readLine().charAt(0);

                        if (key == 'y' || key == 'Y') {
                            loop++;
                        } else {
                            System.out.println("\nThank You!! ");
                            System.out.println("EXIT ...");
                            System.exit(0);
                        }
                        break;

                    case 3:
                        System.out.print("Thank you!!");
                        System.exit(0);
                }

            }
        } while (loop >= 1);
    }
}
