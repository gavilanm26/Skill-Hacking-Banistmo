package POM;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class LeerPDF extends pageBase{

    String contenidoPDF2;
    public LeerPDF(WebDriver driver) {
        super(driver);
    }

    public void leerPDFTest(String url_pdf) throws IOException {

        URL url = new URL(url_pdf);

        InputStream is = url.openStream();
        BufferedInputStream fileParse = new BufferedInputStream(is);
        PDDocument documento = null;

        documento = PDDocument.load(fileParse);
        String contenidoPDF = new PDFTextStripper().getText(documento);
        contenidoPDF2 = contenidoPDF;
        //System.out.println(contenidoPDF);
    }

    public boolean isTextInicioDisplayed() throws Exception {
        return contenidoPDF2.contains("POLÍTICAS DE TRATAMIENTO Y PROTECCIÓN DE DATOS PERSONALES");
    }
}
