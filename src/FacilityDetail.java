public class FacilityDetail extends Facility
{
	private String name;
	private String address;
	private int phone;
	private int capacity;
	
	//Default constructor
	public FacilityDetail()
	{
	}
	
	//Full constructor
	public FacilityDetail(String name, String address, int phone, int capacity)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.capacity = capacity;
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
	
	public int getCapacity() 
	{
		return capacity;
	}
	
	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
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
