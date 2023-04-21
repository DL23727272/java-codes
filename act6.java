import java.util.Scanner;

public class act6 {
    //DL GAMOSO
    public static void main(String[] args) {

        Scanner DL = new Scanner(System.in);
        int loop = 1;
        while (loop == 1) {
            System.out.print("Type Y to know your Age Group: ");
            char key = DL.next().charAt(0);
           
            switch (key) {
                case 'Y':{
                    System.out.println("\n");
                    System.out.print("Input your AGE: ");
                    int age = DL.nextInt();
            
                    if (age >= 0 && age <= 1){
                        System.out.println("\nInfant");
                    }
                    else if (age >= 1 && age <= 12){
                        System.out.println("Child");
                    }
                    else if (age >= 13 && age <= 17){
                        System.out.println("Adolescent");
                    }
                    else{
                        System.out.println("Adult");
                    }
                    System.out.println("-----------------------------------------------------------------------------\n");
                    System.out.println("Enter (Y) to Return, otherwise, press any key to exit.\n");
                    System.out.print("Do You want to Run it Again ?: ");
                    char z = DL.next().charAt(0);
        
                    if (z == 'y' || z == 'Y') {
                        loop = 1;
                    } else {
                        System.out.println("\nThank You!! ");
                        System.out.println("EXIT ...");
                        loop = 0;
                    }
                    //DL BSIT 2-C
                    break;
                }
               
                default:
                    System.out.println("Invalid age");
                    loop = 0;
                    System.out.println("-----------------------------------------------------------------------------\n");
                    System.out.println("Enter (Y) to Return, otherwise, press any key to exit.\n");
                    System.out.print("Do You want to Run it Again ?: ");
                    char z = DL.next().charAt(0);
        
                    if (z == 'y' || z == 'Y') {
                        loop = 1;
                    } else {
                        System.out.println("\nThank You!! ");
                        System.out.println("EXIT ...");
                        loop = 0;
                    }
            }
        }
    }
}
