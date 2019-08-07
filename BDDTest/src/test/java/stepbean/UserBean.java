package stepbean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserBean {
	WebDriver driver;
	
	
	@FindBy(id="txtName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="txtFName")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(name="txtLName")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(name="txtFtName")
	@CacheLookup
	WebElement fathername;
	
	@FindBy(name="txtDOB")
	@CacheLookup
	WebElement dob;
	
	@FindBy(name="rdbML")
	@CacheLookup
	WebElement gender;
	
	@FindBy(name="txtMNo")
	@CacheLookup
	WebElement mobileno;
	
	@FindBy(name="txtEmailID")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="txtEmail")
	@CacheLookup
	WebElement landline;
	
	@FindBy(name="rdbRAddress")
	@CacheLookup
	WebElement communication;
	
	@FindBy(name="bnSubmit")
	@CacheLookup
	WebElement loginButton;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}

	public WebElement getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername.sendKeys(fathername);
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob.sendKeys(dob);
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender=driver.findElement(By.id("rdbMale"));
		this.gender.click();
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno.sendKeys(mobileno);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline.sendKeys(landline);
	}

	public WebElement getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		this.communication=driver.findElement(By.id("rdbResAddress"));
		this.gender.click();
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton() {
		this.loginButton.click();
	}
	public UserBean(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	

}
