package pages;

import org.openqa.selenium.By;

import static core.WebConnector.driver;

public class RegisterPage {

    By signUpLink = By.xpath("//*[@id='signin2']");
    By username = By.xpath("//*[@id='sign-username']");
    By password = By.xpath("//*[@id='sign-password']");
    By signUpBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By closeBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");

    public RegisterPage(BasePage page) {
    }

    public void clickSignUpLink() {
        driver.findElement(signUpLink).click();
    }

    public void enterUsername(String mail) {
        driver.findElement(username).sendKeys(mail);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickSignUpBtn() {
        driver.findElement(signUpBtn).click();
    }

    public void clickCloseBtn() {
        driver.findElement(closeBtn).click();
    }
}
