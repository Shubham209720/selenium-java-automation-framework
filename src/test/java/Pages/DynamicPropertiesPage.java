package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicPropertiesPage extends BasePage {

    public DynamicPropertiesPage(WebDriver driver) {
        super(driver); 
    }

    @FindBy(xpath = "//span[text()='Dynamic Properties']")
    private WebElement dynamicTab;

    @FindBy(xpath = "//button[text()='Will enable 5 seconds']")
    private WebElement enableBtn;

    public void checkDynamicProperties() {

        utils.click(dynamicTab);
        utils.waitForClickable(enableBtn);

        System.out.println("Button enabled: " + enableBtn.isEnabled());
    }
}