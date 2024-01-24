
public class ComputerAssistedInstruction1Test{


	public static void main(String[] args){
		ComputerAssistedInstruction1 assistant  = new ComputerAssistedInstruction1();

		for(int count = 0; count<6;count++){
			 assistant.generateNumber();
				int result = 0;
				int checker = 0;
			do{
				 result = assistant.collectAnswer();
				 checker = assistant.checkAnswer();

			
				if(result != checker){
						assistant.pickWrongResponse();
				
				}else{
					
						assistant.pickCorrectResponse();
						
				}
				
				System.out.println();

			}while(result!=checker);	
			
		}
			System.out.println("Welldone Keep it up and keep reading your books okay!!!");
	}



}