import java.util.*;

public class Olympic7{

public static void patternReverse(int num){


for(int i = num; i >= 1; i--){

for(int j = 1;j <= i; j++){
System.out.print(j + " ");
}

System.out.println(" ");
}


}

public static void main (String[]args){

Scanner scan = new Scanner(System.in);

int num;

System.out.print("Enter a number: ");
num = scan.nextInt();

patternReverse(num);


}
}