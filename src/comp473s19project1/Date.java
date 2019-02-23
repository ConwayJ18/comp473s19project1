package comp473s19project1;

public class Date
{
	int month;
	int day;
	int year;
	
	public Date() {}
	
	/**
	 * @param month
	 * @param day
	 * @param year
	 */
	public Date(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	/**
	 * @return the month
	 */
	public int getMonth()
	{
		return month;
	}
	
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	/**
	 * @return the day
	 */
	public int getDay()
	{
		return day;
	}
	
	/**
	 * @param day the day to set
	 */
	public void setDay(int day)
	{
		this.day = day;
	}
	
	/**
	 * @return the year
	 */
	public int getYear() 
	{
		return year;
	}
	
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	
}
