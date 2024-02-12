import java.util.*;

class Pyramid{

void makePattern(int a){

for(int i = 0; i <= a; i++){

for(int j = 1; j <= i; j++){
System.out.print(j + " ");

}
System.out.println(" ");
}

}


}

public class Olympic23{

public static void reverse(int a){


for(int i = a; i >= 1; i--){

for(int j = 1; j <= i; j++){
System.out.print(j+ " ");

}
System.out.println(" ");
}



}

public static void main (String [] args){

Scanner scan = new Scanner (System.in);

int a;


System.out.print("Enter a number: ");
a = scan.nextInt();

System.out.print("Do you want it reverse? (N / Y): ");
char key = scan.next().charAt(0);

switch(Character.toUpperCase(key)){

case 'N':
Pyramid patt = new Pyramid();
patt.makePattern(a);

break;

case 'Y':
reverse(a);

break;

}

}

}