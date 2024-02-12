import java.io.*;
/*
    1 problem and solution for any of the LOOPS
    Multiplication Table
    DL GAMOSO
 */
public class mSix {
    public static void main(String... args) throws IOException {

        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Multiplication Table Of: ");
        final int tableSize = Integer.parseInt(DL.readLine());
       
        for (int i = 1; i <= tableSize; i++) {
            // This loop will be responsible for generating the rows of the multiplication table.
            String row = ""; // store the values of the multiplication table

            for (int j = 1; j <= tableSize; j++) {
                // This loop will be responsible for generating the columns of the multiplication table.
                int result = i * j; // reslut holds the result of the multiplication.

                row += String.format("%4d", result);
                /*
                  The String.format() method is used to format the result value as a string. The
                  "%4d" format specifier formats the integer as a decimal number with a width of 4,
                  adding leading spaces if necessary.
                 */
            }
          
            System.out.println(row); // This generates a row of the multiplication table.
        }
}
    } 
