import java.util.Scanner;

public class Factorial{

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter A positive Number Between 1 and 20");
				int number = 0;
				if(input.hasNextInt()){
						number = input.nextInt();
						while(number<1 || number >20 ){
								System.out.println("Please Read The Instructions \n Enter A positive Number Between 1 and 20");
									number = input.nextInt();

						}					
				
				}else{
						System.out.println("Enter An Integer Please");
							input.next();
						number = input.nextInt();
							
							while(number<1 || number >20 ){
								System.out.println("Please Read The Instructions \n Enter A positive Number Between 1 and 20");
									number = input.nextInt();
							}

					}
					
						printFactorial(number);

		}


		public static void printFactorial(int number){
			System.out.printf("%d Factorial ====> ",number);
					int totalFactorial = 1;
			for(int count = number;count>=1;count--){
						totalFactorial *=count;
					System.out.print(count);
					if(count<=number && count >1 ){
					System.out.print(" X ");
					}
			}
			System.out.printf(" = %d",totalFactorial);
		}





}