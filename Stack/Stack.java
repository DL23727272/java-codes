/* Java program to implement basic stack
operations */
class Stack {
	int top;
	private int a[]; // Maximum size of Stack
	private int capacity;

	Stack(int size) {
		a = new int[size];
		capacity = size;
		top = -1;
	}

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

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	int peek() {
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

// Driver code
class Mains {
	public static void main(String args[]) {

		Stack s = new Stack(6);
		
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
