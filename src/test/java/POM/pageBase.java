package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageBase {

    private WebDriver driver;

    public pageBase(WebDriver driver){//constructor
        this.driver = driver;
    }

    public boolean isDisplayed(WebElement element) throws Exception{
        try {
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento " + element);
        }
    }

    public String getTitle() throws Exception{
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo");
        }
    }

    public void click(WebElement element) throws Exception{
        try {
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento " + element);
        }
    }

    public String getText(WebElement element) throws Exception{
        try {
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento " + element);
        }
    }
}
