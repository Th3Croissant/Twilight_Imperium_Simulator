package com.example.application.frontend.components.combobox;

import com.example.application.backend.enums.FactionsEnum;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * Combobox containing the factions in the emulator
 */
public class FactionSelectionComboBox extends ComboBox<FactionsEnum> {

    public FactionSelectionComboBox() {
        this.setupContent();
    }

    public FactionSelectionComboBox(String label) {
        super(label);
        this.setupContent();
    }

    /**
     * Set up the content of the combobox to all the factions
     */
    private void setupContent(){
        this.setItems(FactionsEnum.values());
    }
}
