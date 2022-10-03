package com.dufuna.berlin.jonasmwansa.lekki.service;

import com.dufuna.berlin.jonasmwansa.lekki.model.LekkiProperty;


public interface LekkiPropertyService {
    void saveProperty(LekkiProperty property);
    LekkiProperty getProperty(int id);
}
