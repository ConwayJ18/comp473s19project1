package comp473s19project1;

import java.util.Collection;

public class FacilityDAO
{
	public FacilityDAO() {}
	
	public Collection<Facility> listFacilities()
	{
		return Database.db.values();
	}
	
	public FacilityDetail getFacilityInformation(Facility f)
	{
		return Database.db.get(f).getFacilityDetail();
	}
	
	public int requestAvailableCapacity(Facility f)
	{
		return Database.db.get(f).getFacilityDetail().getCapacity();
	}
	
	public Facility addNewFacility(Facility f)
	{
		Database.db.put(f, f);
		return Database.db.get(f);
	}
	
	public void addFacilityDetail(Facility f, FacilityDetail fd)
	{
		Database.db.get(f).setFacilityDetail(fd);
	}
	
	public void removeFacility(Facility f)
	{
		Database.db.remove(f);
	}
}
