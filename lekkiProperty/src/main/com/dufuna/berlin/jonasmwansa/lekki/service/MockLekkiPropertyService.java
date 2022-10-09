package com.dufuna.berlin.jonasmwansa.lekki.service;

import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;
import com.dufuna.berlin.jonasmwansa.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.jonasmwansa.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService{
    SimpleLekkiPropertyRepository storage = new SimpleLekkiPropertyRepositoryImpl();
    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        return storage.save(property);
    }

    @Override
    public LekkiProperty getProperty(int id) {
        return storage.findById(id);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return (List<LekkiProperty>) storage.findAll();
    }
}
