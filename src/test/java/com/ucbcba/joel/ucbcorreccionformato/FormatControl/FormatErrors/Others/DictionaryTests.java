package com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others;

import com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others.Dictionaries.Dictionary;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DictionaryTests {

    private Dictionary dictionary;

    @Before
    public void setUp() throws IOException {
        dictionary = new Dictionary();
    }

    @Test
    public void containAbacus() {
        assertFalse(dictionary.contains("abacus"));
    }
}
