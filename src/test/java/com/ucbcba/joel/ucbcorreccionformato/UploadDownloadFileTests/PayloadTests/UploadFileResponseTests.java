package com.ucbcba.joel.ucbcorreccionformato.UploadDownloadFileTests.PayloadTests;

import com.ucbcba.joel.ucbcorreccionformato.UploadDownloadFile.Payload.UploadFileResponse;
import com.ucbcba.joel.ucbcorreccionformato.UploadDownloadFile.Property.FileStorageProperties;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class UploadFileResponseTests {
    private String fileName="documentoCompleto.pdf";
    private String fileDownloadUri="./uploads/documentoCompleto.pdf";
    private String fileType=".pdf";
    private long size= 20;

    private UploadFileResponse uploadFileResponse;

    @Before
    public void setUp() {
          uploadFileResponse = new UploadFileResponse(fileName, fileDownloadUri, fileType, size);

    }

        @Test
    public void succesfulGetFileName()  {
        uploadFileResponse.setFileName(fileName);
        assertEquals(uploadFileResponse.getFileName(), "documentoCompleto.pdf");
    }

    @Test
    public void succesfulGetFileDownloadUri()  {
        uploadFileResponse.setFileDownloadUri(fileDownloadUri);
        assertEquals(uploadFileResponse.getFileDownloadUri(), "./uploads/documentoCompleto.pdf");
    }

    @Test
    public void succesfulGetFileType()  {
        uploadFileResponse.setFileType(fileType);
        assertEquals(uploadFileResponse.getFileType(), ".pdf");
    }

    @Test
    public void succesfulGetSize()  {
        uploadFileResponse.setSize(size);
        assertEquals(uploadFileResponse.getSize(), 20);
    }

}
