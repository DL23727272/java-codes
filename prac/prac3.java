
import java.util.*;
public class prac3 {
    private static float getArea(float length, float width){
        return length*width;
    }
    public static float getPerimeter(float length, float width ){
        float sumSides = length + width;
        float perimeter = sumSides * 2;
        return perimeter;
    }
    public static void main(String[]args){
       
        Scanner scan =new Scanner (System.in);
        float dataOne, dataTwo;

        System.out.print("Select 1 for Square, 2 for Rectangle, and 3 for Trapezoid: ");
        int key = scan.nextInt();

        switch(key){
            case 1:
                System.out.println("You've chosen square!!");

                System.out.print("Enter the size of the side of square: ");
                float size = scan.nextFloat();

                dataOne = getArea(size, size);
                System.out.println("The area of the square is: " + dataOne);

                dataTwo = getPerimeter(size, size);
                System.out.print("The perimeter of the square is: " + dataTwo);
                
                break;
            case 2:
                System.out.println("You've chosen rectangle!!");

                System.out.print("Enter the length of the rectangle: ");
                float length = scan.nextFloat();

                System.out.print("Enter the width of the rectangle: ");
                float width = scan.nextFloat();

                dataOne = getArea(length, width);
                dataTwo = getPerimeter(length, width);

                System.out.println("The area of the rectangle is: " + dataOne);
                System.out.println("The perimeter of the rectangle is: " + dataTwo);

                break;
            case 3:
                System.out.println("You've chosen Trapezoid!!");

                System.out.print("Enter a: ");
                float a = scan.nextFloat();

                System.out.print("Enter b: ");
                float b = scan.nextFloat();

                System.out.print("Enter c: ");
                float c = scan.nextFloat();

                System.out.print("Enter d: ");
                float d = scan.nextFloat();

                System.out.print("Enter Height: ");
                float height = scan.nextFloat();

                float area = ((a+b)/2);
                dataOne = getArea(area, height);

                float sum = a + b + + c + d;
                System.out.println("Area: " + dataOne);

                System.out.println("Perimeter: " + sum);

                break;

                default:
                System.out.println("Invalid input");




        }
       
    }
}
