package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class RegisterUser {
	
	WebDriver ldriver;
	
	public RegisterUser(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[text()=' Signup / Login']")
	WebElement signUp;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement emailAddressFieldOfNewUser;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement nameField;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement signUpButton;
	
	@FindBy(xpath="//h2[text()='New User Signup!']")
	WebElement titleOfNewRegistrationSection;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement selectPrefixAsMrs;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement selectDay;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement selectMonth;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement selectYear;
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement newsLetterCheckbox;
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement specialOffersCheckbox;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//button[text()='Create Account']")
	WebElement createAccountButton;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement continueButton;
	
	@FindBy(xpath="//a[text()=' Delete Account']")
	WebElement deleteAccountButton;
	 
	@FindBy(xpath="//a[text()='Continue']")
	WebElement ContinueButtonAfterAccountDeletion;
	
	public void clickOnSignupOrLoginLink() {
		signUp.click();
	}
	public void enterName() {
		nameField.sendKeys("Sneha");
	}
	public void enterEmailId() {
		emailAddressFieldOfNewUser.sendKeys("Snehkar15@gmail.com");
	}
	public void clickOnSignupButton() {
		signUpButton.click();
	}
	public void selectTitle() {
		selectPrefixAsMrs.click();
	}
	public void enterPassword() {
		passwordField.sendKeys("Sneha@1111");
	}
	public void selectDay() {
		Select day=new Select(selectDay);
		day.selectByValue("15");
	}
	public void selectMonth() {
		Select month=new Select(selectMonth);
		month.selectByValue("5");
	}
	public void selectYear() {
		Select year=new Select(selectYear);
		
		year.selectByVisibleText("1995");
	}
	public void checkedNewsletterCheckbox() {
		newsLetterCheckbox.click();
	}
	public void checkedSpecialOfferCheckbox() {
		specialOffersCheckbox.click();
	}
	public void enterFirstName() {
		firstName.sendKeys("Sneha");
	}
		public void enterLastName() {
		lastName.sendKeys("Khandalkar");
	}
	public void enterCompany() {
		company.sendKeys("I2I");
	}
		public void enterAddress() {
			address.sendKeys("Baner Pune");
	}
	public void enterState() {
		state.sendKeys("Maharashtra");
		}
	public void enterCity() {
			city.sendKeys("Pune");
		}
	public void enterZipCode() {
			zipCode.sendKeys("411045");
		}
	public void enterMobileNumber() {
			mobileNumber.sendKeys("1111111111");
		}	
	public void clickOnCreateAccountButton() {
	        createAccountButton.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
    }
	public void clickOnDeleteAccountButton() {
		deleteAccountButton.click();
	}
	public void clickOnContinueButtonAfterAccountDeletion() {
		ContinueButtonAfterAccountDeletion.click();
	}
}
