package base;

import core.WebConnector;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;

public class DriverFactory extends BasePage {

    @BeforeSuite
    public void setUp() {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.manage().window().maximize();
    }

}
