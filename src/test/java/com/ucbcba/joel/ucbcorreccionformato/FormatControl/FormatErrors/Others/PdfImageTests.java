package com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others;

import com.ucbcba.joel.ucbcorreccionformato.FormatControl.FormatErrors.Others.ImagesOnPdf.PdfImage;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.util.Matrix;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class PdfImageTests {

    private PdfImage pdfImage;

    @Before
    public void setUp() throws IOException {
        PDDocument pdfdocument = PDDocument.load(new File("./uploads/Perfil.pdf"));
        PDImageXObject pdImageXObject = new PDImageXObject(pdfdocument);
        Matrix matrix = new Matrix(0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f);
        pdfImage = new PdfImage(pdImageXObject, matrix, 23, 0.5f);
    }

    @Test
    public void getPage() {
        assertEquals(23, pdfImage.getPage());
    }

    @Test
    public void getX() {
        assertEquals(0.5f, pdfImage.getX(), 0.0f);
    }

    @Test
    public void getY() {
        assertEquals(-0.7071068f, pdfImage.getY(), 0.0f);
    }

    @Test
    public void getEndX() {
        assertEquals(1.2071068f, pdfImage.getEndX(), 0.0f);
    }

    @Test
    public void getEndY() {
        assertEquals(0.0f, pdfImage.getEndY(), 0.0f);
    }

    @Test
    public void setX() {
        pdfImage.setX(1.0f);
        assertEquals(1.0f, pdfImage.getX(), 0.0f);
    }

    @Test
    public void setY() {
        pdfImage.setY(1.0f);
        assertEquals(1.0f, pdfImage.getY(), 0.0f);
    }

    @Test
    public void setEndX() {
        pdfImage.setEndX(1.0f);
        assertEquals(1.0f, pdfImage.getEndX(), 0.0f);
    }

    @Test
    public void setEndY() {
        pdfImage.setEndY(1.0f);
        assertEquals(1.0f, pdfImage.getEndY(), 0.0f);
    }

    @Test
    public void getWidthDisplayed() {
        assertEquals(0.70710677f, pdfImage.getWidthDisplayed(), 0.0f);
    }

    @Test
    public void getHeightDisplayed() {
        assertEquals(0.70710677f, pdfImage.getHeightDisplayed(), 0.0f);
    }

    @Test
    public void isFigureHorizontal() {
        assertFalse(pdfImage.isFigureHorizontal());
    }

    @Test
    public void doesFigureRotateToTheRight() {
        assertFalse(pdfImage.doesFigureRotateToTheRight());
    }

    @Test
    public void getShearX() {
        assertEquals(0.5f, pdfImage.getShearX(), 0.0f);
    }

    @Test
    public void getTranslateY() {
        assertEquals(0.5f, pdfImage.getTranslateY(), 0.0f);
    }
}
