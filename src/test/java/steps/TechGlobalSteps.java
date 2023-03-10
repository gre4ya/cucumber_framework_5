package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import pages.TechGlobalAlertsPage;
import pages.TechGlobalDynamicTablesPage;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalLoginFormPage;
import utils.AlertHandler;
import utils.Driver;
import utils.Waiter;

import java.util.stream.IntStream;

public class TechGlobalSteps {


    WebDriver driver;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;
    TechGlobalDynamicTablesPage techGlobalDynamicTablesPage;
    TechGlobalAlertsPage techGlobalAlertsPage;
    TechGlobalLoginFormPage techGlobalLoginFormPage;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalDynamicTablesPage= new TechGlobalDynamicTablesPage();
        techGlobalAlertsPage = new TechGlobalAlertsPage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
    }

    @When("user clicks on Practices dropdown in the header")
    public void userClicksOnPracticesDropdownInTheHeader() {
        techGlobalFrontendTestingHomePage.headerDropdown.click();
    }

    @And("user selects the {string} option")
    public void userSelectsTheOption(String option) {
        switch (option) {
            case "Frontend Testing":
                techGlobalFrontendTestingHomePage.headerDropdownOptions.get(0).click();
                break;
            case "Dynamic Tables":
            case "Alerts":
            case "Login Form":
                techGlobalFrontendTestingHomePage.clickOnCard(option);
                break;
            default:
                throw new NotFoundException();
        }
    }

    @Then("user should see {string} heading")
    public void userShouldSeeHeading(String headerText) {
        switch(headerText) {
            case "Dynamic Tables":
                Assert.assertEquals(headerText, techGlobalDynamicTablesPage.headingText.getText());
                break;
            case "Alerts":
                Assert.assertEquals(headerText, techGlobalAlertsPage.headingText.getText());
                break;
                 case "Login Form":
                Assert.assertEquals(headerText, techGlobalLoginFormPage.mainHeading.getText());
                break;

            default:
                throw new NotFoundException();
        }
    }
    @When("user clicks the {string} button")
    public void userClicksTheButton(String argument) {

        switch (argument){
            case "ADD PRODUCT":
                techGlobalDynamicTablesPage.addProductButton.click();
                break;
            case "CLOSE":
                techGlobalDynamicTablesPage.closeButton.click();
                break;
            default:
                throw new NotFoundException("The button text is not defined properly in the feature file");
        }

    }

    @Then("validate {string} pop-up is displayed")
    public void validatePopUpIsDisplayed(String popup) {
        Assert.assertEquals(popup, techGlobalDynamicTablesPage.modalCardTitle.getText());
    }

    @Then("user should not see Add New Product pop-up")
    public void userShouldNotSeeAddNewProductPopUp() {
        try{
        Assert.assertFalse(techGlobalDynamicTablesPage.modalCardTitle.isDisplayed());
    }catch(NoSuchElementException e){
        Assert.assertTrue(true);}
    }

    @Then("user should see buttons as below")
    public void user_should_see_buttons_as_and(DataTable warningButtons) {
        IntStream.range(0, techGlobalAlertsPage.alertButtons.size()).forEach(i -> {
            Assert.assertEquals(warningButtons.asList().get(i), techGlobalAlertsPage.alertButtons.get(i).getText());
        });
    }

    @Then("user should see {string} text")
    public void user_should_see_text(String resultText) {
        Assert.assertEquals(resultText, techGlobalAlertsPage.resultTitle.getText());
    }

    @When("user clicks on {string} box")
    public void user_clicks_on_Warning_alert_box(String alertButton) {
        techGlobalAlertsPage.clickOnAlert(alertButton);
    }

    @Then("user should see a popup displaying message {string}")
    public void user_should_see_a_popup_displaying_message(String message) {
        Waiter.pause(1);
        Assert.assertEquals(message, AlertHandler.getAlertText());
        Waiter.pause(1);
        AlertHandler.acceptAlert();
    }

    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {
        techGlobalLoginFormPage.usernameInput.sendKeys(username);
        techGlobalLoginFormPage.passwordInput.sendKeys(password);
        techGlobalLoginFormPage.loginButton.click();
    }

    @Then("user should see a {string} message")
    public void user_should_see_a_message(String errorMessage) {
        switch(errorMessage){
            case "Invalid Username entered!":
                Assert.assertEquals(errorMessage, techGlobalLoginFormPage.invalid_username_message.getText());
                break;
            case "Invalid Password entered!":
                Assert.assertEquals(errorMessage, techGlobalLoginFormPage.invalid_password_message.getText());
                break;

            case "You are logged in":
                Assert.assertEquals(errorMessage, techGlobalLoginFormPage.success_login_message.getText());
                break;
            default:
                throw new NotFoundException("The error is not defined properly in the feature file");
        }
    }
}