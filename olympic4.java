import java.util.*;

public class olympic4{

public static void fibo(int term){

int t1 = 0, t2 = 1;

for(int i = 1; i <= term; i++){

System.out.print(t1);

if ( i < term){
System.out.print(" + ");
}

int nt = t1 + t2;

t1 = t2;
t2 = nt;

}

}

public static void main (String[]arggs){

Scanner scan = new Scanner (System.in);

System.out.print("Input Terms: ");
int term = scan.nextInt();

fibo(term);

}

}