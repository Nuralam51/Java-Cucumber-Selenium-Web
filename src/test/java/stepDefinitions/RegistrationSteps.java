package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import pages.BasePage;

import java.util.Iterator;
import java.util.Set;

public class RegistrationSteps extends BasePage {

    @Given("user is in sign up page")
    public void user_is_in_sign_up_page() {
        getRegisterPage().clickSignUpLink();
    }

    @When("user fill {string} and {string}")
    public void user_fill_and(String username, String password) {
        getRegisterPage().enterUsername(username);
        getRegisterPage().enterPassword(password);
    }

    @And("click on sign up button")
    public void click_on_sign_up_button() {
        getRegisterPage().clickSignUpBtn();
    }

    @And("register successfully")
    public void register_successfully() {

    }

    @Then("close sign up page")
    public void close_sign_up_page() {
        getRegisterPage().clickCloseBtn();
    }
}
