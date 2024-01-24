import java.util.Arrays;

public class SortArray1{

	public static void main(String[] args){
		int[] number = {4*5,65,-6,10,-9,8};
		int temp = 0;
		for(int count = 0 ; count<number.length;count++){
			for(int counter = count +1 ; counter<number.length;counter++){
					if(number[counter]<number[count]){
						temp = number[count];
						number[count] = number[counter];
						number[counter] = temp;
						
					}
	
					
			}
		}
							

		System.out.print(Arrays.toString(number));

	}


}