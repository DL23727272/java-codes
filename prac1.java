public class prac1 {
    // Field to store a name
    private String name;

    // Constructor to initialize the name field
    public prac1(String name) {
        this.name = name;
    }

    // Method to display a greeting using the name
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Create an instance of the prac1 class
        prac1 myObject = new prac1("John");

        // Call the greet method to display a greeting
        myObject.greet();
    }
}
