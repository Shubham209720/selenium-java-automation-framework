package demoQATest;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.HomePages;
import Pages.TextBoxPage;
import Pages.CheckBoxPage;
import Pages.RadioButtonPage;
import Pages.*;


public class DemoQATest extends BaseTest {

	@Test
	public void runDemoQAFlow() throws Exception {
		test.info("Starting DemoQA End-to-End Flow");

	    HomePages home = new HomePages(driver);
	    test.info("Clicking on Elements section");
	    home.clickElements();

	    TextBoxPage text = new TextBoxPage(driver);
	    test.info("Filling Text Box form");
	    text.fillTextBoxForm();

	    CheckBoxPage check = new CheckBoxPage(driver);
	    test.info("Selecting CheckBox");
	    check.selectCheckBox();

	    RadioButtonPage radio = new RadioButtonPage(driver);
	    test.info("Clicking Radio Buttons");
	    radio.clickRadioButtons();

	    WebTablesPage tables = new WebTablesPage(driver);
	    test.info("Adding new record in Web Tables");
	    tables.addRecord("Shubham","Chauhan","test@test.com","25","100000","Automation");

	    test.info("Deleting record from Web Tables");
	    tables.deleteRecord("Shubham");

	    ButtonsPage buttons = new ButtonsPage(driver);
	    test.info("Performing Button Actions");
	    buttons.performButtonActions();

	    LinksPage links = new LinksPage(driver);
	    test.info("Handling Links");
	    links.handleLinks();

	    BrokenLinksPage broken = new BrokenLinksPage(driver);
	    test.info("Verifying Broken Links");
	    broken.verifyBrokenLinks();

	    UploadDownloadPage upload = new UploadDownloadPage(driver);
	    test.info("Downloading File");
	    upload.downloadFile();

	    DynamicPropertiesPage dynamic = new DynamicPropertiesPage(driver);
	    test.info("Checking Dynamic Properties");
	    dynamic.checkDynamicProperties();

	    test.pass("DemoQA End-to-End Flow Completed Successfully");

	    
	}

}
