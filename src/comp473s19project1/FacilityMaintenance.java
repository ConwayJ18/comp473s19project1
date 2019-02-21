package comp473s19project1;

public class FacilityMaintenance
{
	MaintenanceSchedule maintSchedule;
	MaintenanceOrder maintOrder;
	MaintenanceLog maintLog;
	MaintenanceRequest maintReq;
	
	FacilityMaintenance(){}

	/**
	 * @return the maintSchedule
	 */
	public MaintenanceSchedule getMaintSchedule() {
		return maintSchedule;
	}

	/**
	 * @param maintSchedule the maintSchedule to set
	 */
	public void setMaintSchedule(MaintenanceSchedule maintSchedule) {
		this.maintSchedule = maintSchedule;
	}

	/**
	 * @return the maintOrder
	 */
	public MaintenanceOrder getMaintOrder() {
		return maintOrder;
	}

	/**
	 * @param maintOrder the maintOrder to set
	 */
	public void setMaintOrder(MaintenanceOrder maintOrder) {
		this.maintOrder = maintOrder;
	}

	/**
	 * @return the maintLog
	 */
	public MaintenanceLog getMaintLog() {
		return maintLog;
	}

	/**
	 * @param maintLog the maintLog to set
	 */
	public void setMaintLog(MaintenanceLog maintLog) {
		this.maintLog = maintLog;
	}

	/**
	 * @return the maintReq
	 */
	public MaintenanceRequest getMaintReq() {
		return maintReq;
	}

	/**
	 * @param maintReq the maintReq to set
	 */
	public void setMaintReq(MaintenanceRequest maintReq) {
		this.maintReq = maintReq;
	}
	
	
}
