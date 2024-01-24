import java.util.Scanner;

public class RoundingNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter A Decimal Number ");
		double number = input.nextDouble();
		double numberRounded = Math.floor(number  + 0.5);
		
		System.out.printf("The Original Decimal Number You Input is %.2f%n ",number);

			System.out.printf("The Rounded Decimal Number You Input is %.2f%n ",numberRounded);
	}




}