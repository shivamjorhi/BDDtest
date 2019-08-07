package stepDef2;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepbean.PaymentBean;
import stepbean.UserBean;


public class Test {
	
	private WebDriver driver;
	private PaymentBean bean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^User is on PaymentDetails page$")
	public void user_is_on_PaymentDetails_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Spring\\BDDTest\\PaymentDetails.html");
		bean = new PaymentBean(driver);
	}

	@When("^cardholdername is invalid$")
	public void cardholdername_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Shivam");
		bean.setLoginButton();
	}

	@Then("^then show message invalid cardholdername$")
	public void then_show_message_invalid_cardholdername() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the Card holder name";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^debitcardno is invalid$")
	public void debitcardno_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Shivam");
		bean.setDebitno("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid debitcardno$")
	public void then_show_message_invalid_debitcardno() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the Debit card Number";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^cvv is invalid$")
	public void cvv_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Shivam");
		bean.setDebitno("12345");
		bean.setCvv("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid cvv$")
	public void then_show_message_invalid_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the CVV";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^expiremonth is invalid$")
	public void expiremonth_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Shivam");
		bean.setDebitno("12345");
		bean.setCvv("111");
		bean.setExpiremonth("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid expiremonth$")
	public void then_show_message_invalid_expiremonth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill expiration month";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^expireyear is invalid$")
	public void expireyear_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Shivam");
		bean.setDebitno("12345");
		bean.setCvv("111");
		bean.setExpiremonth("july");
		bean.setExpireyear("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid expireyear$")
	public void then_show_message_invalid_expireyear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Please fill the expiration year";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
		
	}


}
