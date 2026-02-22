package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import Utils.ElementsUtils;

public class BasePage {

    protected WebDriver driver;
    protected ElementsUtils utils;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.utils = new ElementsUtils(driver);
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }
}