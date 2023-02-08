package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class WikipediaSearchPage {
    public WikipediaSearchPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "searchInput")
    public WebElement searchBar;
    @FindBy(id = "firstHeading")
    public WebElement firstHeading;

    @FindBy(css = "button[class*='progressive']")
    public WebElement searchButton;

    @FindBy(css = ".link-box > strong")
    public List<WebElement> listOfL;

}
