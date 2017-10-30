package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.SmpDataTransformer;

public class SmpDataTransformFactory {
    public static SmpDataTransformer fromLocale(final SmpInputValidator validator) {
        final SmpDataTransformer result;
        switch (validator.getLocale().getLanguage()) {
            case ("en"):
                result = new SmpEnglishDataTransformer(validator);
                break;

            default:
                result = new SmpDefaultDataTransformer(validator);
                break;
        }
        return result;
    }
}
