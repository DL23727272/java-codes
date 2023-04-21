import java.util.*;
class P_Calc{
 
  public float add( float num1 , float num2)
    {

        return num1 + num2;
    
    }
}
class C_Calc1 extends P_Calc{
    
    
      public float sub( float num1 , float num2)
    {

        return num1 - num2;
    
    }
}

class C_Calcu2 extends C_Calc1{
        public float multi( float num1 , float num2)
    {

        return num1 * num2;
    
    }
        public float div( float num1 , float num2)
    {

        return num1 / num2;
    
    }

}

public class j21 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int loop = 0;
        do{
      C_Calcu2 c = new C_Calcu2();
        System.out.println("1. ADDITION: ");
        System.out.println("2. SUBTRACTION: ");
        System.out.println("3. MULTIPLICATION: ");
        System.out.println("4. DIVISION: ");
         System.out.println("5. EXIT: ");
        System.out.print("\nNumber input: ");
        
        int input = scan.nextInt();
        
        if(input==5 ){
        System.out.println("\nEXIT ...");
        System.exit(0);
        }
        else if(input>=5 ){
            System.out.println("\n! Invalid input ");
            System.out.println("EXIT ...");
        }
        
       
        System.out.print("Input number 1:  ");
        int a = scan.nextInt();
        System.out.print("Input number 2:  ");
        int b= scan.nextInt();
        
        switch(input){
            case 1:
                System.out.print("Generated sum is: ");
                float result = c.add(a,b);
                System.out.println(result); 
                break;
            case 2:
                System.out.print("Generated difference is: ");
                result = c.sub(a,b);
                System.out.println(result); 
                break;
                
                 case 3:
                System.out.print("Generated product is: ");
                result = c.multi(a,b);
                System.out.println(result); 
                break;
               case 4:
                System.out.print("Generated qoutient is: ");
                result = c.div(a,b);
                System.out.println(result); 
                break;
                
                
        }
        System.out.println("Enter (m) to return, otherwise, press any key to exit.\n");
            System.out.print("Input Letter: ");
        char key = scan.next().charAt(0); 
        
        if(key == 'm' || key == 'M'){
        loop++;
        }
        else{
            System.out.println("\n! Invalid input ");
            System.out.println("EXIT ...");
            System.exit(0);
        }
        
        
    }while(loop>=1);
    
    }
}