package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helpers.LinkHelper;
import java.time.Duration;
import java.util.List;

public class BrokenLinksPage extends BasePage 
{

    public BrokenLinksPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//span[text()='Broken Links - Images']")
    WebElement brokenTab;

    public void verifyBrokenLinks() throws Exception 
    {
    	utils.click(brokenTab);
        List<WebElement> links = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h1[text()='Broken Links - Images']/following-sibling::a")));

        for (WebElement e : links) 
        {
            String url = e.getAttribute("href");
            if (url == null || url.isEmpty())
            continue;
            int responseCode = LinkHelper.getResponseCode(url);
            if (responseCode >= 400)
            System.out.println("Broken: " + url);
            else
            System.out.println("Valid: " + url);
        }
    	
      }
  }
       

