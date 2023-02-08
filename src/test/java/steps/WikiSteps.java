package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.WikipediaSearchPage;
import utils.Driver;
import utils.Waiter;
import utils.WindowHandler;

public class WikiSteps {
    WebDriver driver;
    WikipediaSearchPage wikipediaSearchPage;
    @Before
    public void setup(){
        driver = Driver.getDriver();
        wikipediaSearchPage = new WikipediaSearchPage();
    }
    @When("user searches for {string} on Wikipedia")
    public void user_searches_for_on_Wikipedia(String string) {
        wikipediaSearchPage.searchBar.sendKeys(string);
        wikipediaSearchPage.searchButton.click();
    }

    @Then("user should see {string} in the first heading")
    public void user_should_see_in_the_first_heading(String string) {
        Assert.assertTrue(wikipediaSearchPage.firstHeading.getText().contains(string));
    }

}
