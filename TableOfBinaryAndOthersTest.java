public class TableOfBinaryAndOthersTest{


	public static void main(String[] args){

			TableOfBinaryAndOthers tablePrinter = new TableOfBinaryAndOthers();
			System.out.printf("%s%n",tablePrinter);
		for(int count = 1 ; count<=256; count++){

			String binaryHolder = tablePrinter.printBinary(count);
			String octalHolder = tablePrinter.printOctal(count);
			String hexalDecimalHolder = tablePrinter.printHexalDecimal(count);

				System.out.printf("%15s\t\t\t%15s\t\t\t\t%13s%n",binaryHolder,octalHolder,hexalDecimalHolder);
				

		}
		
	}


}