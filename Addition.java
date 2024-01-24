import java.util.Scanner;

public class Addition{

	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three number");
			int number = input.nextInt();
			int number2 = input.nextInt();
			int number3 = input.nextInt();

		int sum = number + number2 + number3;
		System.out.print(sum);
	}


}