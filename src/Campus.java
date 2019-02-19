import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campus
{
	public Map<Integer, Facility> FacilitiesList;
	
	Campus()
	{
		this.FacilitiesList = new HashMap<Integer, Facility>();
	}
	
	public void addNewFacility(Facility facility)
	{
		FacilitiesList.put(facility.getFacilityID(), facility);
	}
	
	public Facility getFacilityInformation(int facilityID)
	{
		return FacilitiesList.get(facilityID).getDetailsAboutFacility();
	}
	
	public void removeFacility(int id) 
	{
		FacilitiesList.remove(id);
	}
	
	public void addFacilityDetail(int facilityID, String name, String address, int phone, int capacity)
	{
		FacilitiesList.get(facilityID).setDetailsAboutFacility(new FacilityDetail(name, address, phone, capacity));
	}
	
	public List<Facility> listFacilities()
	{
		List<Facility> facilities = new ArrayList<Facility>();
		
		for(Integer facilityID : FacilitiesList.keySet())
		{
			 facilities.add(FacilitiesList.get(facilityID));
		}
		
		return facilities;
	}
	
	public int requestAvailableCapacity(Facility facility)
	{
		return facility.getDetailsAboutFacility().getCapacity();
	}
}
