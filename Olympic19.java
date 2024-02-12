import java.util.*;

class Check{

void checkSex(String sex, int age){

if(sex.equalsIgnoreCase("male")){
System.out.println("You are a male");

if(age <=12){
System.out.print("You are a boy");
}
else if (age <= 19){
System.out.print("You are a teen");
}
else if (age >= 20){
System.out.print("You are an man");
}

}

else if(sex.equalsIgnoreCase("female")){
System.out.println("You are a female");

if(age <=12){
System.out.print("You are a girl");
}
else if (age <= 19){
System.out.print("You are a teen");
}
else if (age >= 20){
System.out.print("You are an woman");
}

}

}

}

public class Olympic19{

public static void main (String [] args){

Scanner scan = new Scanner (System.in);

int age;
String sex;

System.out.print("Input sex (male / female ): ");
sex = scan.nextLine();

System.out.print("Enter your age: ");
age = scan.nextInt();

Check sexCheck = new Check();
sexCheck.checkSex(sex,age);


}

}