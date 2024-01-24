import java.util.Arrays;

public class SortArray{

	public static void main(String[] args){
		int[] number = {-4,05,6%3,99,-8,0};
		int[] sortedArray = new int[number.length];
		int temp = 0;
		for(int count = 0 ; count<number.length;count++){
			for(int counter = count +1 ; counter<number.length;counter++){
					if(number[counter]>number[count]){
						temp = number[count];
						number[count] = number[counter];
						number[counter] = temp;
						
					}
	
					
			}
		}
							

		System.out.print(Arrays.toString(number));

	}


}