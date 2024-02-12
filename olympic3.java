import java.util.*;

public class olympic3{

//Reverse String method
public static void reverse(String name){

String reverseName = "";

int nameSize = name.length();

for(int i = nameSize - 1; i >= 0; i--){
   reverseName = reverseName + name.charAt(i);
}  

System.out.print("Reversed Name: ");
System.out.print(reverseName);

}

public static void main(String [] args){

Scanner scan = new Scanner(System.in);
String name;

System.out.print("Name: ");
name = scan.nextLine();


reverse(name); // calling the method

}

}