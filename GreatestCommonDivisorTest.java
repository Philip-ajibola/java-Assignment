import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestCommonDivisorTest{

	public static void main(String[] args){
		GreatestCommonDivisor commonDivisor = new GreatestCommonDivisor();
		Scanner input = new Scanner(System.in);	
			int firstNumber = 0;
			int secondNumber = 0;
	while(true){
		try{
				
			System.out.println("Enter First number ");
				if(input.hasNextInt()){
				 firstNumber = input.nextInt();
				break;
				}else{
				
				System.out.println("Invalid Input ");	
				}
		
		}
		catch(InputMismatchException e){
				
			System.out.println("InputMismatchException: " + e);
				
			System.out.println("Enter A Valid number");
					}
		input.next();		
	}
		
	while(true){
			
		try{
				
			System.out.println("Enter Second number ");
				if(input.hasNextInt()){
				 secondNumber = input.nextInt();
					break;
				}else{
				System.out.println("Invalid Input ");	
				}

		}
		catch(InputMismatchException e){
			System.out.println("InputMismatchException: " + e);
				System.out.println("Enter A Valid number");
		}
			input.next();
	}
	
		int greatestCommonDivisor = commonDivisor.findCommonDivisor(firstNumber,secondNumber);
		System.out.println(greatestCommonDivisor);
	}

}