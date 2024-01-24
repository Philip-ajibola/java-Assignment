import java.util.Arrays;

public class Solution1{
	public static void main(String[] args){
		int[] number1 = {1,1};
		int[] array = findErrorNums(number1);
		System.out.println(Arrays.toString(array));
		
	}

    public static int[] findErrorNums(int[] nums) {
        int length = nums.length;
        int counter = 0;
     
        int[] result= new int[2];

        while (counter < length) {
            if (nums[counter] != nums[nums[counter] - 1]) {
                int temp = nums[counter];
                nums[counter] = nums[nums[counter] - 1];
                nums[temp - 1] = temp;
            } else {
                counter++;
            }
        }

        for (counter = 0; counter < length ; counter++) {
            if (nums[counter] != (counter + 1)) {
                result[0] = nums[counter];
                result[1] = counter + 1;
            }
        }
        return result;  
    }
}
