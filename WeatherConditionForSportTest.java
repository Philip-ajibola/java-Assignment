import java.util.Scanner;
import java.util.InputMismatchException;

public class WeatherConditionForSportTest{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		WeatherConditionForSport weatherCondition = new WeatherConditionForSport();
			double number = 0;
	//while(input.hasNextInt()){
		try{
			System.out.println("Enter The Water Condition In Celcius");
				 number = input.nextDouble();
		}

		catch(InputMismatchException err){
				input.next();
			System.out.println("An Illegal Type Enter Was Enter ");
			System.out.println("Enter The Water Condition In Celcius");
				 number = input.nextDouble();


		}
	//}
		weatherCondition.checkWeather(number);
	}

}