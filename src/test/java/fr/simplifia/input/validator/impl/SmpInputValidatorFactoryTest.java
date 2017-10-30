package fr.simplifia.input.validator.impl;

import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.assertTrue;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpInputValidatorFactoryTest {
    @Test
    public void testFromLocaleFrench() throws Exception {
        assertTrue(SmpInputValidatorFactory.fromLocale(Locale.FRENCH) instanceof SmpDefaultInputValidator);
    }

    @Test
    public void testFromLocaleEnglish() throws Exception {
        assertTrue(SmpInputValidatorFactory.fromLocale(Locale.ENGLISH) instanceof SmpDefaultInputValidator);
    }

}