public class WeatherConditionForSport{

	public void checkWeather(double number1){
			if(number1>=20 && number1<=30){
				System.out.println("It's is a lovely weather for sports today ");
			}
			else if(number1>=10 && number1<20 || number1>30 && number1<=40){
				System.out.println("It's is a reasonable weather for sports today ");
			}else{

				System.out.println("Please exercise with care today,watchout for the weather !!");
			}


	}





}