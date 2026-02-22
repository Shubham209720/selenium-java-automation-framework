package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import java.util.Set;

public class LinksPage extends BasePage  {

    public LinksPage(WebDriver driver) {
    	super(driver);

    }

    @FindBy(xpath = "//span[text()='Links']")
    WebElement linksTab;

    @FindBy(xpath = "//a[@id='simpleLink']")
    WebElement homeLink;

    @FindBy(xpath = "//a[@id='dynamicLink']")
    WebElement dynamicLink;

    public void handleLinks() {
    	utils.click(linksTab);

        String parent = driver.getWindowHandle();

        utils.click(homeLink);
        utils.click(dynamicLink);

        Set<String> windows = driver.getWindowHandles();

        for (String win : windows) {
            if (!win.equals(parent)) 
            {
                driver.switchTo().window(win);
                break;
            }
        }

        driver.close();
        driver.switchTo().window(parent);}
}

