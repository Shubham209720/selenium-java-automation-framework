package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {

    public CheckBoxPage(WebDriver driver) {
        super(driver); 
    }

    @FindBy(xpath = "//span[@class='text' and text()='Check Box']")
    private WebElement checkBoxMenu;

    @FindBy(xpath = "//span[text()='Home']/preceding-sibling::span")
    private WebElement homeCheckBox;

    public void selectCheckBox() {

        utils.click(checkBoxMenu);
        utils.click(homeCheckBox);
    }
}