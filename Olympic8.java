import java.util.*;

public class Olympic8{

public static void pyramidPattern(int num){

for(int i = 1 ; i <= num; i++){

for(int k = 1; k <= num - i; k++){
System.out.print(" ");
}

for(int j = 1; j <= i; j++){
System.out.print(j + " ");
}

for(int j = i - 1; j >= i; j--){
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

pyramidPattern(num);


}
}