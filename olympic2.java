import java.util.*;

public class olympic2{

public static void add_ToArray(ArrayList<Integer> list,int arrNum){

Scanner scan = new Scanner(System.in);

for(int i = 0; i < arrNum;  i++){
System.out.println("________________________ ");
System.out.print("Enter number " +  i + " item: ");
int num = scan.nextInt();
list.add(num);
System.out.println("Item: " + "'" + num +"'"+" is added");
 
}

}

public static void TargetNumber(int target, ArrayList<Integer>list){

for(int i = 0; i < list.size(); i++){
for(int j = 1; j < list.size(); j++){

int sum = list.get(i) + list.get(j);

if( sum == target){
System.out.print("\nTarget number is found at index: " + i + " and index: " +j);
return;
}

}
}

}

public static void main (String [] args){

Scanner scan = new Scanner(System.in);

System.out.print("How many numbers do you want to add?: ");
int arrNum = scan.nextInt();

ArrayList<Integer> list = new ArrayList<>();

add_ToArray(list, arrNum);

System.out.println("________________________ ");
System.out.print("Target: ");
int target = scan.nextInt();

TargetNumber(target, list);

}
}