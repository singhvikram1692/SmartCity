package com.city.bokaro;

import java.util.List;
import java.util.Set;

public class Sector {
    private int id;
    private Set<Block> blocks;
    private Set<School> schools;
    private CommunityCentre communityCentre;
    private HealthCentre healthCentre;
    private MaintenanceOffice maintenanceOffice;
    private List<ReligiousPlace> religiousPlaces;

    public Sector(int id) {
        this.id = id;
    }

    public Sector(int id, Set<Block> blocks, Set<School> schools, CommunityCentre communityCentre, HealthCentre healthCentre, MaintenanceOffice maintenanceOffice) {
        this.id = id;
        this.blocks = blocks;
        this.schools = schools;
        this.communityCentre = communityCentre;
        this.healthCentre = healthCentre;
        this.maintenanceOffice = maintenanceOffice;
    }

    public Sector(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(Set<Block> blocks) {
        this.blocks = blocks;
    }

    public Set<School> getSchools() {
        return schools;
    }

    public void setSchools(Set<School> schools) {
        this.schools = schools;
    }

    public CommunityCentre getCommunityCentre() {
        return communityCentre;
    }

    public void setCommunityCentre(CommunityCentre communityCentre) {
        this.communityCentre = communityCentre;
    }

    public HealthCentre getHealthCentre() {
        return healthCentre;
    }

    public void setHealthCentre(HealthCentre healthCentre) {
        this.healthCentre = healthCentre;
    }

    public MaintenanceOffice getMaintenanceOffice() {
        return maintenanceOffice;
    }

    public void setMaintenanceOffice(MaintenanceOffice maintenanceOffice) {
        this.maintenanceOffice = maintenanceOffice;
    }

    public List<ReligiousPlace> getReligiousPlaces() {
        return religiousPlaces;
    }

    public void setReligiousPlaces(List<ReligiousPlace> religiousPlaces) {
        this.religiousPlaces = religiousPlaces;
    }
}
