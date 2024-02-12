
import java.util.Scanner;

public class problemOne {

  private static double getArea(double length, double width) {
    double area = length * width;
    return area;
  }

  private static double getPerimeter(double length, double width) {

    double perimeter = length + width;
    double perim = perimeter * 2;
    return perim;
  }

  public static void main(String[] args) {
    Scanner DL = new Scanner(System.in);

    System.out.print("Enter Length:");
    double length = DL.nextDouble();

    System.out.print("Enter Width:");
    double width = DL.nextDouble();

    getArea(length, width);
    double areaResult = getArea(length, width);
    System.out.println("Area: " + areaResult);

    getPerimeter(length, width);
    double perimeterResult = getPerimeter(length, width);
    System.out.print("Perimeter: " + perimeterResult);
  }

}
