import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.*;

public class mThree {
    public static void main(String... args) throws IOException {

        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));
       
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM");
        String monthName = now.format(formatter);

        System.out.print("Enter a month to show the season: ");
        String month = DL.readLine().toUpperCase();

        switch(month){
            case "JANUARY":
            case "FEBRUARY":
            System.out.println("Cool Dry Season");
            break;
            case "MARCH":
            case "APRIL":
            case "MAY":
            System.out.println("Hot Dry Season");
            break;
            case "JUNE":
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
            System.out.println("Rainy Season");
            break;
            case "DECEMBER":
            System.out.println("Cool Dry Season");
            break;
            default: System.out.println("Invalid input");

        }

        
      
    }
}
