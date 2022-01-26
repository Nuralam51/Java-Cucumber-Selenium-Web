package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TimeOut;

public class Base extends DriverFactory {

    @Before
    public void setup() {
        setUp();
        driver.get(myProp.getProperty("webUrl"));
    }

//    @Before("@registration")
//    public void registrationTest() {
//        driver.get(myProp.getProperty("webUrl"));
//    }

    @After
    public void afterTest() {
        if (driver != null) {
            TimeOut.timeout();
            driver.close();
        }
    }

}
