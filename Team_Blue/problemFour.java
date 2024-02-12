
import java.util.Scanner;

public class problemFour {
    
  private  static double getArea(double length,double width){
        double area = length * width;
        return area;
    }  
  private  static double getPerimeter(double length,double width){
       
        double perimeter = length + width;
        double perim = perimeter *2;
        return perim;
    }  
  
  
   
   
    public static void main(String[] args){
        Scanner DL = new Scanner (System.in);
        System.out.print("Select Polygon ( 1-Square, 2-Rectangle, 3-Trapezoid): ");
        int key = DL.nextInt();
        
        switch(key){
            
            case 1:
              System.out.print("Enter side: ");   
              double side = DL.nextDouble();
     
              double areaResult = getArea(side, side);
              System.out.println("Area= " + areaResult);
     
              double perimeterResult = getPerimeter(side, side);
              System.out.println("Perimeter = "+perimeterResult);

              System.out.print("Enter code = "+ key);

               break;
                
            case 2:
                System.out.print("Enter length: ");
                double length = DL.nextDouble();
                
                System.out.print("Enter width: ");
                double width = DL.nextDouble();
                
                areaResult = getArea(length, width);
                System.out.println("Area= " + areaResult);
     
     
                perimeterResult = getPerimeter(length, width);
                System.out.println("Perimeter = "+perimeterResult);

                System.out.print("Enter code = "+ key);

                break;
                
            case 3:
                System.out.print("Enter a: ");
                double a = DL.nextDouble();
                
                System.out.print("Enter b: ");
                double b = DL.nextDouble();
                
                System.out.print("Enter c: ");
                double c = DL.nextDouble();
                
                System.out.print("Enter d: ");
                double d = DL.nextDouble();
                
                System.out.print("Enter heigth: ");
                double heigth = DL.nextDouble();
                
                double e =((a+b)/2);
                 areaResult = getArea(e, heigth);
                  System.out.println("Area= " + areaResult);
                
                double f = a + b + c + d;
                  System.out.println("Perimeter = "+ f);
      System.out.print("Enter code = "+ key);
                break;
                
            default:
                System.out.print("invalid!!");
            
            
        }
     
    }

  

  
}
