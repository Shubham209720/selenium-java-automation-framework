package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage {

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='text' and text()='Radio Button']")
    private WebElement radioButtonMenu;

    @FindBy(xpath = "//label[@for='yesRadio']")
    private WebElement yesRadio;

    @FindBy(xpath = "//label[@for='impressiveRadio']")
    private WebElement impressiveRadio;

    public void clickRadioButtons() {

        utils.click(radioButtonMenu);
        utils.click(yesRadio);         
        utils.click(impressiveRadio);  
    }
}