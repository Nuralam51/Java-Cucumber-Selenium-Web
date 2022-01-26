package pages;

import core.ConfigUtil;
import core.WebConnector;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BasePage {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;

    LoginPage loginPage = new LoginPage(this);
    public LoginPage getLoginPage() {
        return loginPage;
    }

    RegisterPage registerPage = new RegisterPage(this);
    public RegisterPage getRegisterPage() {
        return registerPage;
    }

}
