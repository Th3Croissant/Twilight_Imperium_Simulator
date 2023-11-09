package com.example.application.frontend.components.fields;

import com.vaadin.flow.component.textfield.IntegerField;

/**
 * Integerfield with step buttons with a 1 increment
 */
public class IncrementalIntegerField extends IntegerField {

    public IncrementalIntegerField() {
        this.setupDefaultBehaviour();
    }

    public IncrementalIntegerField(String label) {
        super(label);
        this.setupDefaultBehaviour();
    }

    private void setupDefaultBehaviour(){
        this.setMin(0);
        this.setMax(99);
        this.setValue(0);
        this.setStepButtonsVisible(true);
    }
}
