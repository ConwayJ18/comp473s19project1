import java.time.LocalDate;

public class FacilityUse extends Facility
{
	
	private int roomNum;
	private LocalDate start;
	private LocalDate end;

	//Default constructor
	public FacilityUse()
	{
	}
	
	//Full constructor
	public FacilityUse(int roomNum, LocalDate start, LocalDate end)
	{
		this.roomNum = roomNum;
		this.start = start;
		this.end = end;
	}
	
	public int getRoomNumber()
	{
		return roomNum;
	}

	public void setRoomNumber(int roomNum)
	{
		this.roomNum = roomNum;
	}

	public LocalDate getStartDate() 
	{
		return start;
	}

	public void setStartDate(LocalDate start)
	{
		this.start = start;
	}

	public LocalDate getEndDate() 
	{
		return end;
	}

	public void setEndDate(LocalDate end)
	{
		this.end = end;
	}

}