package com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others;

import com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others.Dictionaries.Diccionario;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiccionarioTests {

    private Diccionario diccionario;

    @Before
    public void setUp() throws IOException {
        diccionario = new Diccionario();
    }

    @Test
    public void containsToman() {
        assertFalse(diccionario.contains("toman"));
    }
}
