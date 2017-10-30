package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;

public class SmpEnglishDataTransformer extends AbstractSmpDataTransformer {

    private static final String MESSAGE = " : Welcome to Simplifia!";

    public SmpEnglishDataTransformer(SmpInputValidator validator) {
        super(validator);
    }

    @Override
    public String transform(String input) {
        return super.print(input, MESSAGE);
    }
}
