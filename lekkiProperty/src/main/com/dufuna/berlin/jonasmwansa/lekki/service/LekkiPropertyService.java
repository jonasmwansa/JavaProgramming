package com.dufuna.berlin.jonasmwansa.lekki.service;

import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);
    LekkiProperty getProperty(int id);
    List<LekkiProperty> getProperties();
}
