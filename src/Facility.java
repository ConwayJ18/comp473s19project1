public class Facility
{
	private int facilityID;
	private FacilityDetail details;
	
	//Empty constructor
	public Facility()
	{
		
	}
	
	//Constructor with ID
	public Facility(int id)
	{
		this.facilityID = id;
	}
	
	//Returns facility detail object
	public FacilityDetail getDetailsAboutFacility()
	{
		return details;
	}
	
	//Associates FacilityDetail object with Facility
	public void setDetailsAboutFacility(FacilityDetail details)
	{
		this.details = details;
	}

	//Gives Facility specific ID
	public void setFacilityID(int id)
	{
		this.facilityID = id;
	}

	//Returns ID associated with facility
	public int getFacilityID()
	{
		return facilityID;
	}
}