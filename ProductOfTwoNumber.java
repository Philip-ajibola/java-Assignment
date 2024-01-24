import java.util.Scanner;

public class ProductOfTwoNumber{


		public static void main(String[] args){
				Scanner input = new Scanner(System.in);

			System.out.print("Enter Two Integer numbers ");
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				
			System.out.print(displayProductOfTwoNumbers(number1,number2));
			 
		}



		public static int displayProductOfTwoNumbers(int number1, int number2){
				int product = 0;

				if(number1<0 && number2>0){
					for(int count = 1; count<=number2;count++){
							product -= number1;
							
					}
						product/= -1;
				}
				
				else if(number2<0 && number1>0){
					for(int count = 1; count<=number1;count++){
						product -= number2;
						
					}
						product/= -1;
				}	
				else if(number1>0 && number2>0){	
					for(int count = 1; count<=number2;count++){
						product += number1; 
						
					}
				}

				else if(number1<0 && number2<0){
						number2 /=-1;
					for(int count = 1; count<=number2;count++){
						product -= number1; 
				}

					}
				
				
				return product;
		}



}