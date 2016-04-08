package es.unileon.prg1;
//Autor: Abdul Maiga Cisse
public class Date{
	private int year;
	private int month; 
	private int day;

	public Date(int day, int month, int year)throws DateException{
		StringBuffer msg = new StringBuffer("");
		if(day<=0||day>31){
			msg.append("Error, the day isn´t between 0 and 31. The wrong day :"+day+"\n");
		}if(month<=0||month>12){
			msg.append("Error, the month isn´t between 0 and 12. The wrong month :"+month+"\n");
		}else if (day!=dayOfTheMonthChecker(day,month)){
			msg.append("Error, the day "+day+" does not exist in the month number "+month+"\n");
			
		}if(year<0){
			msg.append("Error, the year is negative. The wrong year :"+year+"\n");
		}if(msg.length()!=0){
			throw new DateException(msg.toString());
		}else{
			this.day=day;
			this.month=month;
			this.year=year;
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
		return (this.day==otherDate.getDay());
	}

	boolean isSameMonth(Date otherDate){
		return (this.month==otherDate.getMonth());
	}

	boolean isSameYear(Date otherDate){
		return (this.year==otherDate.getYear());
	}
	 
	boolean isSame(Date otherDate){
		return (isSameDay(otherDate)==true&&isSameMonth(otherDate)==true&&isSameYear(otherDate)==true);
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
	
	int dayOfTheMonthChecker(int day, int month){
		int goodDay=0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day>0&&day<=31){
					goodDay=day;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>0&&day<=30){
					goodDay=day;
				}
				break;
			case 2:
				if(day>0&&day<=28){
					goodDay=day;
				}
				break;
		}
		return goodDay;
	}
	
	String seasonOfMonth(){
		String season="";
		switch(month){
			case 1:
			case 2:	
				season="Winter";
				break;
			case 12:
				if(day>20){
					season="Winter";
				}else{
					season="Autumn";
				}break;
			case 3:
				if(day<=20){
					season="Winter";
				}else{
					season="Spring";
				}break;
			case 4:
			case 5:	
				season="Spring";
				break;
			case 6:
				if(day>20){
					season="Summer";
				}else{
					season="Spring";
				}break;
			case 7:
			case 8:
				season="Summer";
				break;
			case 9:
				if(day<=20){
					season="Summer";
				}else{
					season="Autumn";
				}break;	
			case 10:
			case 11:
				season="Autumn";
				break;
		}
	return season;
	}
	String monthsLeft(){
		StringBuffer months = new StringBuffer("");
		int i;
		for(i=month;i<=12;i++){
			this.month=i;
			months.append(nameOfMonth()+"\n");
		}
		return months.toString();
	}
	
	String DatePrinter(){
		StringBuffer printedDate = new StringBuffer ("");
		printedDate.append(day+"/"+month+"/"+year);
		return printedDate.toString();
	}
	
	String DatesOfMonth(){
		int i;
		StringBuffer dates= new StringBuffer ("");
		for(i=day;i<=dayOfTheMonthChecker(day,month);i++){
			dates.append(DatePrinter()+"\n");
			day++;
		}
		return dates.toString();
	}
	
	String SameMonthPrinter(){
		int i;
		StringBuffer sameMonth = new StringBuffer ("");
		for(i=day;i==dayOfTheMonthChecker(i,month);i++){
		}
		for(int t=1;t<=12;t++){
			if(dayOfTheMonthChecker(i,t)==0&&dayOfTheMonthChecker((i-1),t)==(i-1)){
				month=t;
				sameMonth.append(nameOfMonth()+"\n");
			}
			
		}
		return sameMonth.toString();
	}
	
	int DaysCounter(){
		int counter=0;
		int i,j=1;
		for(i=1;i<=this.month;i++){
			for(j=1;((j==dayOfTheMonthChecker(j,i)&&j<=day)||(j==dayOfTheMonthChecker(j,i)&&i<month));j++){
				counter++;
			}
		} 		
		return counter;
	}

	int randomDate(){
		int _day=0;
		int _month=0;
		int counter=0;
		while(_day!=this.day||_month!=this.month){
			_day = (int) (Math.random()*31+1);
			_month = (int) (Math.random()*12+1);
			counter++;
		}
		return counter;
	}
			
	int randomDateDoWhile(){
		int _day=0;
		int _month=0;
		int counter=0;
		do{
			_day = (int) (Math.random()*31+1);
			_month = (int) (Math.random()*12+1);
			counter++;
		}while(_day!=this.day||_month!=this.month);
		return counter;
	}		
}
	  
	 
