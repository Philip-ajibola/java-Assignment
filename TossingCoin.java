
import java.security.SecureRandom;
import java.util.Scanner;

public class TossingCoin{

	enum Coin{ HEAD,TAIL}

	public static void main(String[] args){
		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter 1 to \" toss coin\"");
		System.out.println("Enter 2 to Stop");
			int number = 0;
			int headCounter = 0;
			int tailCounter = 0;

		while(input.hasNextInt()){
			number = input.nextInt();
				switch(number){
					case 1:
						Coin checker = flip(random);
						if(checker==Coin.HEAD){
								headCounter++; 
						}else{
							tailCounter++;
						}
						break;
					case 2:
						System.out.println("Exiting Game\n GoodBye!");
					break;
					default:
						System.out.println("You Enter an invalid number");
				
				}
			if(number==2){
			break;
			}
			
		System.out.println("\nDo You Want to continue??\nEnter 1 to \" toss coin\"");
		System.out.println("Enter 2 to Stop");

		}
		System.out.println("Numbers of times You tossed the Coin is " + (tailCounter + headCounter));
		System.out.println("Numbers of time You Head Appear " + headCounter);
		System.out.println("Numbers of time You Tail Appear " + tailCounter);


	}

	public static Coin flip(SecureRandom random){
		int flipCoin = random.nextInt(2);
		if(flipCoin == 0){
			return	Coin.HEAD;
		}else{
			return Coin.TAIL;
		}
	}
		

}