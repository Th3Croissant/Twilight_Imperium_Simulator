package com.example.application.frontend.components.layouts;

import com.example.application.backend.enums.FactionsEnum;
import com.example.application.frontend.components.combobox.FactionSelectionComboBox;
import com.example.application.frontend.components.fields.IncrementalIntegerField;
import com.example.application.frontend.components.utils.ImageFinder;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import lombok.Getter;
import lombok.Setter;

/**
 *  Vertical layout for selection your race and fightning parameters
 */
@Getter
@Setter
public class SetupLayout extends VerticalLayout {

    //Elements of the layout
    private IncrementalIntegerField maxCostLeftPlayerField;
    private IncrementalIntegerField maxCostRightPlayerField;
    private FactionSelectionComboBox leftSideFactionCombobox;
    private FactionSelectionComboBox rightSideFactionCombobox;
    private SplitLayout splitLayout;
    private Div leftImageDiv = new Div();
    private Div rightImageDiv = new Div();
    private ImageFinder imageFinder = new ImageFinder();

    //Selected Data
    private FactionsEnum leftFaction;
    private FactionsEnum rightFaction;
    private Integer leftArmyCost;
    private Integer rightArmyCost;

    public SetupLayout() {
        this.initLayout();
        this.initListeners();
    }

    /**
     * Listeners for the page
     */
    private void initListeners() {
        //Combobox Listeners
        this.leftSideFactionCombobox.addValueChangeListener(
                e->{
                    this.leftFaction = e.getValue();
                }
        );
        this.rightSideFactionCombobox.addValueChangeListener(
                e->{
                    this.rightFaction = e.getValue();
                }
        );
        //Image Listeners
        this.leftSideFactionCombobox.addValueChangeListener(
                e -> {
                    this.leftImageDiv.removeAll();
                    this.leftImageDiv.add(this.imageFinder.getFactionimage(e.getValue()));
                }
        );
        this.rightSideFactionCombobox.addValueChangeListener(
                e -> {
                    this.rightImageDiv.removeAll();
                    this.rightImageDiv.add(this.imageFinder.getFactionimage(e.getValue()));
                }
        );
    }

    /**
     * Setup the layout
     */
    private void initLayout() {
        this.maxCostLeftPlayerField = new IncrementalIntegerField("Maximum Army Cost Blue");
        this.maxCostRightPlayerField = new IncrementalIntegerField("Maximum Army Cost Red");
        this.leftSideFactionCombobox = new FactionSelectionComboBox("Left Side Faction");
        this.rightSideFactionCombobox = new FactionSelectionComboBox("Right Side Faction");


        VerticalLayout leftLayout = new VerticalLayout();
        VerticalLayout rightLayout = new VerticalLayout();

        leftLayout.add(this.maxCostLeftPlayerField, this.leftSideFactionCombobox, this.leftImageDiv);
        rightLayout.add(this.maxCostRightPlayerField, this.rightSideFactionCombobox, this.rightImageDiv);

        //Add the content in the layout
        this.splitLayout = new SplitLayout(leftLayout, rightLayout);
        this.splitLayout.setSizeFull();
        //Setup components
        this.setupComponents();
        this.add(this.splitLayout);
    }


    /**
     * Function setting up my component
     */
    private void setupComponents() {
        this.maxCostLeftPlayerField.setValue(10);
        this.maxCostRightPlayerField.setValue(10);
        this.setSizeFull();
    }

    /**
     * Chech if the Setup is correct
     */
    public boolean isValidSetup(){
        return
                this.leftFaction != null
                        && this.rightFaction != null
                        && !this.maxCostLeftPlayerField.isInvalid()
                        && !this.maxCostRightPlayerField.isInvalid();
    }

}
