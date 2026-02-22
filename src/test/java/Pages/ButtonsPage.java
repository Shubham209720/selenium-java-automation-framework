package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class ButtonsPage extends BasePage {

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Buttons']")
    WebElement buttonsTab;

    @FindBy(xpath = "//button[text()='Double Click Me']")
    WebElement doubleClickBtn;

    @FindBy(xpath = "//button[text()='Right Click Me']")
    WebElement rightClickBtn;

    @FindBy(xpath = "//button[text()='Click Me']")
    WebElement clickMeBtn;

    public void performButtonActions() {

        utils.click(buttonsTab);

        // Use BasePage driver
        new Actions(driver).doubleClick(doubleClickBtn).perform();
        new Actions(driver).contextClick(rightClickBtn).perform();

        utils.click(clickMeBtn);
    }
}