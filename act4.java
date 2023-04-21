import java.io.*;

public class act4 {

    public static void main(String... args) throws IOException {

        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int age;

        System.out.print("Enter Your Name: ");
        name = DL.readLine();

        System.out.print("Enter Your Age: ");
        age = Integer.parseInt(DL.readLine());

        System.out.println("My name is " + name + " and I am " + age + " year's old");

    }
}
