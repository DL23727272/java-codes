import java.util.Scanner;
class Check{
    void stringContainsVowels(String input) {
        return input.equalsTo(".*[aeiou].*");
    }
}
public class p2 {


    public static void main(String[] args) {
                
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine().toLowerCase();
        Check c = new Check();

    }

   

}