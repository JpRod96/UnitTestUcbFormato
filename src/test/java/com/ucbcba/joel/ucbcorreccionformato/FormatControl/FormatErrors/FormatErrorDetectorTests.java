package com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors;

import com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.FormatErrorResponse.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

public class FormatErrorDetectorTests {

    private FormatErrorDetector formatErrorDetector;

    @Before
    public void setUp() throws IOException {
        PDDocument pdfdocument = PDDocument.load(new File("./uploads/documentoCesar.pdf"));
        AtomicLong idHighlights = new AtomicLong(123);
        formatErrorDetector = new FormatErrorDetector(pdfdocument, idHighlights);
    }

    @Test
    public void getCoverPageFormatErrors() throws IOException {
        List<FormatErrorResponse> coverPageFormatErrors = new ArrayList<>();
        assertReflectionEquals(coverPageFormatErrors, formatErrorDetector.getCoverPageFormatErrors(1));
    }

    @Test
    public void getGeneralIndexFormatErrors() throws IOException {
        Content content = new Content("i");
        List<BoundingRect> boundingRectList = new ArrayList<>();
        BoundingRect boundingRect = new BoundingRect(523.87f, 741.336f, 527.206f, 753.336f, 612.0f, 792.0f);
        boundingRectList.add(boundingRect);
        Position position = new Position(boundingRect, boundingRectList,2);
        Comment comment = new Comment("Por favor verficar: Esta sección no tenga numeración.", "");
        FormatErrorResponse formatErrorResponse = new FormatErrorResponse(content, position, comment, "124", true, "indiceGeneral");
        List<FormatErrorResponse> generalIndexFormatErrors = new ArrayList<>();
        generalIndexFormatErrors.add(formatErrorResponse);
        assertReflectionEquals(generalIndexFormatErrors, formatErrorDetector.getGeneralIndexFormatErrors(2, 2));
    }

    @Test
    public void getFigureIndexFormatErrors() throws IOException {
        Content content = new Content("iii");
        List<BoundingRect> boundingRectList = new ArrayList<>();
        BoundingRect boundingRect = new BoundingRect(517.15f, 741.336f, 527.206f, 753.336f, 612.0f, 792.0f);
        boundingRectList.add(boundingRect);
        Position position = new Position(boundingRect, boundingRectList,4);
        Comment comment = new Comment("Por favor verficar: Esta sección no tenga numeración.", "");
        FormatErrorResponse formatErrorResponse = new FormatErrorResponse(content, position, comment, "124", true, "FIGURAS");
        List<FormatErrorResponse> figureIndexFormatErrors = new ArrayList<>();
        figureIndexFormatErrors.add(formatErrorResponse);
        assertReflectionEquals(figureIndexFormatErrors, formatErrorDetector.getFigureIndexFormatErrors(4, 4));
    }

    @Test
    public void getTableIndexFormatErrors() throws IOException {
        Content content = new Content("ii");
        List<BoundingRect> boundingRectList = new ArrayList<>();
        BoundingRect boundingRect = new BoundingRect(520.51f, 741.336f, 527.206f, 753.336f, 612.0f, 792.0f);
        boundingRectList.add(boundingRect);
        Position position = new Position(boundingRect, boundingRectList,3);
        Comment comment = new Comment("Por favor verficar: Esta sección no tenga numeración.", "");
        FormatErrorResponse formatErrorResponse = new FormatErrorResponse(content, position, comment, "124", true, "TABLAS");
        List<FormatErrorResponse> tableIndexFormatErrors = new ArrayList<>();
        tableIndexFormatErrors.add(formatErrorResponse);
        assertReflectionEquals(tableIndexFormatErrors, formatErrorDetector.getTableIndexFormatErrors(3, 3));
    }

    @Test
    public void getPageNumerationFormatErrors() throws IOException {
        List<FormatErrorResponse> pageNumerationFormatErrors = new ArrayList<>();
        assertReflectionEquals(pageNumerationFormatErrors, formatErrorDetector.getPageNumerationFormatErrors(4, 26, 26));
    }

    @Test
    public void getFigureTableFormatErrors() throws IOException {
        Content content = new Content("Imagen");
        List<BoundingRect> boundingRectList = new ArrayList<>();
        BoundingRect boundingRect = new BoundingRect(112.06f, 112.65997f, 514.11f, 686.68f, 612.0f, 792.0f);
        boundingRectList.add(boundingRect);
        Position position = new Position(boundingRect, boundingRectList,21);
        Comment comment = new Comment("Figura en sentido vertical. La presente hoja debe tener orientación horizontal.", "");
        FormatErrorResponse formatErrorResponse = new FormatErrorResponse(content, position, comment, "124", true, "tablaFigura");
        List<FormatErrorResponse> figureTableFormatErrors = new ArrayList<>();
        figureTableFormatErrors.add(formatErrorResponse);
        assertReflectionEquals(figureTableFormatErrors, formatErrorDetector.getFigureTableFormatErrors(4, 22));
    }

    @Test
    public void getEnglishWordsFormatErrors() throws IOException {
        List<FormatErrorResponse> englishWordsFormatErrors = new ArrayList<>();
        assertReflectionEquals(englishWordsFormatErrors, formatErrorDetector.getEnglishWordsFormatErrors(4, 26));
    }

    @Test
    public void getBibliographyFormatErrors() throws IOException {
        List<FormatErrorResponse> bibliographyFormatErrors = new ArrayList<>();
        assertReflectionEquals(bibliographyFormatErrors, formatErrorDetector.getBibliographyFormatErrors(22, 22));
    }

    @Test
    public void getFigureFormatErrors() throws IOException {
        Content content = new Content("Imagen");
        List<BoundingRect> boundingRectList = new ArrayList<>();
        BoundingRect boundingRect = new BoundingRect(112.06f, 112.65997f, 514.11f, 686.68f, 612.0f, 792.0f);
        boundingRectList.add(boundingRect);
        Position position = new Position(boundingRect, boundingRectList,21);
        Comment comment = new Comment("Figura en sentido vertical. La presente hoja debe tener orientación horizontal.", "");
        FormatErrorResponse formatErrorResponse = new FormatErrorResponse(content, position, comment, "124", true, "tablaFigura");
        List<FormatErrorResponse> figureFormatErrors = new ArrayList<>();
        figureFormatErrors.add(formatErrorResponse);
        assertReflectionEquals(figureFormatErrors, formatErrorDetector.getFigureFormatErrors(4, 26));
    }


}
