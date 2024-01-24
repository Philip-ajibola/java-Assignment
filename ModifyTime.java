public class ModifyTime{
	private int secondsSinceMidNight;

	public void setTime(int hour,int minute,int seconds){
		if(hour<0 || hour>23){
			throw new IllegalArgumentException("hour must be 0-23");
		}

		if(minute<0 || minute>59){
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		if(seconds<0 || seconds>59){
			throw new IllegalArgumentException("seconds must be 0-59");
		}
		
		secondsSinceMidNight = hour*3600 + minute*60 + seconds;

	}
	
	public int getHour(){
		return secondsSinceMidNight/3600;
	}

	public int getMinute(){
		return (secondsSinceMidNight%3600)/60;	
	}

	public int getSeconds(){
		return secondsSinceMidNight%60;
	}


	public String toUniversalString(){
			return String.format("%02d/%02d/%02d",getHour(),getMinute(),getSeconds());
	}

	public String toString(){
		return String.format("%02d/%02d/%02d %s",((getHour()==0 || getHour()==12) ? 12 : getHour()%12),getMinute(),getSeconds(),(getHour()>12) ? "PM" : "AM");
	}
}







