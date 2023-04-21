import java.util.Scanner;

public class act {
    public static void main(String[] args) {

        Scanner DL = new Scanner(System.in);

    System.out.print("How old are you? ");
    
    int age = DL.nextInt();

    if (age >= 0 && age <= 5){
        System.out.println("Toddler");
    }
    else if (age >= 6 && age <= 12){
        System.out.println("Kid");
    }
    else if (age >= 13 && age <= 19){
        System.out.println("Teen");
    }
    else if (age > 19){
        System.out.println("Adult");
    }
    else{
        System.out.println("Dead");
    }
}
}
