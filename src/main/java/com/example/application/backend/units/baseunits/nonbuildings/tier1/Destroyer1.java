package com.example.application.backend.units.baseunits.nonbuildings.tier1;


import com.example.application.backend.interfaces.classabilities.antifighterbarrage.AntiFighterBarrage9x2;
import com.example.application.backend.model.SpaceUnit;

/**
 * Destroyer Tier 1 Unit
 */
public class Destroyer1 extends SpaceUnit implements AntiFighterBarrage9x2 {
    public Destroyer1() {
        super(1, 9, 2, 0);
    }
}
