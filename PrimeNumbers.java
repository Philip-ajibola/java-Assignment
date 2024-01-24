import java.util.Scanner;

public class PrimeNumbers{


		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
				int number = 0;
			System.out.println("Enter A Positive Integer ");
				if(input.hasNextInt()){
					number = input.nextInt();
					while(number<1){
							System.out.println("Please Read The Instructions \n Enter A Positive Integer ");
								number = input.nextInt();
						}
				}else{
						System.out.println("Enter An Integer Please \n Enter A Positive Integer");
							number = input.nextInt();
					while(number<1){
							System.out.println("Please Read The Instructions \n Enter A Positive Integer ");
								number = input.nextInt();
						}	
				}


				checkPrime(number);
			}


		public static void checkPrime(int number){
			int factor = 0;
			for(int count = 1; count<= number/2;count++){
					if(number%count == 0){
						factor++;
					}
			}
				if(factor ==1){
					System.out.print(number + " is a prime number ");
				}else{

					System.out.print(number + " is not a prime number ");

				}
		}
}