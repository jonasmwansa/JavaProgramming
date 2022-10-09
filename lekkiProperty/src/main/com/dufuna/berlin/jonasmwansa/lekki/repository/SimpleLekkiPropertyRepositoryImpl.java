package com.dufuna.berlin.jonasmwansa.lekki.repository;

import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    //use a hashmap
    ArrayList<LekkiProperty> allProperty = new ArrayList<>();
    Map<Integer, LekkiProperty> properties = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty property) {

        properties.put(property.getId(), property);
        return property;
    }

    @Override
    public LekkiProperty findById(int id) {
        if (properties.containsKey(id)) {
            return properties.get(id);
        }
        return null;
    }

    @Override
    public List<LekkiProperty> findAll() {
        allProperty.addAll(properties.values());
        return allProperty;
    }

    @Override
    public void update(int id, LekkiProperty property) {
        for(Integer key: properties.keySet()){
            if (id == key) {
                properties.replace(key, property);
            }
        }
        System.out.println(properties);
    }


}
