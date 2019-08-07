package stepbean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentBean {
	WebDriver driver;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement name;
	
	@FindBy(name="debit")
	@CacheLookup
	WebElement debitno;
	
	@FindBy(name="cvv")
	@CacheLookup
	WebElement cvv;
	
	@FindBy(name="month")
	@CacheLookup
	WebElement expiremonth;
	
	@FindBy(name="year")
	@CacheLookup
	WebElement expireyear;
	
	public PaymentBean(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(String name) {
		this.name.sendKeys(name);
	}

	public WebElement getDebitno() {
		return debitno;
	}

	public void setDebitno(String debitno) {
		this.debitno.sendKeys(debitno);
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public WebElement getExpiremonth() {
		return expiremonth;
	}

	public void setExpiremonth(String expiremonth) {
		this.expiremonth.sendKeys(expiremonth);
	}

	public WebElement getExpireyear() {
		return expireyear;
	}

	public void setExpireyear(String expireyear) {
		this.expireyear.sendKeys(expireyear);
	}
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton() {
		this.loginButton.click();
	}
	
	
	
	
}
