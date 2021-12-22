package SeleniumGlueCode;

<<<<<<< HEAD
import POM.*;
=======
import POM.acercaDeN;
import POM.chat;
import POM.chatBienvenido;
import POM.homePage;
import POM.LeerPDF;
>>>>>>> b2607f6fe43216b711715b2193fcbfd846bf641c
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

    protected WebDriver driver = hooks.getDriver();
    protected homePage HomePage = PageFactory.initElements(driver, homePage.class);
    protected acercaDeN AcercaDeN = PageFactory.initElements(driver, acercaDeN.class);
    protected chat Chat = PageFactory.initElements(driver, chat.class);
    protected chatBienvenido ChatBienvenido = PageFactory.initElements(driver, chatBienvenido.class);
    protected LeerPDF leerpdf = PageFactory.initElements(driver, LeerPDF.class);
}
