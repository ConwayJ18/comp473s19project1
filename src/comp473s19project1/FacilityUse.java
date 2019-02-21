package comp473s19project1;

public class FacilityUse
{
	FacilityUser user;
	UseSchedule schedule;
	
	public FacilityUse() {}
	
	/**
	 * @param user
	 * @param schedule
	 */
	public FacilityUse(FacilityUser user, UseSchedule schedule)
	{
		this.user = user;
		this.schedule = schedule;
	}

	/**
	 * @return the user
	 */
	public FacilityUser getUser()
	{
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(FacilityUser user)
	{
		this.user = user;
	}

	/**
	 * @return the schedule
	 */
	public UseSchedule getSchedule()
	{
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(UseSchedule schedule)
	{
		this.schedule = schedule;
	}
}
