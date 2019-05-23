package com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors;

import com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.FormatErrorResponse.FormatErrorResponse;
import com.ucbcba.joel.ucbcorreccionformato.FormatControl.WordsProperties;
import org.apache.pdfbox.text.TextPosition;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class ReportFormatErrorTests {

    private ReportFormatError reportFormatError;

    @Before
    public void setUp() {
        AtomicLong idHighlights = new AtomicLong(123);
        reportFormatError = new ReportFormatError(idHighlights);
    }

    @Test
    public void reportFormatError() {
        List<String> comments = new ArrayList<>();
        comments.add("comment1");
        comments.add("comment2");
        List<TextPosition> textPositions = new ArrayList<>();
        WordsProperties wordsProperties = new WordsProperties(textPositions);
        //FormatErrorResponse formatErrorResponse = new FormatErrorResponse(wordsProperties.toString(), )
    }
}
