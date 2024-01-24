import java.util.Arrays;

public class SortingArray2{

	public static void main(String[] args){
		int[] array = {3,6,5,8,7,2};
		for(int count = 0;count<array.length;count++){
			for(int counter =0; counter<array.length;counter++){
					if(array[counter]>array[count]){
						array[count] += array[counter];
						array[counter]=array[count]-array[counter];
						array[count] = array[count]- array[counter];
					}
									
			}
		}
			System.out.print(Arrays.toString(array));
	}

}