package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.impl.SmpDefaultDataTransformer;
import fr.simplifia.transform.impl.SmpEnglishDataTransformer;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SmpDataTransformerTest {

    private SmpInputValidator validator;

    public SmpDataTransformerTest() {
        validator = Mockito.mock(SmpInputValidator.class);
        //TODO : mocking strategy
        //when(validator.validateInput(input)).thenReturn();
    }

    @Test
    public void testTransformOk() throws Exception {
        SmpDataTransformer transformer = new SmpEnglishDataTransformer(validator);
        assertEquals(transformer.transform("Ghribi"), "Ghribi : Welcome to Simplifia!");

    }

    @Test
    public void testTransformNotOk() throws Exception {
        SmpDataTransformer transformer = new SmpEnglishDataTransformer(validator);
        transformer.transform("Héllo");
    }


    @Test
    public void testTransformEmpty() throws Exception {
        SmpDataTransformer transformer = new SmpDefaultDataTransformer(validator);
        assertEquals(transformer.transform(""), " : Welcome to Simplifia!");
    }

    @Test
    public void testTransformNull() throws Exception {
        SmpDataTransformer transformer = new SmpDefaultDataTransformer(validator);
        transformer.transform(null);
    }


}