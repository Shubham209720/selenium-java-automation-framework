package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WebTablesPage extends BasePage {

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTablesTab;

    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "age")
    private WebElement age;

    @FindBy(id = "salary")
    private WebElement salary;

    @FindBy(id = "department")
    private WebElement department;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;


    public void addRecord(String fName, String lName,String mail, String userAge,String userSalary, String dept) {

        utils.click(webTablesTab);
        utils.click(addButton);
        utils.sendKeys(firstName, fName);
        utils.sendKeys(lastName, lName);
        utils.sendKeys(email, mail);
        utils.sendKeys(age, userAge);
        utils.sendKeys(salary, userSalary);
        utils.sendKeys(department, dept);
        utils.click(submit);

        By addedLocator = By.xpath( "//button[@id='addNewRecordButton']");
        utils.waitForVisible(addedLocator);
        Assert.assertTrue(
                driver.findElements(addedLocator).size() > 0,
                "Record was NOT added successfully!"
        );
    }

    public void deleteRecord(String fName) {

        By deleteLocator = By.xpath("//td[normalize-space()='" + fName + "']/parent::tr//span[contains(@id,'delete')]");
        WebElement deleteBtn = driver.findElement(deleteLocator);

        // Use ElementsUtils click for safe click
        utils.click(deleteBtn);
    }
}