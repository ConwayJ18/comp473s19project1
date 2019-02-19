public class Maintenance extends Facility
{
	private String details;
	private int cost;
	
	//Default constructor
	public Maintenance()
	{
	}
	
	//Full constructor
	public Maintenance(String details, int cost)
	{
		this.details = details;
		this.cost = cost;
	}
	
	public String getDetails(String details)
	{
		return details;
	}
	
	public void setDetails()
	{
		this.details = details;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	public void setCost(int cost) 
	{
		this.cost = cost;
	}
}