public class BarChart{
	public static void main(String[] args){
	int[] array = {0,0,0,0,0,0,1,2,4,1};
		System.out.println("Grade Distribution ");
	for(int  counter = 0; counter<array.length;counter++){
		if(counter==10){
			System.out.printf("%5d",100);
		}else{
			System.out.printf("%02d-%02d",counter*10,counter*10+9);
		}
			for(int asterisks = 0;asterisks<array[counter];asterisks++){
		System.out.print("*");
				}
		
		System.out.println();

	}

	


	}




}