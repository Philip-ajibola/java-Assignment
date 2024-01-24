import java.util.Arrays;

public class Solution2{
	public static void main(String[] args){
		int[] number1 = {3,2,2};
		int[] array = findErrorNums(number1);
		System.out.println(Arrays.toString(array));
		
	}

    public static int[] findErrorNums(int[] nums) {
        int length = nums.length;
        int counter = 0;
     
        int[] result= new int[2];
	
	if(nums[0]>nums[nums.length-1]){
			Arrays.sort(nums);
		 for (counter = 0; counter < length ; counter++) {
          		  if (nums[counter] != (counter + 1)) {
             		   result[0] = nums[counter];
             		   result[1] = counter + 1;
				break;
          		  }
     		   }
	}else{
        for (counter = 0; counter < length ; counter++) {
            if (nums[counter] != (counter + 1)) {
                result[0] = nums[counter];
                result[1] = counter + 1;
		break;
            }
        }
	}
        return result;  
    }
}
