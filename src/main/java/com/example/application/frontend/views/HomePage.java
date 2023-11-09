//package com.example.application.frontend.views.gameviews;
//
//import com.example.application.backend.enums.UnitsEnum;
//import com.example.application.frontend.layout.MainLayout;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.html.H1;
//import com.vaadin.flow.component.html.Image;
//import com.vaadin.flow.component.notification.Notification;
//import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.splitlayout.SplitLayout;
//import com.vaadin.flow.component.textfield.NumberField;
//import com.vaadin.flow.router.Route;
//import com.vaadin.flow.router.RouteAlias;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
///*@Route(value = "home", layout = MainLayout.class)
//@RouteAlias(value = "", layout = MainLayout.class)*/
//public class HomePage extends VerticalLayout {
//
//    //Maps to count the currently selected amounts
//    private Map<UnitsEnum, Integer> leftSelectedAmount;
//    private Map<UnitsEnum, Integer> rightSelectedAmount;
//
//    //Map of Buttons
//    private Map<UnitsEnum, Button> leftButtonMap;
//    private Map<UnitsEnum, Button> rightButtonMap;
//    public HomePage() {
//        this.initLayout();
//        this.initCounterMap();
//        this.initListeners();
//    }
//
//    private void initListeners() {
//
//    }
//
//    /**
//     * Create the layout of the view
//     */
//    private void initLayout() {
//        VerticalLayout mainContainer = new VerticalLayout();
//
//        mainContainer.add(new NumberField("Cost Limit"));
//
//        //SplitLayouts to display different player choices
//        SplitLayout leftTeamSplitLayout = this.leftPlayerSetup();
//        SplitLayout rightTeamSplitLayout = this.rightPlayerSetup();
//
//        //Final layout containing every layout
//        SplitLayout generalSplitLayout = new SplitLayout(leftTeamSplitLayout, rightTeamSplitLayout);
//        mainContainer.add(generalSplitLayout);
//        this.add(mainContainer);
//    }
//
//    /**
//     * Initialize the army maps
//     */
//    private void initCounterMap() {
//        this.leftSelectedAmount = new HashMap<>();
//        this.rightSelectedAmount = new HashMap<>();
//    }
//
//    /**
//     * Creates the left player setup
//     */
//    public SplitLayout leftPlayerSetup(){
//        VerticalLayout leftPlayerUnitChoices = this.makeChoiceVerticalLayout();
//        VerticalLayout leftPlayerChosenUnits = this.chosenUnitsDisplay();
//
//        SplitLayout leftSplitLayout = new SplitLayout(leftPlayerUnitChoices, leftPlayerChosenUnits);
//
//        return leftSplitLayout;
//    }
//
//    /**
//     * Creates the right player setup
//     */
//    public SplitLayout rightPlayerSetup(){
//        VerticalLayout rightPlayerUnitChoices = this.makeChoiceVerticalLayout();
//        VerticalLayout rightPlayerChosenUnits = this.chosenUnitsDisplay();
//
//        SplitLayout rightSplitLayout = new SplitLayout(rightPlayerChosenUnits, rightPlayerUnitChoices);
//
//        return rightSplitLayout;
//    }
//
//    /**
//     * Creates the display for chosen units to fight
//     * @return
//     */
//    private VerticalLayout chosenUnitsDisplay() {
//        //Layout containing the chosen Units
//        VerticalLayout chosenUnitsDisplay = new VerticalLayout();
//        //Title
//        chosenUnitsDisplay.add(new H1("Chosen Units"));
//
//        //Icons display
//        for(UnitsEnum unit : UnitsEnum.values()){
//            chosenUnitsDisplay.add(this.createChosenUnitsLayout(unit));
//        }
//
//        return chosenUnitsDisplay;
//    }
//
//    /**
//     * Unit choices
//     */
//    public VerticalLayout makeChoiceVerticalLayout(){
//        //Layout containing the buttons
//        VerticalLayout choiceVerticalLayout = new VerticalLayout();
//
//        //Title
//        choiceVerticalLayout.add(new H1("Units Pool"));
//
//        //Add the buttons to the layout
//        for(UnitsEnum unit : UnitsEnum.values()){
//            choiceVerticalLayout.add(this.createUnitDisplayLayout(unit));
//        }
//        return choiceVerticalLayout;
//    }
//
//    /**
//     * Create the layout matching the unit
//     * @param unitType
//     * @return
//     */
//    public HorizontalLayout createUnitDisplayLayout(UnitsEnum unitType){
//
//        HorizontalLayout destroyerLayout = new HorizontalLayout();
//        Button addDestroyerButton = new Button(new H1(unitType.name()));
//        Image image = getUnitImage(unitType);
//        image.setHeight("4em");
//        image.setWidth("5em");
//        destroyerLayout.add(image, addDestroyerButton);
//        return destroyerLayout;
//    }
//
//    /**
//     * Create the chosen units layout
//     * @param unitType
//     * @return
//     */
//    public HorizontalLayout createChosenUnitsLayout(UnitsEnum unitType){
//        HorizontalLayout destroyerLayout = new HorizontalLayout();
//        H1 numberOfUnits = new H1("0 x");
//        Image image = getUnitImage(unitType);
//        image.setHeight("4rem");
//        image.setWidth("6rem");
//        image.addClickListener(
//                e -> {
//                    Notification.show("YOUPIII !! ");
//                }
//        );
//        destroyerLayout.add(numberOfUnits, image);
//        return destroyerLayout;
//    }
//
//    /**
//     * Creates the image matching the unit
//     * @param unitType
//     * @return
//     */
//    public Image getUnitImage(UnitsEnum unitType){
//        switch (unitType){
//            case CRUISER1 -> {
//                return new Image("images/Cruiser1.png", unitType.name());
//            }
//            case INFANTRY1 -> {
//                return new Image("images/Infantry1.png", unitType.name());
//            }
//            case DREADNOUGHT1 -> {
//                return new Image("images/Dreadnought1.png", unitType.name());
//            }
//            case CARRIER1 -> {
//                return new Image("images/Carrier1.png", unitType.name());
//            }
//            case DESTROYER1 -> {
//                return new Image("images/Destroyer1.png", unitType.name());
//            }
//            case PDS1 -> {
//                return new Image("images/PDS1.png", unitType.name());
//            }
//            case FIGHTER1 -> {
//                return new Image("images/Fighter1.png", unitType.name());
//            }
//            default -> {
//                return new Image();
//            }
//        }
//    }
//
//}
