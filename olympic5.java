import java.util.*;


public class olympic5{

public static void checkYear(int currentYear, int startYear){

String answer = "Not an Olympic Year";

for(int i = startYear; i <= currentYear; i += 4){

if( i == currentYear){
answer = "Olympic Year";
break;
}

}

System.out.print(answer);

}


public static void main(String [] args){

Scanner scan = new Scanner(System.in);

int currentYear;
int startYear = 1896;

System.out.print("Enter current year: ");
currentYear = scan.nextInt();

checkYear(currentYear, startYear);

}

}