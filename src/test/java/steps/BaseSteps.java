package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.WindowHandler;

public class BaseSteps {
    WebDriver driver;

    @Before
    public void setup(){
        driver = Driver.getDriver();
    }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        System.out.println(url);
        driver.get(url);
    }

    @Then("user should see {string} in the url")
    public void user_should_see_in_the_url(String key) {
        WindowHandler.switchToChildWindow();
        Assert.assertTrue(driver.getCurrentUrl().contains(key));
    }
    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String key) {
        Assert.assertTrue(driver.getTitle().contains(key));
    }


}
