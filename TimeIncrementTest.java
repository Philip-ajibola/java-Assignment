public class TimeIncrementTest{

	public static void main(String[] args){
		TimeIncrement increment = new TimeIncrement(11,59,59);
		
		increment.incrementSeconds();
		increment.incrementMinute();
		increment.incrementHour();

		System.out.printf("Universal Time: %s \nNormal Time: %s",increment.toUniversalString(),increment.toString());
	}




}