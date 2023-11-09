package com.example.application.backend.units.baseunits.nonbuildings.tier1;

import com.example.application.backend.interfaces.classabilities.SustainDamage;
import com.example.application.backend.interfaces.classabilities.bombardement.Bombardement5;
import com.example.application.backend.model.SpaceUnit;

/**
 * DreadNought Tier 1 Unit
 */
public class Dreadnought1 extends SpaceUnit implements SustainDamage, Bombardement5 {
    public Dreadnought1() {
        super(4, 5, 1, 1);
    }
}
