
public class Facility
{
	int facilityID;
	String facilityName;
	int facilityCapacity;
	
	Facility(int id)
	{
		this.facilityID = id;
	}
	
	public Facility getFacilityInformation()
	{
		return null;
	}
	
	public int requestAvailableCapacity()
	{
		return this.facilityCapacity;
	}
	
	public void addFacilityDetail(String name, int capacity)
	{
		this.facilityName = name;
		this.facilityCapacity = capacity;
	}
	
	public object isInUseDuringInterval()
	{
		
	}
	
	public object assignFacilityToUse()
	{
		
	}
	
	public object vacateFacility()
	{
		
	}
	
	public object listInspections()
	{
		
	}
	
	public object listActualUsage()
	{
		
	}
	
	public object calcUsageRate()
	{
		
	}
	
	public object makeFacilityMaintRequest()
	{
		
	}
	
	public object scheduleMaintenance()
	{
		
	}
}
