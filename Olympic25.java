import java.util.*;

//find value
class Find{

void findValue(int [] [] arrayNums, int row, int col, int find){

System.out.print("\n");

for(int i = 0; i < row; i++){

for(int j = 0; j < col; j++){
int value = arrayNums[i] [j];

if(find == value){
System.out.println("The array contains: " + find);
}

}

}

}
}

//print all elements
class Display{

void displayAll(int [] [] arrayNums, int row, int col){

System.out.print("\n");

for(int i = 0; i < row; i++){

for(int j = 0; j < col; j++){
int print = arrayNums[i] [j];
System.out.println("Element in index [" + i + "] [" + j + "]: " + print);
}

}

}
}

public class Olympic25{


// add element in 2D array
public static void twoD(int [] [] arrayNums, int row, int col){

Scanner scan = new Scanner (System.in);

System.out.print("\n");

for(int i = 0; i < row; i++){

for(int j = 0; j < col; j++){
System.out.print("Enter element in index [" + i + "] [" + j + "]: ");
arrayNums[i] [j] = scan.nextInt();
System.out.println("-------"+ arrayNums [i][j] + " is added-------");
}

}

}

// main
public static void main (String [] args){

Scanner scan = new Scanner (System.in);

System.out.print("Enter the size of row: ");
int row = scan.nextInt();

System.out.print("Enter the size of column: ");
int col = scan.nextInt();

int [] [] arrayNums = new int[row] [col];

twoD(arrayNums, row, col);

System.out.print("Do you want to check if an element is present in the array? (Y/N): ");
char key = scan.next().charAt(0);

switch(Character.toUpperCase(key)){

case 'Y':

System.out.print("Enter a value you want to check: ");
int find = scan.nextInt();

Find look = new Find();
look.findValue(arrayNums, row, col, find);

break;

case 'N':

System.out.print("k");

break;

default:
System.out.print("invalid");
}


System.out.print("Do you want to Display all the elements? (Y/N): ");
key = scan.next().charAt(0);

switch(Character.toUpperCase(key)){

case 'Y':

Display printAll = new Display();
printAll.displayAll(arrayNums, row, col);

break;

case 'N':

System.out.print("k");

break;

default:
System.out.print("invalid");
}

scan.close();
}
}