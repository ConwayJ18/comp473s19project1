public class Inspection
{

	private int facilityID;
	private String inspectType;
	private String inspectDetail;
	
	//Default constructor
	public Inspection()
	{
	}

	//Full constructor
	public Inspection(int id, String type, String detail)
	{
		this.facilityID = id;
		this.inspectType = type;
		this.inspectDetail = detail;
	}
	
	public String getInspectionType() 
	{
		return inspectType;
	}

	public void setInspectionType(String type) 
	{
		this.inspectType = type;
	}

	public String getInspectionDetail() 
	{
		return inspectDetail;
	}

	public void setInspectionDetail(String detail)
	{
		this.inspectDetail = detail;
	}

	public int getFacilityID()
	{
		return facilityID;
	}

	public void setFacilityID(int id)
	{
		this.facilityID = id;
	}
	
}