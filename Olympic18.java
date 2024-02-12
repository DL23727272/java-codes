import java.util.*;

public class Olympic18{


public static void main(String [] args){

for(int i = 0; i <= 5; i++){

for(int j = 1; j <= i; j++){

if(j == 2  || j == 3 ){
System.out.print("- ");
continue;
}

System.out.print("+ ");

}

System.out.println(" ");
}

}

}