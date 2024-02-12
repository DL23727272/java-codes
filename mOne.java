import java.io.*;
import java.util.*;

/*
    1 problem and solution combination of IF ELSE and SWITCH STATEMENT
    Check if a letter is a vowel or a consonant
    DL GAMOSO
*/ 
public class mOne {
    public static void main(String... args) throws IOException {
   
     BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a letter: ");
        String letterStr = DL.readLine();
        char letter = letterStr.toLowerCase().charAt(0);
        
        if (letterStr.equalsIgnoreCase("a") || letterStr.equalsIgnoreCase("e") || letterStr.equalsIgnoreCase("i") || letterStr.equalsIgnoreCase("o") || letterStr.equalsIgnoreCase("u"))
         {
            System.out.println(letterStr + " is a vowel.");
         } 
        else {
            switch (letter) {
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.println(letterStr + " is a consonant.");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
