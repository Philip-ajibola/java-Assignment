import java.util.Scanner;

public class YearOfBirth1Test{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		YearOfBirth1 year = new  YearOfBirth1();
	System.out.println("Enter your year of birth ");
		int yearOfBirth = 0;
		if(input.hasNextInt()){
			yearOfBirth = input.nextInt();
				while(yearOfBirth<1){
					System.out.println("Enter A Valid Year Please ");
						input.next();
					yearOfBirth = input.nextInt();
					

		}
		}else{
			System.out.println("Please Enter A Valid Year\nEnter your year of birth ");
					input.next();
				yearOfBirth = input.nextInt();
				while(yearOfBirth<1){
					System.out.println("Enter A Valid Year Please ");
						input.next();
					yearOfBirth = input.nextInt();
			}

			year.printAge(yearOfBirth);
			
	}


}