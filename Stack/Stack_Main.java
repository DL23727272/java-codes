import java.io.*;

//DL BSIT 2-C

class Stack { // class Stack
    int top;

    // Private Modifier
    private int a[]; // size of Stack
    private int capacity;

    Stack(int n) {
        a = new int[n];
        capacity = n;
        top = -1;
    }

    // Push
    boolean push(int x) {

        if (top >= (capacity - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    // Pop
    int pop() {
        if (top < 0) {
            System.out.println("Stack Empty");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    // Peek
    int peek() {
        if (top < 0) {
            System.out.println("Stack Empty");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    // Print
    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

// DL

class Stack_Main {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = 0, choice = 0;

        do {
            while (choice < 3) {
                System.out
                        .println("\n \n-----------------------------------------------------------------------------");
                System.out.println("\n Choose a Number");
                System.out.println("(1) Stack Operations");
                System.out.println("(2) End");

                System.out.print("\nEnter your choice : ");
                choice = Integer.parseInt(br.readLine());

                int n, item;
                // String element;

                // DL Gamoso
               
                switch (choice) {
                    case 1:
                        System.out.println("\nYou've Chosen Stack Operations!!");
                        System.out.print("\nHow many Elements u want in stack : ");

                        n = Integer.parseInt(br.readLine());

                        Stack s = new Stack(n);

                        System.out.println("\nEnter "+ n +" elements ( Integer Only!! ) ");
                        for (int i = 0; i < n; i++) {
                            System.out.println("------------------------------");
                            item = Integer.parseInt(br.readLine());
                            s.push(item);

                        }

                        System.out.println("------------------------------");
                        System.out.print("\nElements present in stack: "); // Stacked Elements that has been pushed
                        s.print();

                        System.out.println("\nThe top element is : " + s.peek()); // Peek the top Element of the Stack

                        System.out.println("-----------------------------------------------------------------------------\n");
                        System.out.println("Enter (Y) to Remove an Element from Stack, otherwise, press any key to exit.\n");
                        System.out.print("Do You want to Remove an Element from Stack: ");
                        char z = br.readLine().charAt(0);
                        
                        if (z == 'y' || z == 'Y') {

                            System.out.println("\n \n'" + s.pop() + "'" + " is Removed from stack"); // Pop the top element from the Stack

                            System.out.println("The new top element is : " + s.peek()); // Peek the new top element of// the Stack

                            System.out.print("Elements present in stack : "); // The updated list of Elements in Stack
                            s.print();

                            System.out.print("\n");
                            for (int i = 1; i < n; i++) {
                            
                            System.out.println("-----------------------------------------------------------------------------\n");
                            System.out.println("Enter (Y) to Remove an Element AGAIN from Stack, otherwise, press any key to exit.\n");
                            System.out.print("Do You want to Remove an Element AGAIN from Stack: ");
                            char x = br.readLine().charAt(0);

                            if (x == 'y' || x == 'Y') {

                                System.out.println("\n \n'" + s.pop() + "'" + " is Removed from stack"); // Pop the top element from thetack
    
                                System.out.println("The new top element is : " + s.peek()); // Peek the new top element ofthe Stack
    
                                System.out.print("Elements present in stack : "); // The updated list of Elements in Stack
                                s.print(); }
                                else{
                                    System.out.println("\nThank You!! ");
                                    System.out.println("EXIT ...");
                                    System.exit(0);
                                }
    
                                System.out.print("\n");

                            }
                        } 
                        System.out.println("-----------------------------------------------------------------------------\n");
                        System.out.println("Enter (Y) to Return, otherwise, press any key to exit.\n");
                        System.out.print("Do You want to Run Stack Operations Again ?: ");
                        char key = br.readLine().charAt(0);

                        if (key == 'y' || key == 'Y') {
                            loop++;
                        } else {
                            System.out.println("\nThank You!! ");
                            System.out.println("EXIT ...");
                            System.exit(0);
                        }//DL BSIT 2-C
                        break;

                    case 2:

                        System.out.print("Thank you!!");
                        System.exit(0);
                }

            }
        } while (loop >= 1);
    }
}
