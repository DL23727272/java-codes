import java.util.Scanner;

public class angela {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] genderList = { "nephew", "niece"};
        System.out.print("Are u a Boy or Girl?: ");
        String gender = scan.nextLine().toUpperCase();

        if (gender.equals("BOY")){
            System.out.println(genderList[0]);
        }
        else if (gender.equals("GIRL")){
            System.out.println(genderList[1]);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
