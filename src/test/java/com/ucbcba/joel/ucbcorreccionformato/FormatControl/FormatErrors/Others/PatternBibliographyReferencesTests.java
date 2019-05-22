package com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others;

import com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others.Bibliographies.PatternBibliographyReferences;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

public class PatternBibliographyReferencesTests {

    private PatternBibliographyReferences patternBibliographyReferences;

    @Before
    public void setUp() {
        Pattern pattern = Pattern.compile("string to pattern");
        patternBibliographyReferences = new PatternBibliographyReferences("patternName", pattern);
    }

    @Test
    public void getName() {
        assertEquals("patternName", patternBibliographyReferences.getName());
    }

    @Test
    public void setName() {
        patternBibliographyReferences.setName("newPatternName");
        assertEquals("newPatternName", patternBibliographyReferences.getName());
    }

    @Test
    public void getPattern() {
        Pattern pattern = Pattern.compile("string to pattern");
        assertReflectionEquals(pattern, patternBibliographyReferences.getPattern());
    }

    @Test
    public void setPattern() {
        Pattern pattern = Pattern.compile("new string to pattern");
        patternBibliographyReferences.setPattern(pattern);
        assertReflectionEquals(pattern, patternBibliographyReferences.getPattern());
    }

    @Test
    public void getMatcher() {
        Pattern pattern = Pattern.compile("string to pattern");
        Matcher matcher = pattern.matcher("string to pattern");
        assertReflectionEquals(matcher, patternBibliographyReferences.getMatcher("string to pattern"));
    }
}
