import java.util.*;

class toJava{

void fromC(String [] c, String [] java){

for(int i = 0; i < c.length; i++){
java[i] = c[i];
}

System.out.println("The new value of java is: ");

for(int i = 0; i < c.length; i++){
System.out.print(java[i] + " ");
}

}
} 

public class Olympic26{

public static void fromJava(String [] java, String [] c){

for(int i = 0; i < c.length; i++){

}

System.out.println("\nThe new value of C is: ");

for(int i = 0; i < c.length; i++){
System.out.print(c[i] + " ");
}

}

public static void main (String [] args){

Scanner scan = new Scanner (System.in);

String [] java = {"DL", "Andrew"};
String [] c = {"Frio", "Tope"};

toJava newJava = new toJava();
newJava.fromC(c, java);

fromJava(java, c);


}

}