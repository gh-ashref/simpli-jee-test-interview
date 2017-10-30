package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;

public class SmpDefaultDataTransformer extends AbstractSmpDataTransformer {


    private static final String MESSAGE = " : bienvenue chez Simplifia!";


    public SmpDefaultDataTransformer(SmpInputValidator validator) {
        super(validator);
    }

    @Override
    public String transform(String input) {

        return super.print(input, MESSAGE);
    }
}
