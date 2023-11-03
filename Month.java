class Month{

	String name;
	int noOfDays;
	int noOfWeekEnds;
	int noOfHolidays;
	
	Month(String name, int noOfDays, int noOfWeekEnds, int noOfHolidays)
	{
	this.name=name;
	this.noOfDays=noOfDays;
	this.noOfWeekEnds=noOfWeekEnds;
	this.noOfHolidays=noOfHolidays;
	
	}
	void displyInfo()
	{
		System.out.println("Strating  displyInfo in Month");
		System.out.println("the month name:"+this.name);
		System.out.println("no of days:"+this.noOfDays);
		System.out.println("no Of Week Ends:"+this.noOfWeekEnds);
		System.out.println("no Of Holidays:"+this.noOfHolidays);
		System.out.println("ending  displyInfo in Month");		
	}


}