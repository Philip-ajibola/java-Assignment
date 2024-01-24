import java.util.Scanner;

public class MultiplicationTable{

	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		System.out.println("Enter An  integer ");
			int number = 0;
			if(input.hasNextInt()){
				number = input.nextInt();
			}else{
				System.out.println("Enter A Valid Number ");
					number = input.nextInt();
			}
				multiplyNumber(number);

		}

	public static void multiplyNumber(int number){
				int result = 0;
		for(int count = 1; count<13; count++){
				result =count * number ;
				System.out.printf("%d X %d = %d%n ",number,count,result);

			}	

	}


}