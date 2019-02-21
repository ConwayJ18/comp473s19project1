package comp473s19project1;

public interface Facility
{
	FacilityLocation getFacilityLocation();
	void setFacilityLocation(FacilityLocation location);
	FacilityDetail getFacilityDetail();
	void setFacilityDetail(FacilityDetail detail);
	FacilityUse getFacilityUse();
	void setFacilityUse(FacilityUse use);
	FacilityMaintenance getFacilityMaintenance();
	void setFacilityMaintenance(FacilityMaintenance maintenance);
}
