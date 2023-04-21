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

    boolean push(String x) {

        if (top >= (capacity - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    String pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    String peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

public class Stack_string {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        
        System.out.print("\nHow many Elements u want in stack : ");

        n = Integer.parseInt(br.readLine());
        String items[] = new String[n];
        Stack s = new Stack(n);
        System.out.println("\nEnter all the elements ( Integer Only! ): ");
        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------");
            items[i] = br.readLine();
           
    }
    for (int z = 0; z < n; z++) {
        s.push(items[z]);

    }

        System.out.println("------------------------------");
        System.out.print("Elements present in stack :");
        s.print();
        System.out.println("\nThe top element is :" + s.peek());
        System.out.println(s.pop() + " Removed from stack");
        System.out.println("The new top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
        System.out.print("\n");
    }
}
