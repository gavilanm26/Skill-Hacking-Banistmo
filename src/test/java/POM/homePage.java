package POM;

import org.openqa.selenium.WebDriver;

public class homePage extends pageBase{

    private String titleHomePage = "Personas: Soluciones Financieras para Ti";


    public boolean homePageIsDispayed() throws Exception{
        return this.getTitle().equals(titleHomePage);
    }
    public homePage(WebDriver driver){
        super(driver);
    }//constructor
}
