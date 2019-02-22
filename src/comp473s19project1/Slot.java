package comp473s19project1;

public class Slot
{
	Days days;
	Time startTime;
	Time endTime;
	Duration duration;
	
	public Slot() {}
	
	/**
	 * @param days
	 * @param startTime
	 * @param endTime
	 */
	public Slot(Days days, Time startTime, Time endTime)
	{
		this.days = days;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = new Duration(startTime, endTime);
	}
	
	public Slot(Days days, Time startTime, Duration duration)
	{
		this.days = days;
		this.startTime = startTime;
		this.duration = duration;
		this.endTime = new Time(duration.getDurationInMinutes()/60, duration.getDurationInMinutes()%60);
	}

	/**
	 * @return the days
	 */
	public Days getDays()
	{
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(Days days)
	{
		this.days = days;
	}

	/**
	 * @return the startTime
	 */
	public Time getStartTime()
	{
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Time startTime)
	{
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Time getEndTime()
	{
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Time endTime)
	{
		this.endTime = endTime;
	}

	/**
	 * @return the duration
	 */
	public Duration getDuration()
	{
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}
	
	//Recalculate the duration based on startTime and endTime
	public void calculateDuration()
	{
		this.duration = new Duration(startTime, endTime);
	}
	
	//Recalculate the endTime based on the startTime and duration
	public void calculateEndTime()
	{
		this.endTime = new Time(duration.getDurationInMinutes()/60, duration.getDurationInMinutes()%60);
	}
}
