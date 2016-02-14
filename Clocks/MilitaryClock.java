public class MilitaryClock extends Clock{

	public MilitaryClock(){
		super.second = 0;
		super.minute = 0;
		super.hour = 0;
		super.AMPM = "AM";
	}
	public MilitaryClock(int hour, int minute, int second){
		this.minute = minute;
		this.hour = hour;
		this.second = second;
		this.AMPM = "AM";
	}
	public MilitaryClock(int hour, int minute, int second, String APM){
		this.minute = minute;
		//if(APM.equals("AM"))
		this.hour = hour;
		//else if(APM.equals("PM"))
		//this.hour = hour-12;
		this.AMPM = "AM";
		this.second = second;
	}
	@Override
	public String getTime(){
		return "" + this.hour + ":" + this.minute + ":" + this.second; 
	}

}
