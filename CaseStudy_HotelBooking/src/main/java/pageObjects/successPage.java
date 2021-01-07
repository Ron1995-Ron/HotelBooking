package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseC.TestBaseC;

public class successPage extends TestBaseC {
	@FindBy(xpath="//h1")
	WebElement PageHeadingSuccess;
	
	public successPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getSuccessPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getSuccessPageHeading() {
		return PageHeadingSuccess.getText();
	}
}