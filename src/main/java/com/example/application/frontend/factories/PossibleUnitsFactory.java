package com.example.application.frontend.factories;

import com.example.application.backend.enums.FactionsEnum;
import com.example.application.backend.enums.UnitsEnum;
import com.example.application.frontend.components.fields.IncrementalIntegerField;
import com.example.application.frontend.components.utils.ImageFinder;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * Factory to create the units a faction can deploy
 */
public class PossibleUnitsFactory {
    private ImageFinder imageFinder = new ImageFinder();

    public PossibleUnitsFactory() {
    }

    /**
     * General function to generate the layout contaning the factions buildable units
     * @param chosenFaction
     * @return
     */
    public VerticalLayout generateAvailableUnitsLayout(FactionsEnum chosenFaction){
        VerticalLayout availableUnitsLayout = new VerticalLayout();

        return  availableUnitsLayout;
    }

    /**
     * Unit choices
     */
    public VerticalLayout makeChoiceVerticalLayout(){
        //Layout containing the buttons
        VerticalLayout choiceVerticalLayout = new VerticalLayout();

        //Title
        choiceVerticalLayout.add(new H1("Units Pool"));

        //Add the buttons to the layout
        for(UnitsEnum unit : UnitsEnum.values()){
            choiceVerticalLayout.add(this.createUnitDisplayLayout(unit));
        }
        return choiceVerticalLayout;
    }

    /**
     * Create the layout matching the unit
     * @param unitType
     * @return
     */
    public HorizontalLayout createUnitDisplayLayout(UnitsEnum unitType){

        HorizontalLayout destroyerLayout = new HorizontalLayout();
        IncrementalIntegerField addSaidUnit = new IncrementalIntegerField();
        Image image = this.imageFinder.getUnitImage(unitType);
        image.setHeight("4em");
        image.setWidth("5em");
        destroyerLayout.add(image, addSaidUnit);
        return destroyerLayout;
    }

}
