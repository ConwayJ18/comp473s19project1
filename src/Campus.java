import java.util.HashMap;
import java.util.Map;

public class Campus
{
	int id = 1;
	Map<Integer, Facility> FacilitiesList = new HashMap<Integer, Facility>();
	
	public Facility addNewFacility()
	{
		FacilitiesList.put(id++, new Facility(id));
		return FacilitiesList.get(id-1).getFacilityInformation();
	}
	
	public Facility removeFacility(int facilityID) 
	{
		FacilitiesList.remove(facilityID);
		return FacilitiesList.get(facilityID).getFacilityInformation();
	}
			
	public int[] listFacilities()
	{
		int[] facilities = new int[FacilitiesList.size()];
		int i=0;
		
		for(Integer facilityID : FacilitiesList.keySet())
		{
			 facilities[i] = facilityID;
			 i++;
		}
		
		return facilities;
	}
	
	public void addFacilityDetail(int facilityID, String facilityName, int facilityCapacity)
	{
		FacilitiesList.get(facilityID).addFacilityDetail(facilityName, facilityCapacity);
	}
	
	public Facility getFacilityInformation(int facilityID)
	{
		return FacilitiesList.get(facilityID).getFacilityInformation();
	}
	
	public int requestAvailableCapacity(int facilityID)
	{
		return FacilitiesList.get(facilityID).requestAvailableCapacity();
	}
	
}
