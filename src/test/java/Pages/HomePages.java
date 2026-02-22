package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages extends BasePage {

    public HomePages(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsCard;

    public void clickElements() {
        utils.click(elementsCard);
    }
}