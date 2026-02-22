package Utils;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class ElementsUtils {

    private WebDriver driver;
    private WebDriverWait wait;

    public ElementsUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

        try {
            element.click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
        }
    }

    // Send Keys
    public void sendKeys(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }

    // Wait for Visible (By locator)
    public void waitForVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for Clickable (By locator)
    public void waitForClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for Clickable (WebElement)
    public void waitForClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for Invisible
    public void waitForInvisible(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
}