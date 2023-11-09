package com.example.application.frontend.components.layouts;

import com.example.application.backend.enums.FactionsEnum;
import com.example.application.frontend.components.utils.ImageFinder;
import com.example.application.frontend.factories.PossibleUnitsFactory;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.IntegerField;

/**
 * Layout After the FactionSelection
 */
public class BattleSelectionLayout extends SplitLayout {
    //Special Classes
    ImageFinder imageFinder = new ImageFinder();
    PossibleUnitsFactory possibleUnitsFactory = new PossibleUnitsFactory();

    //Components
    private IntegerField leftArmyCostField = new IntegerField();
    private IntegerField rightArmyCostField = new IntegerField();
    private Div leftImageDiv = new Div();
    private Div rightImageDiv = new Div();

    // Selected Data
    private FactionsEnum leftFaction;
    private FactionsEnum rightFaction;
    private Integer leftMaximumCost;
    private Integer rightMaximumCost;

    public BattleSelectionLayout(FactionsEnum leftFaction, FactionsEnum rightFaction, Integer leftMaximumCost, Integer rightMaximumCost) {
        this.leftFaction = leftFaction;
        this.rightFaction = rightFaction;
        this.leftMaximumCost = leftMaximumCost;
        this.rightMaximumCost = rightMaximumCost;

        this.initLayout();
        this.initListeners();
        this.setStyle();
    }



    /**
     * Set up the Listeners on this layout
     */
    private void initListeners() {
    }

    /**
     * Set up the layout
     */
    private void initLayout() {
        //Generate Layouts
        VerticalLayout leftPlayerLayout = new VerticalLayout();
        VerticalLayout rightPlayerLayout = new VerticalLayout();

        //Add Content
        Image leftImage = imageFinder.getFactionimage(leftFaction);
        Image rightImage = imageFinder.getFactionimage(rightFaction);
        leftImage.setWidth("6rem");
        leftImage.setHeight("6rem");
        rightImage.setWidth("6rem");
        rightImage.setHeight("6rem");
        this.leftImageDiv.add(leftImage);
        this.rightImageDiv.add(rightImage);
        leftPlayerLayout.add(this.leftImageDiv, possibleUnitsFactory.makeChoiceVerticalLayout());
        rightPlayerLayout.add(this.rightImageDiv, possibleUnitsFactory.makeChoiceVerticalLayout());
        this.addToPrimary(leftPlayerLayout);
        this.addToPrimary(leftPlayerLayout);
        this.addToSecondary(rightPlayerLayout);
    }

    /**
     * Style of the page
     */
    private void setStyle() {
        this.setSizeFull();
    }
}
