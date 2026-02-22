package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='text' and text()='Text Box']")
    private WebElement textBoxMenu;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement fullName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement email;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddress;

    @FindBy(xpath= "//textarea[@id='permanentAddress']")
    private WebElement permanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitBtn;

    public void fillTextBoxForm() {

        utils.click(textBoxMenu);
        utils.sendKeys(fullName, "Test User");
        utils.sendKeys(email, "test@test.com");
        utils.sendKeys(currentAddress, "Current Address");
        utils.sendKeys(permanentAddress, "Permanent Address");
        utils.click(submitBtn);
    }
}