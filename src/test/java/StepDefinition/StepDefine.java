package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.RegisterUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefine {

	public WebDriver driver;
	
	public RegisterUser registerUser;
	
	@Given("Launch browser")
	public void launch_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		registerUser =new RegisterUser(driver);
	    
	}

	@When("Navigate to url {string}")
	public void navigate_to_url(String url) {
	    
		driver.get(url);
	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		String expectedTitle="Automation Exercise";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);//Pass
			System.out.println("Home page is visible");
		
		}
		else {
			Assert.assertTrue(false);//Fail
		}
	    
	}

	@When("Click on Signup or Login button")
	public void click_on_signuplogin_button() {
		
		
		registerUser.clickOnSignupOrLoginLink();
	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String expectedTitleOfNewRegistration) {
		
		String actualTitleOfNewRegistration=driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		System.out.println(actualTitleOfNewRegistration);
		if(actualTitleOfNewRegistration.contains(expectedTitleOfNewRegistration)) {
			Assert.assertTrue(true);//Pass
		}
		else {
			Assert.assertTrue(false);//Fail
		}
	}

	@And("Enter name and email address")
	public void enter_name_and_email_address() {
		registerUser.enterName();
		registerUser.enterEmailId();
	}

	@When("Click Signup button")
	public void click_button() {
		
		registerUser.clickOnSignupButton();
	  
	}

	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String expectedtitleofNewUserRegistrationPage) {
		String actualTitleofNewUserRegistrationPage=driver.findElement(By.xpath("//b[text()='Enter Account Information']")).getText();
		System.out.println(actualTitleofNewUserRegistrationPage);
		if(actualTitleofNewUserRegistrationPage.contains(expectedtitleofNewUserRegistrationPage)) {
			Assert.assertTrue(true);//Pass
		}
		else {
			Assert.assertTrue(false);//Fail
		}
	}

	@And("Fill details: Title, Name, Email, Password, Date of birth")
	public void fill_details_title_name_email_password_date_of_birth() {
		
		registerUser.selectTitle();
		registerUser.enterPassword();
		registerUser.selectDay();
		registerUser.selectMonth();
		registerUser.selectYear();	    
	}

	@And("Select checkbox Sign up for our newsletter!")
	public void select_checkboxofNewsletter() {
		registerUser.checkedNewsletterCheckbox();
	}
	@And("Select checkbox Receive special offers from our partners!")
	public void select_checkboxOfSpecialOffers() {
		registerUser.checkedSpecialOfferCheckbox();
	}

	@And("Fill details: First name, Last name, Company, Address, Country, State, City, Zipcode, Mobile Number")
	public void fill_details_first_name_last_name_company_address_country_state_city_zipcode_mobile_number() {
		registerUser.enterFirstName();
		registerUser.enterLastName();
		registerUser.enterCompany();
		registerUser.enterAddress();
		registerUser.enterState();
		registerUser.enterCity();
		registerUser.enterZipCode();
		registerUser.enterMobileNumber();
		
	}
	    

	@When("Click Create Account button")
	public void click_create_account_button() {
		registerUser.clickOnCreateAccountButton();
	}

	@Then("Verify that account created {string} is visible")
	public void verify_that_is_visible_and_click_button(String expectedMessageAfterAccountCreation) {
		String actualMessageAfterAccountCreation=driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
		System.out.println(actualMessageAfterAccountCreation);
		if(actualMessageAfterAccountCreation.contains(expectedMessageAfterAccountCreation)) {
			Assert.assertTrue(true);//Pass
		}
		else {
			Assert.assertTrue(false);//Fail
		}
	    
	}
	@When("Click Continue button")
	public void click_continue_button() {
		registerUser.clickOnContinueButton();
	}

	@Then("Verify that username {string} is visible")
	public void verify_that_login_as_username_is_visible(String expectedTitleAfterLogin) {
		String actualTitleAfterLogin=driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
		System.out.println(actualTitleAfterLogin);
		if(actualTitleAfterLogin.contains(expectedTitleAfterLogin)) {
			Assert.assertTrue(true);//Pass
		}
		else {
			Assert.assertTrue(false);//Fail
		}
		
	}
	@When("Click Delete Account button")
	public void click_delete_account_button() {
		registerUser.clickOnDeleteAccountButton();
	}

	@Then("Verify that account deleted {string} is visible")
	public void verify_that_account_deleted_is_visible(String expectedMessageAfterAccountDeletion) {
		String actualMessageAfterAccountDeletion=driver.findElement(By.xpath("//b[text()='Account Deleted!']")).getText();
		System.out.println(actualMessageAfterAccountDeletion);
		if(actualMessageAfterAccountDeletion.contains(expectedMessageAfterAccountDeletion)) {
			Assert.assertTrue(true);//Pass
		}
		else {
			Assert.assertTrue(false);//Fail
		}
		//b[text()='Account Deleted!']
	    
	}
	@When("click Continue button")
	public void click_continue_button1() {
		registerUser.clickOnContinueButtonAfterAccountDeletion();
		
	  
	}
	@And("close the browser")
	public void closeTheBrowser() {
		driver.quit();
	}

}
