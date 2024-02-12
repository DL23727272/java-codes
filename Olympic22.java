import java.util.*;

class Operator{

public static float Add(float a, float b){

float sum = a + b;

return sum;

}

void Subtract(float a, float b){

float diff = a - b;

System.out.println(diff);
}

}


public class Olympic22{

// method that prints value in main class
public static void Divide(float a, float b){

float quotient = a / b;

System.out.print(quotient);

}

// method that returns result in main class
public static float Multiply(float a, float b){

float product = a * b;
return product;

}

public static void main(String [] args){
Scanner scan = new Scanner(System.in);

float a,b;
char ch;

do{
System.out.print("Enter first integer: ");
a = scan.nextFloat();

System.out.print("Enter second integer: ");
b = scan.nextFloat();

System.out.print("Enter the symbol for the operator: ");
String key = scan.next();

switch(key){

case "+":

float sum = Operator.Add(a,b); // calling method from operator class that returns result in main class
System.out.print(sum);

break;

case "-":

Operator diff = new Operator(); // calling method from operator class that print result in main class
diff.Subtract(a, b);

break;

case "*":
float product = Multiply(a,b); // calling method that returns result in main class
System.out.print(product );

break;

case "/":

Divide(a,b); // calling method that prints value in main class

break;

}

System.out.print("\n" );
System.out.print("\nDo you want to compute again (y / n): " );
ch = scan.next().charAt(0);

}while(Character.toUpperCase(ch) == 'Y');


}
}