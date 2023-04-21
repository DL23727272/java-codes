import java.io.*;

public class stack_2 {
    
    public static void main(String args[]) {


    
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int size;
        int capacity;
        int top;
        int arr[];
        
		Stack s = new Stack(6);
       
          Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
          }

		s.push(10);
		s.push(20);
		s.push(35);
		s.push(30);
		s.push(40);

		System.out.print("Elements present in stack :");
		s.print();
		System.out.println("\n" + s.pop() + " Popped from stack");
		System.out.println("Top element is :" + s.peek());
		System.out.print("Elements present in stack :");
		s.print();
	}
}

