import java.util.*;

public class Olympic12{

public static void loopMe(int size){
System.out.print(" Ascending Order: ");
for(int i = 1; i <= size; i++){
System.out.print(i + " ");
}
System.out.print("\n Descending Order: ");
for(int j = size; j >= 1; j--){
System.out.print(j + " ");
}

}


public static void main (String [] args){

Scanner scan = new Scanner(System.in);

int size;

System.out.print("Enter a number: ");
size = scan.nextInt();

loopMe(size);

}

}