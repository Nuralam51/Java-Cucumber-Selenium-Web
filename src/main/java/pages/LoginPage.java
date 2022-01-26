package pages;

import org.openqa.selenium.By;
import static core.WebConnector.driver;

public class LoginPage {

    By loginLink = By.xpath("//*[@id='login2']");
    By username = By.xpath("//*[@id='loginusername']");
    By password = By.xpath("//*[@id='loginpassword']");
    By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    By logOutBtn = By.xpath("//*[@id='logout2']");

    public LoginPage(BasePage pages) {
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLoginBtn() {
        driver.findElement(loginButton).click();
    }

    public void clickLogOutBtn() {
        driver.findElement(logOutBtn).click();
    }

}
