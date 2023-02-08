package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechGlobalLoginFormPage extends TechGlobalBasePage{


    public TechGlobalLoginFormPage(){super();}

    @FindBy(id = "main_heading")
    public WebElement mainHeading;
    @FindBy(xpath = "(//label)[1]")
    public WebElement usernameLabel;
    @FindBy(xpath = "(//label)[2]")
    public WebElement passwordLabel;
    @FindBy(xpath = "(//input)[1]")
    public WebElement usernameInput;
    @FindBy(xpath = "(//input)[2]")
    public WebElement passwordInput;
    @FindBy(id = "login_btn")
    public WebElement loginButton;
    @FindBy(id = "logout")
    public WebElement logoutButton;
    @FindBy(id = "forgot-password")
    public WebElement forgotPassword;
    @FindBy(xpath = "//*[text()='You are logged in']")
    public WebElement loginMessageText;
    @FindBy(xpath = "//*[text()='Login Form']")
    public WebElement loginFormText;
    @FindBy(id = "error_message")
    public WebElement invalid_username_message;
    @FindBy(id = "error_message")
    public WebElement invalid_password_message;
    @FindBy(id = "success_lgn")
    public WebElement success_login_message;









}
