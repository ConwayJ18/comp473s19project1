package comp473s19project1;

import java.util.ArrayList;

public class MaintenanceDAO
{
	public MaintenanceDAO() {}
	
	public void makeFacilityMaintRequest(Facility f, MaintenanceRequest mr)
	{
		Database.db.get(f).getFacilityMaintenance().addMaintReq(mr);
	}
	
	public void scheduleMaintenance(Facility f, MaintenanceOrder mo, Slot s)
	{
		Database.db.get(f).getFacilityMaintenance().addOrderToSchedule(mo, s);
	}
	
	//TODO
	public int calcMaintenanceCostForFacility(Facility f)
	{
		int totalCost = 0;
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintOrders())
		{
			totalCost += o.getCost();
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintSchedule().getSchedule().keySet())
		{
			totalCost += o.getCost();
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintLog().getLog().keySet())
		{
			totalCost += o.getCost();
		}
		
		return totalCost;
	}
	
	//TODO
	public int calcProblemRateForFacility(Facility f)
	{
		return 0;
	}
	
	//TODO
	public int calcDownTimeForFacility(Facility f)
	{
		return 0;
	}
	
	public ArrayList<MaintenanceRequest> listMaintRequests(Facility f)
	{
		return Database.db.get(f).getFacilityMaintenance().getMaintReqs();
	}
	
	public ArrayList<MaintenanceOrder> listMaintenance(Facility f)
	{
		return Database.db.get(f).getFacilityMaintenance().getMaintOrders();
	}
	
	public MaintenanceSchedule listFacilityProblems(Facility f)
	{
		return Database.db.get(f).getFacilityMaintenance().getMaintSchedule();
	}
}
