package es.unileon.prg1;
public class Date{
	private int year;
	private int month; 
	private int day;

	public Date(int day, int month, int year)throws DateException{
		StringBuffer msg = new StringBuffer("");
		if(day<0||day>31){
			msg.append()="Error, the day isn´t between 0 and 31. The wrong day :"+day+"\n";
			if(month<0||month>12){
				msg.append()="Error, the month isn´t between 0 and 12. The wrong month :"+month+"\n";
				if(year<0){
				msg.append()="Error, the year is negative. The wrong month :"+year+"\n";
				}
			}
		}else{
			if(msg.length()==0){
				this.day=day;
				this.month=month;
				this.year=year;
			}
		}
	}
	
	int getDay(){
		return this.day;
	}
	void setDay(int day){
		this.day=day;
	}

	int getMonth(){
		return this.month;
	}
	void setMonth(int month){
		this.month=month;
	}
	
	int getYear(){
		return this.year;
	}
	void setYear(int year){
		this.year=year;
	}
	
	boolean isSameDay(Date otherDate){
		boolean result;
		if(this.day==otherDate.getDay()){
			result=true;
		}else{
			result=false;
		}return result;
	}

	boolean isSameMonth(Date otherDate){
		boolean result;
		if(this.month==otherDate.getMonth()){
			result=true;
		}else{
			result=false;
		}return result;
	}

	boolean isSameYear(Date otherDate){
		boolean result;
		if(this.year==otherDate.getYear()){
			result=true;
		}else{
			result=false;
		}return result;
	}
	 
	boolean isSame(Date otherDate){
		boolean result;
		if(isSameDay(otherDate)==true&&isSameMonth(otherDate)==true&&isSameYear(otherDate)==true){
			result=true;
		}else{
			result=false;
		}return result;
	}
	
	String nameOfMonth(){
		String nameMonth = new String("");
		switch(this.month){
			case 1:
				nameMonth="January";
				break;
			case 2:
				nameMonth="February";
				break;
			case 3:
				nameMonth="March";
				break;
			case 4:
				nameMonth="April";
				break;
			case 5:
				nameMonth="May";
				break;
			case 6:
				nameMonth="June";
				break;
			case 7:
				nameMonth="July";
				break;
			case 8:
				nameMonth="August";
				break;
			case 9:
				nameMonth="September";
				break;
			case 10:
				nameMonth="October";
				break;
			case 11:
				nameMonth="November";
				break;
			case 12:
				nameMonth="December";
				break;
		}return nameMonth;
	}
			
}
	  
	 
