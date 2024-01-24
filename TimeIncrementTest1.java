public class TimeIncrementTest1{

	public static void main(String[] args){
		
		try{
			TimeIncrement1 increment = new TimeIncrement1(23,61,59);
			increment.incrementSeconds();
			increment.incrementMinute();
			increment.incrementHour();

			System.out.printf("Universal Time: %s \nNormal Time: %s",increment.toUniversalString(),increment.toString());


		}
		catch(IllegalArgumentException e){
				System.out.printf("Exception During Initialization: %s",e.getMessage());
			}

	}




}