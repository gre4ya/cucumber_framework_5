package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import pages.EtsyHomePage;
import utils.Driver;

import java.util.stream.IntStream;

public class EtsySteps {

    WebDriver driver;
    EtsyHomePage etsyHomePage;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        etsyHomePage = new EtsyHomePage();
    }

    @Then("user should see header elements as below")
    public void user_should_see_header_elements_as_below(DataTable headerDropdownsExpected) {
        IntStream.range(0, etsyHomePage.headerDropdownsActual.size()).forEach(i ->
                         Assert.assertEquals(headerDropdownsExpected.asList().get(i),
                                 etsyHomePage.headerDropdownsActual.get(i).getText()));
    }
}
