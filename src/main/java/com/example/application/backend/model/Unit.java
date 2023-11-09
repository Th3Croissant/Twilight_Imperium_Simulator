package com.example.application.backend.model;

import lombok.Getter;
import lombok.Setter;

/**
 * General Unit class
 */
@Getter
@Setter
public abstract class Unit {

    //Life points of the unit
    protected int lifePoints;

    // Building cost of the unit in production
    protected double cost;

    //Amount of unit it can contain
    protected int capacity;

    //Dice roll one needs to get to hit the enemy
    protected int combatRoll;

    //Movement capacity of the unit
    protected int movement;

    public Unit(double cost, int combatRoll, int movement, int capacity) {
        this.lifePoints = lifePoints;
        this.cost = cost;
        this.combatRoll = combatRoll;
        this.movement = movement;
        this.capacity = capacity;
    }
}

