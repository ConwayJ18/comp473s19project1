import java.util.List;

public class FacilityPortal 
{
	private Campus facilityCampus = new Campus();
	
	//Insert a new facility in the DB
	public void addNewFacility(Facility facility)
	{
		facilityCampus.addNewFacility(facility);
	}
	
	public Facility getFacilityInformation(int id)
	{
		Facility facDetail = facilityCampus.getFacilityInformation(id);
	    return facDetail;
	}
	
	public void removeFacility(int id)
	{
		facilityCampus.removeFacility(id);
	}
	
	public void addFacilityDetail(int id, String name, String address, int phone, int capacity)
	{	
		facilityCampus.addFacilityDetail(id, name, address, phone, capacity);
	}
	
	public List<Facility> listFacilities()
	{
		return facilityCampus.listFacilities();
	}
	
	public int requestAvailableCapacity(Facility fac)
	{
		return facilityCampus.requestAvailableCapacity(fac);
	}
}
