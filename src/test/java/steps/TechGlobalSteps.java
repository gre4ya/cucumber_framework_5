package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import pages.TechGlobalDynamicTablesPage;
import pages.TechGlobalFrontendTestingHomePage;
import utils.Driver;

public class TechGlobalSteps {


    WebDriver driver;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;
    TechGlobalDynamicTablesPage techGlobalDynamicTablesPage;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalDynamicTablesPage= new TechGlobalDynamicTablesPage();
    }

    @When("user clicks on Practices dropdown in the header")
    public void userClicksOnPracticesDropdownInTheHeader() {
        techGlobalFrontendTestingHomePage.headerDropdown.click();
    }

    @And("user selects the {string} option")
    public void userSelectsTheOption(String option) {
        switch (option){
            case "Frontend Testing":
                techGlobalFrontendTestingHomePage.headerDropdownOptions.get(0).click();
                break;
            case "Dynamic Tables":
                techGlobalFrontendTestingHomePage.clickOnCard(option);
                break;
            default:
                throw new NotFoundException("Provided option is not defined properly in feature file");
        }

    }

    @Then("user should see {string} heading")
    public void userShouldSeeHeading(String headerText) {
        Assert.assertEquals(headerText, techGlobalDynamicTablesPage.headingText.getText());
    }

    @When("user clicks the {string} button")
    public void userClicksTheButton(String argument) {
        switch(argument){
            case "ADD PRODUCT":
                techGlobalDynamicTablesPage.addProductButton.click();
                break;
            case "CLOSE":
                techGlobalDynamicTablesPage.closeButton.click();
                break;
            default:
                throw new NotFoundException("Button text is not defined properly in feature file");
        }
    }

    @Then("validate {string} pop-up is displayed")
    public void validatePopUpIsDisplayed(String popup) {
        Assert.assertEquals(popup, techGlobalDynamicTablesPage.modalCardTitle.getText());
    }

    @Then("user should not see Add New Product pop-up")
    public void userShouldNotSeeAddNewProductPopUp() {
        Assert.assertFalse(techGlobalDynamicTablesPage.modalCardTitle.isDisplayed());
    }
}