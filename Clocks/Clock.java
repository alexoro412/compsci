public class Clock{

	public int minute;
	public int hour;
	public int second;
	public String AMPM;


	public Clock(){
		this.minute = 0;
		this.hour = 0;
		this.second = 0;
		this.AMPM = "AM";
	}

	public Clock(int hour, int minute, int second){
		this.minute = minute;
		this.hour = hour;
		this.second = second;
		this.AMPM = "AM";
	}
	public Clock(int hour, int minute, int second, String APM){
		this.minute = minute;

		if(hour>12){
			this.hour = hour-12;	
		}else if(hour==0){
			this.hour = 12;
		}else{
			this.hour = hour;
		}

		//if(APM.equals("AM"))
		//this.hour = hour;
		//else if(APM.equals("PM"))
		//this.hour = hour-12;
		this.AMPM = APM;
		this.second = second;
	}
	public String getAMPM(){
		return AMPM;
	}

	public String getTime(){
		return "" + this.hour + ":" + this.minute + ":" + this.second + " " + this.AMPM;
	}

}
