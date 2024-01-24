public class GreatestCommonDivisor{


	public int findCommonDivisor(int number1, int number2){
		int highest = 0;
		int lowest = 0;
		int remainder = 0;
		
		if(number1>number2){
			highest = number1;
			lowest = number2;
		}else{
			highest = number2;
			lowest = number1;
		}	

		do{
			remainder = highest%lowest;		
			highest = lowest;
			lowest = remainder;
		}while(remainder != 0);
			
		return highest;
	}



}