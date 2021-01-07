package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseC.TestBaseC;

public class LoginPage extends TestBaseC {
	@FindBy(xpath="//h1[@align='center']")
	WebElement LoginPageHeadingExpected;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement ButtonLogin;
	
	@FindBy(xpath="//div[@id='userErrMsg']")
	WebElement ErrorMessageAppearsWithoutUsername;
	
	@FindBy(name="userName")
	WebElement NameOfUser;
	
	@FindBy(name="userPwd")
	WebElement PwdUser;
	
    @FindBy(xpath="//div[@id='pwdErrMsg']")
	WebElement ErrorMessageAppearsWithoutPassword;
	
    public LoginPage() {
		PageFactory.initElements(driver, this);
	}
    
	public String getLoginPageHeading() {
		return driver.findElement(By.xpath("//h1[@align='center']")).getText();
	}
	
	public String loginWithoutUserName() {
		ButtonLogin.click();
		return driver.findElement(By.xpath("//div[@id='userErrMsg']")).getText();
	}
	
	public String loginWithoutPassword() {
		NameOfUser.sendKeys("admin");
		ButtonLogin.click();
		return driver.findElement(By.xpath("//div[@id='pwdErrMsg']")).getText();
	}
	
	public String getExpectedHeading() {
		return LoginPageHeadingExpected.getText();	
	}
	public String getExpectedErrorMessageWihoutUsername() {
		return ErrorMessageAppearsWithoutUsername.getText();	
	}
	
	public String getExpectedErrorMessageWihoutPassword() {
		return expectedErrorMessageWithoutPassword.getText();
	}
	
	public void login(String uname, String pwd) {
		NameOfUser.sendKeys(uname);
		PwdUser.sendKeys(pwd);
		ButtonLogin.click();
	}
}