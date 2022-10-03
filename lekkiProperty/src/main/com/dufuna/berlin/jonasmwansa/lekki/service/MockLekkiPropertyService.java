package com.dufuna.berlin.jonasmwansa.lekki.service;

import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;
import java.util.ArrayList;

public class MockLekkiPropertyService implements LekkiPropertyService{
    ArrayList<LekkiProperty> properties = new ArrayList<>();
    @Override
    public void saveProperty(LekkiProperty property)
    {
        properties.add(property);
    }

    @Override
    public LekkiProperty getProperty(int id) {
        if(properties.contains(id)){
            return properties.get(id);
        }
        else
            return null;

    }

}
