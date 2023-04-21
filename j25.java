import java.io.*;

class j25 {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        System.out.print("Enter Your Name: ");
        name =  br.readLine();

         if (name.equalsIgnoreCase("Angela")) {
            System.out.print("Bonak");
          } 
          else if (name.equalsIgnoreCase("Ruvic")) {
            System.out.print("Batang Candon");
          } 
          else {
            System.out.print("Hi Master "+ name  );
          }
    }
}
