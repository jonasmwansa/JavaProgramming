package com.dufuna.berlin.jonasmwansa.lekki.repository;

import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;
import java.util.List;

public interface SimpleLekkiPropertyRepository {

    LekkiProperty save(LekkiProperty property);
    LekkiProperty findById(int propertyId);
    List<LekkiProperty> findAll();
    void update(int id, LekkiProperty property);
}

