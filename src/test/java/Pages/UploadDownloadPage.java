package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class UploadDownloadPage extends BasePage  {

    public UploadDownloadPage(WebDriver driver) {
    	super(driver);
    }

    @FindBy(xpath = "//span[text()='Upload and Download']")
    WebElement uploadDownloadTab;

    @FindBy(xpath = "//a[@role='button']")
    WebElement downloadBtn;

    public void downloadFile() {
    	utils.click(uploadDownloadTab);
    	utils.click(downloadBtn);
    }
}
