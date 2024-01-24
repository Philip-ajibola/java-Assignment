public class TimeIncrement1{
	private int hour;
	private int seconds;
	private int minute;

	public TimeIncrement1(int hour,int minute,int seconds){
		
		if (hour < 0 || hour >= 24) {
 			throw new IllegalArgumentException("hour must be 0-23");
 		}

 		if (minute < 0 || minute >= 60) {
		 	throw new IllegalArgumentException("minute must be 0-59");
 		}

 		if (seconds < 0 || seconds >= 60) {
		 	throw new IllegalArgumentException("second must be 0-59"); 

		}
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSeconds(){
		return seconds;
	}

	public void incrementSeconds(){
		seconds++;
		if(seconds==60){
			seconds = 0;
		}
		
	}
	
	public void incrementMinute(){
		minute++;
		if(minute==60){
			minute = 0;
		}
		

	}

	public void incrementHour(){
		hour++;
		if(hour==24){
			hour = 0;
		}

	}


	public String toUniversalString(){
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSeconds());
	}

	public String toString(){
		return String.format("%02d:%02d:%02d  %s",((getHour()==12 || getHour()==0) ? 12 : getHour()%12), getMinute(),getSeconds(),(getHour()<12) ? "AM" : "PM" );
	}

}