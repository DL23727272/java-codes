import java.util.*;
class Compute{

void getArea(float length, float width){

float area = length * width;
System.out.println(area);

}

void getPerimeter(float length, float width){

float area = length + width;
float perim = area * 2;
System.out.print(perim);

}
}


public class Olympic15{


public static void main (String [] args){

Scanner scan = new Scanner (System.in);
float length, width;

System.out.print("Enter the width size: ");
width = scan.nextFloat();

System.out.print("Enter the length size: ");
length = scan.nextFloat();

//oop
Compute areaG = new Compute ();
areaG.getArea(length, width);

Compute perimG = new Compute ();
perimG.getPerimeter(length, width);

}
}
