package com.example.application.frontend.views;

import com.example.application.frontend.components.layouts.BattleSelectionLayout;
import com.example.application.frontend.components.layouts.SetupLayout;
import com.example.application.frontend.layout.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

/**
 * Battle Simulator View
 */
@Route(value = "home", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class BattleSimulatorView extends VerticalLayout {

    //Layouts
    private SetupLayout setupLayout = new SetupLayout();
    BattleSelectionLayout battleSelectionLayout;
    //Components
    private Button nextButton = new Button("Next");
    private Button returnButton = new Button("Return");


    public BattleSimulatorView() {
        this.initLayout();
        this.initListeners();
        this.setupStyle();
    }

    /**
     * Listeners for Components
     */
    private void initListeners() {
        this.nextButton.addClickListener(
                e -> {
                    if(this.setupLayout.isValidSetup()){
                        this.setupLayout.setVisible(false);
                        this.battleSelectionLayout = new BattleSelectionLayout(
                                this.setupLayout.getLeftFaction(),
                                this.setupLayout.getRightFaction(),
                                this.setupLayout.getLeftArmyCost(),
                                this.setupLayout.getRightArmyCost()
                        );
                        this.battleSelectionLayout.setSizeFull();
                        this.add(this.battleSelectionLayout);
                        this.returnButton.setVisible(true);
                    }else{
                        Notification.show("Please generate a correct setup");
                    }
                }
        );
        this.returnButton.addClickListener(
                e->{
                    this.remove(this.battleSelectionLayout);
                    this.setupLayout = new SetupLayout();
                    this.add(this.setupLayout);
                    this.returnButton.setVisible(false);
                }
        );
    }

    /**
     * Initial Layout setup
     */
    private void initLayout() {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.add(this.returnButton, this.nextButton);
        this.add(buttonLayout, this.setupLayout);
    }


    /**
     * Setup the style in this class
     */
    private void setupStyle() {
        this.setSizeFull();
        this.returnButton.setVisible(false);
    }
}
