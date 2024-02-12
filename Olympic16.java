import java.util.*;

class Convert{

void sumAll(String [] nums){

int sum = 0;

for( int i = 0; i < nums.length; i++){
 int num = Integer.parseInt(nums[i]);
 sum += num;
}

System.out.println("Sum of the 3 string to int: " + sum);

}

}

public class Olympic16{

public static void main (String [] args){

Scanner scan = new Scanner (System.in);

String [] nums = {"1", "2", "3"};

System.out.print("Do you want to convert the String to Int?: ");
String key = scan.next();

if(key.equalsIgnoreCase("y")){

Convert sum = new Convert();
sum.sumAll(nums);

}
else
System.out.print("Ok nvm");





}

}