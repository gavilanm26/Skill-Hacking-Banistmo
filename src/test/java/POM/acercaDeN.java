package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class acercaDeN extends pageBase{

    public acercaDeN(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//A[@id='header-nosotros']")
    private WebElement txtAcercaDeNosotros;

    @FindBy(xpath = "//A[@id='serv']")
    private WebElement txtInformacionCoorporativa;

    @FindBy(xpath = "//A[@href='/wps/portal/acerca-de/informacion-corporativa/proveedores/'][text()='Proveedores']")
    private WebElement txtProveedores;

    @FindBy(xpath = "//A[@href='/wps/wcm/connect/f7a3486a-41af-46b9-8157-2fde21fa4d0a/poli%CC%81ticas-tratamiento-y-proteccio%CC%81n-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf?MOD=AJPERES&CVID=l33Qn2Y'][text()='Descarga el documento']")
    private WebElement txtDescargarDocumento;

    @FindBy(xpath = "//A[@id='serv']")
    private WebElement txtTituloReporte;




    public void acercaDeNosotros() throws Exception{
        this.click(txtAcercaDeNosotros);
    }

    public void informacionCoorporativa() throws Exception{
        this.click(txtInformacionCoorporativa);
    }

    public void proveedores() throws Exception{
        this.click(txtProveedores);
    }

    public void descargarDocumento() throws Exception{
        this.click(txtDescargarDocumento);
    }


}
