package Runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends driverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
