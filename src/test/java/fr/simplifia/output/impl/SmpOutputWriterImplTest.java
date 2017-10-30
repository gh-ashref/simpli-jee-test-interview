package fr.simplifia.output.impl;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpOutputWriterImplTest {

    private PrintStream stream;

    public SmpOutputWriterImplTest() {
        stream = Mockito.mock(PrintStream.class);
        doNothing().when(stream).println(anyString());
    }

    @Test
    public void testPrint() throws Exception {

        SmpOutputWriterImpl out = new SmpOutputWriterImpl(stream);
        String test = anyString();
        out.print(test);
        Mockito.verify(stream).println(Mockito.eq(test));
        Mockito.reset(stream);
    }

    @Test
    public void testPrintEmpty() throws Exception {
        SmpOutputWriterImpl out = new SmpOutputWriterImpl(stream);
        out.print("");
        String test = "";
        Mockito.verify(stream).println(Mockito.eq(test));
        Mockito.reset(stream);

    }

    @Test
    public void testPrintNull() throws Exception {

        SmpOutputWriterImpl out = new SmpOutputWriterImpl(stream);
        out.print(null);
        String test = null;
        Mockito.verify(stream).println(Mockito.eq(test));
        Mockito.reset(stream);

    }

}