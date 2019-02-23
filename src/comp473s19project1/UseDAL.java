package comp473s19project1;

import java.util.ArrayList;

public class UseDAL
{
	public boolean isInUseDuringInterval(Facility f, Date d, Time start, Time end)
	{
		Slot comp = new Slot(d, start, end);
		for(Slot s : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
		{
			if(s.overlaps(comp))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isInUseDuringInterval(Facility f, Days d, Time start, Time end)
	{
		Slot comp = new Slot(d, start, end);
		for(Slot s : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
		{
			if(s.overlaps(comp))
			{
				return true;
			}
		}
		
		return false;
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
