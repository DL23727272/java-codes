
/* Java program to implement basic stack
operations */
import java.io.*;

class Stack {
    int top;
    private int a[]; // Maximum size of Stack
    private int capacity;

    Stack(int size) {
        a = new int[size];
        capacity = size;
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
class Mains {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String element;
        int n;

        System.out.print("How many Elements u want in stack :");
        n = Integer.parseInt(br.readLine());
        Stack s = new Stack(n);

    }
}
