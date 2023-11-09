package com.example.application.backend.model;

/**
 * Class representing a unit that can hit in the space
 */
public abstract class SpaceUnit extends Unit{
    public SpaceUnit(double cost, int combatRoll, int movement, int capacity) {
        super(cost, combatRoll, movement, capacity);
    }
}
