import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.*;
/*
    1 problem and solution for IF ... ELSE statement
    Check what month is it
    DL GAMOSO
*/ 
public class mTwo {
    public static void main(String... args) throws IOException {
   
        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));
       
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM");

        System.out.print("Do you want to know what month is it? [Y/N] : ");
        char key = DL.readLine().toUpperCase().charAt(0);
        
        if(key == 'Y'){
            String monthName = now.format(formatter);
            System.out.println("Current month is: " + monthName);
        }
        else{
            System.out.println("\nThank You!! ");
            System.out.println("EXIT ...");
            System.exit(0);
        }
    
    }
}
