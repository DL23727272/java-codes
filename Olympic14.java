import java.util.*;

public class Olympic14{

public static void checkNum(int check){

if(check % 2 == 0){
System.out.println("The number is even");
}
else 
System.out.println("The number is odd");


if(check >=0){
System.out.print("The number is positive");
}
else if ( check < 0){
System.out.print("The number is negative");
}

}


public static void main(String [] args){
Scanner scan = new Scanner (System.in);

int check;

System.out.print("Enter a number to check if (+) or (-): ");
check = scan.nextInt();

checkNum(check);

}

}