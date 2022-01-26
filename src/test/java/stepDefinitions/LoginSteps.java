package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import utils.TimeOut;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends BasePage {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        getLoginPage().clickLoginLink();
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        getLoginPage().enterUsername(username);
        getLoginPage().enterPassword(password);
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        getLoginPage().clickLoginBtn();
    }

    @When("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("home page");
        TimeOut.timeout();
    }

    @Then("click on logout button")
    public void click_on_logout_button() {
        getLoginPage().clickLogOutBtn();
    }

}
