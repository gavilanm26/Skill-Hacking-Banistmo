package SeleniumGlueCode;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import Runner.browser_manager.driverManager;
import Runner.browser_manager.driverManagerFactory;
import Runner.browser_manager.driverType;

import java.io.FileReader;
import java.util.Properties;

public class hooks {

    private static WebDriver driver;
    private driverManager driverManager;

    @Before
    public void setUp() throws Exception{//iniciar navegador

        Properties properties = new Properties();
        properties.load(new FileReader( "src/test/resources/config.properties"));

        driverManager = driverManagerFactory.getManager(driverType.CHROME);
        driver = driverManager.getDriver();

        driver.get(properties.getProperty("url_base"));
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
