import java.util.*;
class upperMe{

void upperCase(String text){

String upperCased = text.toUpperCase();
System.out.print(upperCased);

}

}


public class Olympic20{

public static void lowerCase(String text){

String lowerCased = text.toLowerCase();
System.out.print(lowerCased);

}

public static void main (String [] args){

Scanner scan = new Scanner (System.in);


String text, key;
System.out.print("Enter a text: ");
text = scan.nextLine();

System.out.print("Press (L) to lower case or Press (U) for Upper case: ");
key = scan.nextLine();

switch (key.toUpperCase()){
case "L":
lowerCase(text);
break;

case "U":
upperMe upCase = new upperMe();
upCase.upperCase(text);
break;

default:
System.out.print("invalid");
break;

}

scan.close();

}


}