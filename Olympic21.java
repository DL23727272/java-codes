import java.util.*;

class greatestNumber{
 
void displayGreatest(int a, int b, int c){
int greatest = a;


if( b > greatest ){
greatest = b;
}
if (c > greatest ){
greatest = c;
}
System.out.print(greatest);
}

}

public class Olympic21{


public static void main (String [] args){

Scanner scan = new Scanner (System.in);
int a, b, c, greatest;

System.out.print("Please Enter A Number: ");
a = scan.nextInt();

System.out.print("Please Enter A Number: ");
b = scan.nextInt();

System.out.print("Please Enter A Number: ");
c = scan.nextInt();

greatestNumber check = new greatestNumber();
check.displayGreatest(a, b, c);


}
}