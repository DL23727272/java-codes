import java.util.*;

public class Olympic24{

public static void addElement(String [] name, int size){
Scanner scan = new Scanner(System.in);

for(int i = 0; i < size; i++){
System.out.print("Enter element in index " + i + ": " );
name[i] = scan.next();
}

}

public static void Display(String [] name, int size){

for(int i = 0; i < size; i++){
String print = name[i];
System.out.println("Element in index " + i + ": " + print );
}

}

public static void main (String [] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the Size of the array: ");
int size = scan.nextInt();

String [] name = new String [size];

System.out.println("\nEnter " +  size + " elements in array");

addElement(name, size);

System.out.print("\nDo you want to print the elements from the array? (Y / N): ");
char key = scan.next().charAt(0);

switch(Character.toUpperCase(key)){

case 'Y':

Display(name, size);

break;

default:
System.out.println("Thank you");


}

scan.close();

}


}