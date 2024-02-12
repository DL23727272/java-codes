import java.util.*;

public class Olympic27{

public static void main (String [] args){

Scanner scan = new Scanner (System.in);

String text = "Dog bites man";

String [] result= text.split(" ");

for(String str : result){
int size = result.length;
for( int i = size; i <= 0; i--){
System.out.print(result[i]);

}
}

System.out.println(" ");







scan.close();
}

}