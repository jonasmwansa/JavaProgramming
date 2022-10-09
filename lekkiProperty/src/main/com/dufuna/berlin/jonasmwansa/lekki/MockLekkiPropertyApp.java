package com.dufuna.berlin.jonasmwansa.lekki;


import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;
import com.dufuna.berlin.jonasmwansa.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.jonasmwansa.lekki.service.MockLekkiPropertyService;
import com.dufuna.berlin.jonasmwansa.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.jonasmwansa.lekki.repository.SimpleLekkiPropertyRepositoryImpl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {

        MockLekkiPropertyService newProperty = new MockLekkiPropertyService();

        String[] propertyAddress = { "Lusaka","Kitwe","Ndola", "Chipata"};
        String[] propType = { "FLAT", "BUNGALOW", "DUPLEX", "MANSION"};

        LekkiPropertyService newServiceProp = new MockLekkiPropertyService();


        for (int i = 0; i < propertyAddress.length; i++) {

            //create items
            LekkiProperty property = new LekkiProperty( i, propertyAddress[i], propType[i]);

            //save items
            newServiceProp.saveProperty(property);

        }


        //get one property [in this instance we just get the third property (2) ]
        System.out.println(newServiceProp.getProperty(2));

        //print all properties
        System.out.println(newServiceProp.getProperties());

    }

    //    //function for specifying validation period
    //    private static Date StringToDate(String s){
    //
    //        Date result = null;
    //
    //        try{
    //            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //            result  = dateFormat.parse(s);
    //
    //        }catch(ParseException e){
    //            e.printStackTrace();
    //
    //        }
    //        return result ;
    //    }
}
