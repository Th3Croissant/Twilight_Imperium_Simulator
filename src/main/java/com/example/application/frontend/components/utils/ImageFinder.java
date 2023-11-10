package com.example.application.frontend.components.utils;

import com.example.application.backend.enums.FactionsEnum;
import com.example.application.backend.enums.UnitsEnum;
import com.vaadin.flow.component.html.Image;

/**
 * Class to generate the image for a given faction or unit
 */
public class ImageFinder {
    public ImageFinder() {
    }

    public Image getFactionimage(FactionsEnum selectedEnum){
        switch (selectedEnum){
            case JolNar -> {
                return new Image("/images/factions/jolnar.png", selectedEnum.name());
            }
            case NaazRokha -> {
                return new Image("/images/factions/Naaz_Rokha.png", selectedEnum.name());
            }
            case GhostsofCreuss -> {
                return new Image("/images/factions/GhostsOfCreuss.png", selectedEnum.name());
            }
            case Mahact -> {
                 return new Image("/images/factions/Mahact.png", selectedEnum.name());
            }
            case VuilRaith -> {
                return new Image("/images/factions/Vuilraith.png", selectedEnum.name());
            }
            default -> {
                return new Image();
            }
        }
    }

    /**
     * Creates the image matching the unit
     * @param unitType
     * @return
     */
    public Image getUnitImage(UnitsEnum unitType){
        switch (unitType){
            case CRUISER1 -> {
                return new Image("images/units/Cruiser1.png", unitType.name());
            }
            case INFANTRY1 -> {
                return new Image("images/units/Infantry1.png", unitType.name());
            }
            case DREADNOUGHT1 -> {
                return new Image("images/units/Dreadnought1.png", unitType.name());
            }
            case CARRIER1 -> {
                return new Image("images/units/Carrier1.png", unitType.name());
            }
            case DESTROYER1 -> {
                return new Image("images/units/Destroyer1.png", unitType.name());
            }
            case PDS1 -> {
                return new Image("images/units/PDS1.png", unitType.name());
            }
            case FIGHTER1 -> {
                return new Image("images/units/Fighter1.png", unitType.name());
            }
            default -> {
                return new Image();
            }
        }
    }

}
