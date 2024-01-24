public class TimeIncrement{
	private int hour;
	private int seconds;
	private int minute;

	public TimeIncrement(int hour,int minute,int seconds){
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
		if(getSeconds() == 59 ){
				this.seconds = 0;
		}else{
				this.seconds = getSeconds() + 1;
		}
	}
	
	public void incrementMinute(){
		if(getSeconds()==0 && getMinute()==59){
				this.minute = 0;
		}
		else if(getSeconds()== 0 && getMinute()<59){
			this.minute = getMinute() + 1;
		}
		

	}

	public void incrementHour(){
		if(getMinute()==0 && getHour()<=23){
				this.hour = getHour() + 1;
		}
					
		if(getHour()==24){
				this.hour = 0;
		}
	}


	public String toUniversalString(){
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSeconds());
	}

	public String toString(){
		return String.format("%02d:%02d:%02d",((getHour()==12 || getHour()==0) ? 12 : getHour()%12), getMinute(),getSeconds(),(getHour()<12) ? "AM" : "PM" );
	}

}