package com.city.bokaro;

import java.util.Set;

public class SubSector extends Sector{
    private String subSectorName;
    private String sectorName;

    public SubSector(int id, Set<Block> blocks, Set<School> schools, CommunityCentre communityCentre, HealthCentre healthCentre, MaintenanceOffice maintenanceOffice, String subSectorName) {
        super(id, blocks, schools, communityCentre, healthCentre, maintenanceOffice);
        this.subSectorName = subSectorName;
        this.sectorName = id+subSectorName;
    }

    public SubSector(int id, String subSectorName) {
        super(id);
        this.subSectorName = subSectorName;
        this.sectorName = id+subSectorName;
    }

    public String getSubSectorName() {
        return subSectorName;
    }

    public void setSubSectorName(String subSectorName) {
        this.subSectorName = subSectorName;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
