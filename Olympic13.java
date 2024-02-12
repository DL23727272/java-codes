import java.util.*;

public class Olympic13{

public static void sortArray(int [] nums){

//Arrays.sort(nums);
//System.out.println("Sorted Array: " + Arrays.toString(nums));

for( int i = 0; i < nums.length -1; i++){

for(int j = i + 1;j < nums.length; j++){

if( nums[i] > nums[j]){
int hold= nums[i];
nums[i] = nums[j];
nums[j] = hold;
}

}

}

for (int num : nums) {
System.out.print(num + " ");
}

}

public static void main (String [] args){

Scanner scan = new Scanner (System.in);

int [] nums = {1, 3, 5, 7, 2, 4, 6};

sortArray(nums);
}
}