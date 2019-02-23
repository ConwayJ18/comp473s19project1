package comp473s19project1;

import java.util.ArrayList;

public class UseDAL
{
	//TODO
	public Object isInUseDuringInterval(Facility f, Date d, Time start, Time end)
	{
		return null;
	}
	
	public void assignFacilityToUse(Facility f, UseRequest ur)
	{
		Database.db.get(f).getFacilityUse().getSchedule().getSchedule().put(ur, ur.getTimeslot());
	}
	
	public void vacateFacility(Facility f)
	{
		Database.db.get(f).getFacilityUse().getSchedule().getSchedule().clear();
	}
	
	public ArrayList<Inspection> listInspections(Facility f)
	{
		return Database.db.get(f).getInspections();
	}
	
	public UseSchedule listActualUsage(Facility f)
	{
		return Database.db.get(f).getFacilityUse().getSchedule();
	}
	
	//TODO
	public Object calcUsageRate(Facility f)
	{
		return null;
	}
}
