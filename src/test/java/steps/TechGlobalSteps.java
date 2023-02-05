package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalSteps {

    WebDriver driver;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;

    @When("user clicks on {string} dropdown in the header")
    public void user_clicks_on_dropdown_in_the_header(String dropdown) {
    }

    @When("user selects the {string} option")
    public void user_selects_the_option(String text) {
    }

    @When("user selects the {string} card")
    public void user_selects_the_card(String cardNames) {

    }

    @Then("user should see {string} heading")
    public void user_should_see_heading(String text) {

    }

    @When("user clicks the ADD PRODUCT button")
    public void user_clicks_the_ADD_PRODUCT_button() {

    }

    @Then("validate {string} pop-up is displayed")
    public void validate_pop_up_is_displayed(String popup) {

    }

    @When("user clicks the close button")
    public void user_clicks_the_close_button() {

    }

    @Then("user should not see Add New Product pop-up")
    public void user_should_not_see_Add_New_Product_pop_up() {

    }
}
