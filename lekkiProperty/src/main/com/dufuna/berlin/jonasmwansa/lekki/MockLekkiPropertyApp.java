package com.dufuna.berlin.jonasmwansa.lekki;

import com.dufuna.berlin.jonasmwansa.lekki.enums.propertyType;
import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;
import com.dufuna.berlin.jonasmwansa.lekki.service.MockLekkiPropertyService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {


        LekkiProperty property1 = new LekkiProperty();
        LekkiProperty property2 = new LekkiProperty();

        MockLekkiPropertyService newProperty = new MockLekkiPropertyService();

        //first property
        property1.setId(1);
        property1.setAddress("State House, Independence Avenue, Lusaka, 10101 Zambia");
        property1.setType(propertyType.MANSION);
        property1.setNumberOfSittingRooms(5);
        property1.setOwner("state owned");
        property1.setNumberOfBathrooms(5);
        property1.setNumberOfKitchens(5);
        property1.setNumberOfToilets(8);
        property1.setNumberOfBedrooms(25);
        property1.setNumberOfBathrooms(8);
        Date fromDate = StringToDate("1964-10-24 17:03:00");
        property1.setValidFrom(fromDate);
        Date toDate = StringToDate("2026-09-54 17:03:00");
        property1.setValidTo(toDate);

        property1.setDescription("Located on stand number LUS/4750 corner of President Lane and Independence Avenue," +
                "\nState House grounds occupy an impressive 72 Hectares (178 acres) of land. " +
                "The grounds include a golf course, a tennis court, over 10 wildlife species, a healthcare clinic, " +
                "filling station and police post, among other amenities.");


        newProperty.saveProperty(property1);

        //second property
        property2.setId(2);
        property2.setAddress("B1445, Bulangililo,Copperbelt");
        property2.setType(propertyType.DUPLEX);
        property2.setNumberOfSittingRooms(1);
        property2.setOwner("Gabriel Mulenga");
        property2.setNumberOfBathrooms(1);
        property2.setNumberOfKitchens(1);
        property2.setNumberOfToilets(1);
        property2.setNumberOfBedrooms(3);
        property2.setNumberOfBathrooms(1);
        Date from = StringToDate("2022-10-24 17:03:00");
        property2.setValidFrom(from);
        Date to = StringToDate("2024-09-54 17:03:00");
        property2.setValidTo(to);
        property2.setDescription("Located on riverview Road corner of Kafue river" +
                "\noccupies an impressive 2 Hectares " +
                "The grounds include a golf course");

        //save a LekkiProperty using LekkiPropertyService
        newProperty.saveProperty(property1);
        newProperty.saveProperty(property2);

        //get a LekkiProperty using LekkiPropertyService
        System.out.print("First property details are:\n"+ property1.toString());
        System.out.print("Second property details are:\n"+ property2.toString());
    }//main ends here
    private static Date StringToDate(String s){

        Date result = null;

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            result  = dateFormat.parse(s);

        }catch(ParseException e){
            e.printStackTrace();

        }
        return result ;
    }
}
