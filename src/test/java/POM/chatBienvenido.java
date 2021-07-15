package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class chatBienvenido extends pageBase{

    private String bienvenido = "Bienvenido (a)";

    @FindBy(xpath = "//B[text()='Bienvenido (a)']")
    private WebElement txtBienvenido;


    public chatBienvenido(WebDriver driver){
        super(driver);
    }

    public boolean isTextInicioDisplayed() throws Exception {
        return this.isDisplayed(txtBienvenido) && this.getText(txtBienvenido).equals(bienvenido);
    }

}
