package com.city.bokaro;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Creating quarter objects
        Quarter quarter_2307 = new Quarter(2307, "A", "Ground");
        Quarter quarter_2308 = new Quarter(2308, "A", "Ground");
        Quarter quarter_2309 = new Quarter(2309, "A", "Ground");
        Quarter quarter_2310 = new Quarter(2310, "A", "Ground");
        Quarter quarter_2311 = new Quarter(2311, "A", "First");
        Quarter quarter_2312 = new Quarter(2312, "A", "First");

        // set of quarter which forms a block
        Set<Quarter> block_1_quarters = new HashSet<>();

        //adding quarters to the block
        block_1_quarters.add(quarter_2307);
        block_1_quarters.add(quarter_2308);
        block_1_quarters.add(quarter_2309);
        block_1_quarters.add(quarter_2310);
        block_1_quarters.add(quarter_2311);
        block_1_quarters.add(quarter_2312);

        // creating a block object.....could be many blocks in a sector
        Block block1 = new Block(block_1_quarters);

        //creating a set of block in sector 2B
        Set<Block> blocks_in_sector_2B = new HashSet<>();

        //adding above created block in set of block in sector 2B
        blocks_in_sector_2B.add(block1);

        //creating a school object
        School middleSchool  = new School(true, "MiddleSchool");

        //creating a set of school objects....can be many schools in a sector
        Set<School> schoolsInSector_2B  = new HashSet<>();

        //adding above created school in set of schools
        schoolsInSector_2B.add(middleSchool);

        //Creating community Centre
        CommunityCentre communityCentre = new CommunityCentre("Kala Kendra", 04423567);

        //Creating health centre
        HealthCentre healthCentre = new HealthCentre("Sector 2 Health Centre", 044125642);

        //Creating maintenance office
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice("Sector 2 Maintenance office", 04423567);

        //creating a set of sector...city has many sectors
        Set<Sector> sectors= new HashSet<>();

        //creating sector object

        Sector sector_2B = new SubSector(2, "B", blocks_in_sector_2B, schoolsInSector_2B, communityCentre,healthCentre,maintenanceOffice);

        //adding sector object in set of sectors;
        sectors.add(sector_2B);

        // creating city object with set of sectors....
        City city = new City("Bokaro Steel City", "Bokaro", 500000, sectors);
    }
}
