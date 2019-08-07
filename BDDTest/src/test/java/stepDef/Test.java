package stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import stepbean.UserBean;

public class Test {
	private WebDriver driver;
	private UserBean bean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^User is on UserInformation page$")
	public void user_is_on_UserInformation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Spring\\BDDTest\\UserInformation.html");
		bean = new UserBean(driver);
	}

	@When("^username is invalid$")
	public void username_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid username$")
	public void then_show_message_invalid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the Applicant Name";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^firstName is invalid$")
	public void firstname_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid firstname$")
	public void then_show_message_invalid_firstname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the First Name ";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^lastname is invalid$")
	public void lastname_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("Shivam");
		bean.setLastname("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid lastname$")
	public void then_show_message_invalid_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the Last Name ";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^fathername is invalid$")
	public void fathername_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("Shivam");
		bean.setLastname("Johri");
		bean.setFathername("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid fathername$")
	public void then_show_message_invalid_fathername() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the Father Name ";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^dob is invalid$")
	public void dob_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("Shivam");
		bean.setLastname("Johri");
		bean.setFathername("Sanjeev");
		bean.setDob("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid dob$")
	public void then_show_message_invalid_dob() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the DOB";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^gender is invalid$")
	public void gender_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^then show message invalid gender$")
	public void then_show_message_invalid_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^mobileno is invalid$")
	public void mobileno_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("Shivam");
		bean.setLastname("Johri");
		bean.setFathername("Sanjeev");
		bean.setDob("18/10/1996");
		bean.setGender("Male");
		bean.setMobileno("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid mobileno$")
	public void then_show_message_invalid_mobileno() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill Mobile no";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^email is invalid$")
	public void email_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("Shivam");
		bean.setLastname("Johri");
		bean.setFathername("Sanjeev");
		bean.setDob("18/10/1996");
		bean.setGender("Male");
		bean.setMobileno("9643218778");
		bean.setEmail("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid email$")
	public void then_show_message_invalid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the Email id ";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	

	@When("^landline is invalid$")
	public void landline_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("Shivam");
		bean.setLastname("Johri");
		bean.setFathername("Sanjeev");
		bean.setDob("18/10/1996");
		bean.setGender("Male");
		bean.setMobileno("9643218778");
		bean.setEmail("shivam@gmail.com");
		bean.setLandline("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid landline$")
	public void then_show_message_invalid_landline() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String exmessage="please fill the landline no";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^communication is invalid$")
	public void communication_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^then show message invalid communication$")
	public void then_show_message_invalid_communication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^all invalid details$")
	public void all_invalid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^then go to UserInformation page$")
	public void then_go_to_UserInformation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^all valid details$")
	public void all_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setUsername("Shivam");
		bean.setFirstname("Shivam");
		bean.setLastname("Johri");
		bean.setFathername("Sanjeev");
		bean.setDob("18/10/1996");
		bean.setGender("Male");
		bean.setMobileno("9643218778");
		bean.setEmail("shivam@gmail.com");
		bean.setLandline("2451121");
		bean.setCommunication("Residence");
		bean.setLoginButton();
	}

	@Then("^then go to PaymentDetails page$")
	public void then_go_to_PaymentDetails_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Spring\\BDDTest\\PaymentDetails.html");
	}


}
