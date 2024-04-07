package parallel;

import org.junit.Assert;

import ObjectRepository.loginPage;
import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import junit.framework.*;

public class login {
	
	private loginPage lp = new loginPage(DriverFactory.getDriver());
	
	@Given("when user enters url as {string}")
	public void when_user_enters_url_as(String url) {
	    DriverFactory.getDriver().get(url);
	}

	@When("doctor enters the email as {string}")
	public void doctor_enters_the_email_as(String email) {
	    lp.getEmailTxt().sendKeys(email);
	}

	@When("doctor enters the password as {string}")
	public void doctor_enters_the_password_as(String pswd) {
	   lp.getPswdTxt().sendKeys(pswd);
	}

	@Then("{string} page should be displayed")
	public void page_should_be_displayed(String string) {
	   String expDashBoard1 = "Doctor Dashboard";
	   String expDashBoard2 = "Patient Dashboard";
	   
	   if(expDashBoard1.equals(string))
	   Assert.assertEquals(expDashBoard1, string);
	   
	   else if(expDashBoard2.equals(string))
	   Assert.assertEquals(expDashBoard2, string);
	}
	
	@When("patient enters the email as {string}")
	public void patient_enters_the_email_as(String username) {
	    lp.getEmailTxt().sendKeys(username);
	}

	@When("patient enters the password as {string}")
	public void patient_enters_the_password_as(String pswd) {
	    lp.getPswdTxt().sendKeys(pswd);
	}
	
    @When("click on login button")
    public void click_on_login_button() {
    lp.getLoginBtn().click();
    
}
}
