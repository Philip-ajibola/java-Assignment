public class UseEllipsis{

	public static void main(String[] args){
				
		int maximum = getHighest(11,23,45,65,43,23,10);
		
		System.out.print(maximum);
	}
		
	public static int getHighest(int... number){
			int highest = 0;
		for(int count = 0; count<number.length;count++){
			if(number[count]>highest){
					highest = number[count];
			}

		}

		return highest;
	}


}