public class MultiplicationTable1{

	public static void main(String[] args){
		
		displayTimeTable();
	}



	public static void displayTimeTable(){
			int result = 1;
		for(int count = 1; count<=12; count++){
			for(int counter = 1; counter<=12;counter++){
				result = count*counter;
				System.out.printf("%d X %d = %d\t",counter,count,result);
			}
				System.out.println();
		}

	}


}