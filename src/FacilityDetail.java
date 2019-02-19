public class FacilityDetail extends Facility
{
	private String name;
	private String address;
	private int phone;
	private int numRooms;
	
	//Default constructor
	public FacilityDetail()
	{
	}
	
	//Full constructor
	public FacilityDetail(String name, String address, int phone, int numRooms)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.numRooms = numRooms;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public int getNumRooms() 
	{
		return numRooms;
	}
	
	public void setNumRooms(int numRooms) 
	{
		this.numRooms = numRooms;
	}
	
	public int getPhoneNumber() 
	{
		return phone;
	}
	
	public void setPhoneNumber(int phone) 
	{
		this.phone = phone;
	}
}
