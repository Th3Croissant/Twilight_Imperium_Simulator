package com.example.application.backend.model;

/**
 * Class representing a unit that can hit on the ground
 */
public abstract class GroundUnit extends Unit{

    public GroundUnit(double cost, int combatRoll, int movement, int capacity) {
        super(cost, combatRoll, movement, capacity);
    }
}
