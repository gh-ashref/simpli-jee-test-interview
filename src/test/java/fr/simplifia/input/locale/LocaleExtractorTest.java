package fr.simplifia.input.locale;

import fr.simplifia.input.exception.InputException;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.assertEquals;


public class LocaleExtractorTest {
    @Test
    public void testToLocale() throws Exception {
        assertEquals(Locale.FRENCH, LocaleExtractor.toLocale("fr"));
    }

    @Test
    public void testToLocaleEn() throws Exception {
        assertEquals(Locale.ENGLISH, LocaleExtractor.toLocale("en"));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testToLocaleNull() throws Exception {
        LocaleExtractor.toLocale(null);
    }

    @Test(expectedExceptions = InputException.class)
    public void testToLocaleNEmpty() throws Exception {
        LocaleExtractor.toLocale("");

    }


}