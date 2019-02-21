package comp473s19project1;

public class Building implements Facility
{
	FacilityLocation location;
	FacilityDetail detail;
	FacilityUse use;
	FacilityMaintenance maintenance;

	Building(){}
	
	/**
	 * @param location
	 * @param detail
	 * @param use
	 * @param maintenance
	 */
	public Building(FacilityLocation location, FacilityDetail detail, FacilityUse use,
			FacilityMaintenance maintenance) {
		this.location = location;
		this.detail = detail;
		this.use = use;
		this.maintenance = maintenance;
	}

	/**
	 * @return the location
	 */
	@Override
	public FacilityLocation getFacilityLocation()
	{
		return location;
	}

	/**
	 * @param location the location to set
	 */
	@Override
	public void setFacilityLocation(FacilityLocation location)
	{
		this.location = location;
	}

	/**
	 * @return the detail
	 */
	@Override
	public FacilityDetail getFacilityDetail()
	{
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	@Override
	public void setFacilityDetail(FacilityDetail detail)
	{
		this.detail = detail;
	}

	/**
	 * @return the use
	 */
	@Override
	public FacilityUse getFacilityUse()
	{
		return use;
	}

	/**
	 * @param use the use to set
	 */
	@Override
	public void setFacilityUse(FacilityUse use)
	{
		this.use = use;
	}

	/**
	 * @return the maintenance
	 */
	@Override
	public FacilityMaintenance getFacilityMaintenance()
	{
		return maintenance;
	}

	/**
	 * @param maintenance the maintenance to set
	 */
	@Override
	public void setFacilityMaintenance(FacilityMaintenance maintenance)
	{
		this.maintenance = maintenance;
	}
}
