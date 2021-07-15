package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class chat extends pageBase{

    public chat(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//DIV[@id='cicle-blanco']")
    private WebElement txtContactCenter;

    @FindBy(xpath = "//I[@class='far fa-comment-alt-lines fa-2x icon-comment comment']")
    private WebElement txtChatEnLinea;

    @FindBy(xpath = "//SELECT[@id='cx_webchat_form_typedocumment']")
    private WebElement txtCedula;

    @FindBy(xpath = "//INPUT[@id='cx_webchat_form_personId']")
    private WebElement txtNumeroCedula;

    @FindBy(xpath = "//SELECT[@id='cx_webchat_form_pais']")
    private WebElement txtPais;

    @FindBy(xpath = "//INPUT[@id='cx_webchat_form_firstname']")
    private WebElement txtNombre;

    @FindBy(xpath = "//INPUT[@id='cx_webchat_form_lastname']")
    private WebElement txtApellido;

    @FindBy(xpath = "//INPUT[@id='cx_webchat_form_email']")
    private WebElement txtCorreo;

    @FindBy(xpath = "//INPUT[@id='cx_webchat_form_tel']")
    private WebElement txtTelefono;

    @FindBy(xpath = "//TEXTAREA[@id='cx_webchat_form_subject']")
    private WebElement txtAsunto;

    @FindBy(xpath = "//INPUT[@id='webchat_form_terminos']")
    private WebElement txtTerminos;

    @FindBy(xpath = "//BUTTON[@class='cx-submit cx-btn cx-btn-primary i18n'][text()='Enviar']")
    private WebElement txtSubmit;


    public void contactCenter() throws Exception{
        this.click(txtContactCenter);
    }

    public void chatEnLinea() throws Exception{
        this.click(txtChatEnLinea);
    }

    public void cedula(String cedula) throws Exception{
        Select select = new Select(txtCedula);
        this.click(txtCedula);
        select.selectByVisibleText(cedula);
    }

    public void numeroCedula(String numeroCedula) throws Exception{
        this.click(txtNumeroCedula);
        txtNumeroCedula.clear();
        txtNumeroCedula.sendKeys(numeroCedula);
    }

    public void pais(String pais) throws Exception{
        Select select = new Select(txtPais);
        this.click(txtPais);
        select.selectByVisibleText(pais);
    }

    public void nombre(String nombre) throws Exception{
        this.click(txtNombre);
        txtNombre.clear();
        txtNombre.sendKeys(nombre);
    }

    public void apellido(String apellido) throws Exception{
        this.click(txtApellido);
        txtApellido.clear();
        txtApellido.sendKeys(apellido);
    }

    public void correo(String correo) throws Exception{
        this.click(txtCorreo);
        txtCorreo.clear();
        txtCorreo.sendKeys(correo);
    }

    public void telefono(String telefono) throws Exception{
        this.click(txtTelefono);
        txtTelefono.clear();
        txtTelefono.sendKeys(telefono);
    }

    public void asunto(String asunto) throws Exception{
        this.click(txtAsunto);
        txtAsunto.clear();
        txtAsunto.sendKeys(asunto);
    }

    public void terminos() throws Exception {
        this.click(txtTerminos);
    }

    public void submit() throws Exception {
        this.click(txtSubmit);
    }



}
