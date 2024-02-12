import java.util.Scanner;
public class practice1{
   public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
    String DL;
    int age;
    System.out.println("Enter your name:");
     DL = scan.nextLine();
    System.out.println("Enter your age:");
    age = scan.nextInt();

    System.out.println("Values");
    System.out.println (age);
    System.out.println(DL);
   }
}