package comp473s19project1;

public class FacilityDriver
{
	public static void main(String args[])
	{
		//Begin creation of test objects
		FacilityDAL fdal = new FacilityDAL();
		
		FacilityLocation fl1 = new FacilityLocation(1032, "W", "Sheridan Rd", "Chicago", "IL", 60626, "United States");
		FacilityDetail fd1 = new FacilityDetail(1, "Information Commons", 5574, 67000);
		
		Time start1 = new Time(1, 0);
		Time end1 = new Time(2, 0);
		Days d1 = new Days(true,false,true,false,true,false,false);
		Slot s1 = new Slot(d1, start1, end1);
		FacilityUser fu1 = new FacilityUser("jaconway", "Jess Conway", 7864938008l, "jconway6@luc.edu", "Admin");
		UseSchedule us1 = new UseSchedule();
		FacilityUse u1 = new FacilityUse(fu1, us1);
		
		Time start2 = new Time(7, 15);
		Time end2 = new Time(9, 20);
		Date d2 = new Date(3, 30, 2019);
		Slot s2 = new Slot(d2, start2, end2);
		MaintenanceSchedule ms1 = new MaintenanceSchedule();
		MaintenanceOrder mo1 = new MaintenanceOrder();
		MaintenanceLog ml1 = new MaintenanceLog();
		MaintenanceRequest mr1 = new MaintenanceRequest();
		FacilityMaintenance m1 = new FacilityMaintenance(ms1, mo1, ml1, mr1);
		
		Time start3 = new Time(15, 29);
		Time end3 = new Time(19, 17);
		Date d3 = new Date(12,21,2019);
		Slot s3 = new Slot(d3, start3, end3);
		Inspection i1 = new Inspection("Fire", s3);
		Facility f1 = new Building(fl1, fd1, u1, m1, i1);
		//End creation of test objects
	}
}