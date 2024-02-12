import java.util.*;

public class Olympic11{

public static void checkValue(int a, int b){

Boolean no = false;
Boolean yes = true;

int c = 5*a;
int d = 3 - b;
int e = c - b;


if( e > 30){

System.out.print(yes);
}
else
System.out.print(no);

}


public static void main(String [] args){

Scanner scan = new Scanner (System.in);

int a,b;

System.out.print("Enter an integer for int a: ");
a = scan.nextInt();

System.out.print("Enter an integer for int b: ");
b = scan.nextInt();

checkValue(a, b);

}

}