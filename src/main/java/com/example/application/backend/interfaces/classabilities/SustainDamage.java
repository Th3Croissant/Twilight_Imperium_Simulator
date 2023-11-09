package com.example.application.backend.interfaces.classabilities;

/**
 * Represents a unit that can sustain damage
 */
public interface SustainDamage {
    default boolean canSustainDamage() {
        return true;
    }
}
