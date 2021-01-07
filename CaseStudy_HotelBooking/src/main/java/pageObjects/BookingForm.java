package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import baseC.TestBaseC;

public class BookingForm extends TestBaseC {
	@FindBy(id = "txtFirstName")
	WebElement FieldFirstName;

	@FindBy(id = "txtLastName")
	WebElement FieldLastName;

	@FindBy(id = "txtEmail")
	WebElement FieldEmail;

	@FindBy(id = "txtPhone")
	WebElement FieldMobile;

	@FindBy(xpath = "//textarea")
	WebElement FieldAddress;

	@FindBy(xpath = "//table//tbody//tr[6]//td")
	WebElement LabelAddress;

	@FindBy(id = "btnPayment")
	WebElement ButtonConfirm;

	@FindBy(name = "city")
	WebElement DropdownCity;

	@FindBy(name = "state")
	WebElement DropdownState;

	@FindBy(name = "persons")
	WebElement DropdownPeople;

	@FindBy(id = "rooms")
	WebElement numberOfRooms;

	@FindBy(id = "txtCardholderName")
	WebElement NameOfCardHolder;

	@FindBy(id = "txtDebit")
	WebElement CardDebit;

	@FindBy(id = "txtCvv")
	WebElement CVV;

	@FindBy(id = "txtMonth")
	WebElement MonthExpiration;

	@FindBy(id = "txtYear")
	WebElement YearExpiration;

	public BookingForm() {
		PageFactory.initElements(driver, this);
	}

	public String getBookingFormTitle() {
		return driver.getTitle();
	}

	public String getBookingFormUrl() {
		return driver.getCurrentUrl();
	}

	public String confirmWithoutFirstName() {
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutLastName() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutEmail() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithIncorrectEmail() {
		FieldEmail.sendKeys(prop.getProperty("incorrectEmail"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutMobile() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithIncorrectMobile() {
		FieldMobile.sendKeys(prop.getProperty("incorrectMobile"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String enterAddress() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		return addressField.getAttribute("value");
	}

	public String confirmWithoutCity() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutState() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(DropdownCity);
		selCity.selectByVisibleText(prop.getProperty("city"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String selectPeople() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(DropdownCity);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(DropdownState);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(DropdownPeople);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		return numberOfRooms.getText();
	}

	public String confirmWithoutCardHolder() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(DropdownCity);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(DropdownState);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(DropdownPeople);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutDebitCard() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(DropdownCity);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(DropdownState);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(DropdownPeople);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutCVV() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(DropdownCity);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(DropdownState);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(DropdownPeople);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		debitCard.sendKeys(prop.getProperty("debitCard"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutExpMonth() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(DropdownCity);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select();
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(DropdownPeople);
		selPeople.selectByVisibleText(prop.geDropdownStatetProperty("persons"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		debitCard.sendKeys(prop.getProperty("debitCard"));
		cvv.sendKeys(prop.getProperty("cvv"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutExpYear() {
		MonthExpiration.sendKeys(prop.getProperty("expirationMonth"));
		ButtonConfirm.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}
	
	public void confirmWithAllDetails() {
		FieldFirstName.sendKeys(prop.getProperty("firstName"));
		FieldLastName.sendKeys(prop.getProperty("lastName"));
		FieldEmail.sendKeys(prop.getProperty("correctEmail"));
		FieldMobile.sendKeys(prop.getProperty("correctMobile"));
		FieldAddress.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(DropdownCity);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(DropdownState);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(DropdownPeople);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		NameOfCardHolder.sendKeys(prop.getProperty("cardHolderName"));
		CardDebit.sendKeys(prop.getProperty("debitCard"));
		CVV.sendKeys(prop.getProperty("cvv"));
		MonthExpiration.sendKeys(prop.getProperty("expirationMonth"));
		YearExpiration.sendKeys(prop.getProperty("expirationYear"));
		ButtonConfirm.click();
	}
}
