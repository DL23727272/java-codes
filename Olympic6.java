import java.util.*;

public class Olympic6{

public static void patternMethod(int num){

for(int i =1; i <= num; i++){
for(int j = 1;j <= i; j++){

System.out.print(j + " ");

}

System.out.println(" ");
}
 
}

public static void main (String [] args){

Scanner scan = new Scanner(System.in);

int num;

System.out.print("Enter a number: ");
num = scan.nextInt();

patternMethod(num);


}
}