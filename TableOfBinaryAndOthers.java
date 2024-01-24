public class TableOfBinaryAndOthers{


	public String printBinary(int number){
		int remainder = 0;
		String result ="";
		String reverse ="";
		
		//for(int c
			while(number!=0){
				remainder = number%2;
				result +="" + remainder; 
				number =number/2;
				

		}
		

		for(int counter = result.length()-1;counter>=0;counter--){
			reverse +="" + result.charAt(counter); 
		}
			return reverse;
	}

	public String printOctal(int number){
		int remainder = 0;
		String numberString ="" + number;
		String result ="";
		String reverse ="0";

		while(number != 0){
			remainder = number%8;
			number = number/8;
			result +="" + remainder; 
		}

		for(int counter = result.length()-1;counter>=0;counter--){
			reverse +="" + result.charAt(counter);

		}
			return reverse;
	}

	public String printHexalDecimal(int number){
		int remainder = 0;
		String numberString ="" + number;
		String result ="";
		String reverse ="";

			while(number!=0){
			remainder = number%16;
			number = number/16;
			switch(remainder){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 7:
				case 8:
				case 9:
					result +="" + remainder;
				break;
				case 10:
					result +="A"; 
				break;
				case 11:
					result +="B";
				break;
				case 12:
					result +="C";
				break;
				case 13:
					result +="D";	
				break;
				case 14: 
					result +="E";	
				break;
				default:
					result +="F";
				
			}		
		}

		for(int counter = result.length()-1;counter>=0;counter--){
			reverse +="" + result.charAt(counter);

		}
			return reverse;
	}

		public String toString(){
			return String.format("%25s\t%25s\t%30s%n","BinaryValue of 1-256","OctalValue of 1-256 ","HexalDecimalValue of 1-256");
		}

}