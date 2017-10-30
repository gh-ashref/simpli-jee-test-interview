package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.SmpDataTransformer;

import java.util.Locale;

public abstract class AbstractSmpDataTransformer implements SmpDataTransformer {

    protected SmpInputValidator validator;
    protected Locale locale;

    public AbstractSmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;
    }

    public String print(String input, String MESSAGE) {
        validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        buffer.append(MESSAGE);
        return buffer.toString();
    }

    public Locale getLocale() {
        return locale;
    }
}
