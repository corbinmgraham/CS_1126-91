import java.util.Scanner; // program uses class Scanner

public class HeartRates
{
	String fName = "";
	String lName = "";
	int day, month, year, age, ageInDays;
	int maxHeartRate = 0;
	double targetHeartRate1 = 0, targetHeartRate2 = 0;
	
	public HeartRates(String fName, String lName, int day, int month, int year)
	{
		this.fName = fName;
		this.lName = lName;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int calculateAge(int day, int month, int year)
	{
		//Calculate Age to days
		age = 2015 - year;
		if (calculateDayOfYear(month, day) > calculateDayOfYear(3, 3))
		{
			--age;
		}
		return age;
	}
	public int calctulateAgeInDays( int day, int month, int year)
	{
		age = 2015 - year;
		if (calculateDayOfYear(month, day) > calculateDayOfYear(3, 3))
		{
			--age;
		}
		ageInDays = 365 * age;
		
		return ageInDays;
		
	}
	
	public int calculateDayOfYear(int month, int day)
	{
		int dayOfYear = day;
		
		if (--month == 0) return dayOfYear; // January
		dayOfYear += 31;
		if (--month == 0) return dayOfYear; // Febuary
		dayOfYear += 28;
		if (--month == 0) return dayOfYear; // March
		dayOfYear += 31; 
		if (--month == 0) return dayOfYear; // April
		dayOfYear += 30;
		if (--month == 0) return dayOfYear; // May
		dayOfYear += 31;
		if (--month == 0) return dayOfYear; // June
		dayOfYear += 30;
		if (--month == 0) return dayOfYear; // July
		dayOfYear += 31;
		if (--month == 0) return dayOfYear; // August
		dayOfYear += 31;
		if (--month == 0) return dayOfYear; // September
		dayOfYear += 30;
		if (--month == 0) return dayOfYear; // October
		dayOfYear += 31;
		if (--month == 0) return dayOfYear; // November
		dayOfYear += 30;
		return dayOfYear;
	}
	public int calculateMaxHeartRate()
	{
		maxHeartRate = 220 - age;
		// Calculate Target Heart Rate
		return maxHeartRate;
	}
	public String calculateTargetHeartRate()
	{
		targetHeartRate1 = .50 * maxHeartRate;
		targetHeartRate2 = .85 * maxHeartRate;
		return ("between " + targetHeartRate1 + " and " + targetHeartRate2);
	}
	
	//Gets and Sets
	
	private void setFName(String fName)
	{
		this.fName = fName;
	}
	public String getFName()
	{
		return fName;
	}
	private void setLName(String lName)
	{
		this.lName = lName;
	}
	public String getLName()
	{
		return lName;
	}
	private void setDay(int day)
	{
		this.day = day;
	}
	public int getDay()
	{
		return day;
	}
	private void setMonth(int month)
	{
		this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
	private void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return year;
	}
}