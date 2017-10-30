package fr.simplifia.input.validator.impl;

import fr.simplifia.input.exception.InputException;

import java.util.Locale;

public class SmpDefaultInputValidator extends AbstractSmpInputValidator {

    private static String REGEXP = ".*";

    protected SmpDefaultInputValidator(Locale locale) {
        super(locale);
    }

    @Override
    public void validateInput(final String input) throws InputException {
        if (!input.matches(REGEXP)) {
            throw new InputException("The input given is not compatible with the default validation strategy");
        }
    }
}
