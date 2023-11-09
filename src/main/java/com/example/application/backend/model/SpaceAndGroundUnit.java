package com.example.application.backend.model;
/**
 * Class representing a unit that can hit in the space and on ground
 */
public abstract class SpaceAndGroundUnit extends Unit{

    public SpaceAndGroundUnit(double cost, int combatRoll, int movement, int capacity) {
        super(cost, combatRoll, movement, capacity);
    }
}
