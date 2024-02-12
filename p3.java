import java.util.Scanner;

class DL {
    String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();
        char[] charArray = input.toCharArray();
        
        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        
        return output.toString();
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        DL d = new DL();
        String result = d.removeWhiteSpaces(input);
        
        System.out.println("Sentence without spaces: " + result);
    }
}
