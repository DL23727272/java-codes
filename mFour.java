import java.time.LocalTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
/*
    Nested if else statement 
    Time Management
    DL Gamoso
*/ 

public class mFour {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); // static method of the java.util.Calendar class that returns a Calendar object
        LocalTime now = LocalTime.now(); // gets the current time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a"); // formats the time to 12-hour with AM || PM.
        String timeStr = now.format(formatter);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int hourOfDay = now.getHour();

        System.out.println("The time is " + timeStr);
        if (dayOfWeek >= Calendar.MONDAY && dayOfWeek <= Calendar.FRIDAY) {
            if (hourOfDay >= 6 && hourOfDay < 7) {
                System.out.println("Wake up!, you need to go to school");
            } 
            else if (hourOfDay >= 8 && hourOfDay < 12) {
                System.out.println("Study");
            }
            else if (hourOfDay >= 12 && hourOfDay < 13) {
                System.out.println("Lunch Break");
            } 
            else if (hourOfDay >= 13 && hourOfDay < 21) {
                System.out.println("Code");
            }
            else {
                System.out.println("Sleep");
            }
        } else {
            System.out.println("Enjoy your weekend!");
        }
    }
}
