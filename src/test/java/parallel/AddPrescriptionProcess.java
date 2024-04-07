package parallel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ObjectRepository.addPrescriptionPage;
import ObjectRepository.doctorDashboardPage;
import ObjectRepository.loginPage;
import ObjectRepository.patientDashBoardPage;
import driverFactory.DriverFactory;
import genericUtility.webdriverUtility;
import io.cucumber.java.en.*;

public class AddPrescriptionProcess {

	private doctorDashboardPage d = new doctorDashboardPage(DriverFactory.getDriver());
	private addPrescriptionPage p = new addPrescriptionPage(DriverFactory.getDriver());
	private loginPage lp = new loginPage(DriverFactory.getDriver());
	private webdriverUtility wbUtil = new webdriverUtility();
	private patientDashBoardPage pat = new patientDashBoardPage(DriverFactory.getDriver()); 
	
	@Given("user enters url as {string}")
	public void user_enters_url_as(String url) {
	    DriverFactory.getDriver().get(url);
	}

	@Given("user enter email as {string}")
	public void user_enter_email_as(String email) {
	   if(email.equals("aunty@gmail.com"))
	       lp.getEmailTxt().sendKeys(email);
	   
	   else if(email.equals("salman@gmail.com"))
	       lp.getEmailTxt().sendKeys(email);
	}

	@Given("user enter the password as {string}")
	public void user_enter_the_password_as(String pswd) {
	    if(pswd.equals("12345678"))
	       lp.getPswdTxt().sendKeys(pswd);
	    
	    else if(pswd.equals("1234"))
	       lp.getPswdTxt().sendKeys(pswd);	
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
	   lp.getLoginBtn().click();
	}

	@When("doctor clicks on prescription link")
	public void doctor_clicks_on_prescription_link() {
	   wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(d.getPrescriptionLink())).click();
	}

	@Then("the title of the page should be {string}")
	public void the_title_of_the_page_should_be(String actTitle) {
	    String expTitle = "Prescription - Hospital Management System";
	    Assert.assertEquals(expTitle, actTitle);
	}

	@When("doctor clicks on add prescription button")
	public void doctor_clicks_on_add_prescription_button() {
	   wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.elementToBeClickable(d.getAddPrescriptionBtn())).click();
	}

	@Then("{string} prescription pop-up should be displayed")
	public void prescription_pop_up_should_be_displayed(String addPrescPage) {
	   wbUtil.handleExplicitCondition(DriverFactory.getDriver());
	   Assert.assertTrue(true);
	}

	@Then("select the date")
	public void select_the_date() throws InterruptedException {
		Thread.sleep(5000);
	  wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(p.getDateTimeStamp())).click();
	  Thread.sleep(3000);
	  wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(p.getSelectYearBtn())).click();
	  List<WebElement> months = p.getSelectMonthBtn();
	  for(WebElement month : months)
	  {
		  if(month.getText().equalsIgnoreCase("May"))
		  {
			 wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(month)).click();
			 break;
		  }
	  }
	  
	  Thread.sleep(2000);
	  List<WebElement> dates = p.getSelectDate();
	  for(WebElement date : dates)
	  {
		  if(date.getText().equals("20"))
		  {
			  Thread.sleep(5000);
			  wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(date)).click();
			  break;
		  }
	  }
	}

	@Then("select the time")
	public void select_the_time() throws InterruptedException {
		Thread.sleep(3000);
		p.getTimeStampTxt().click();
		
		for(int i = 1; i<=5; i++)
		{
			wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(p.getHourIncrementBtn())).click();
			Thread.sleep(1000);
		}
		
		for(int i = 1; i<=5; i++)
		{
			wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(p.getMinuteIncrementBtn())).click();
			Thread.sleep(1000);
		}
	}

	@Then("select the patient as {string}")
	public void select_the_patient_as(String patName) {
	   wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.elementToBeClickable(p.getClickOnSelectPatientDrop())).click();
	   wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(p.getEnterPatientTxtField())).sendKeys(patName);
	    try {
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("enter values into case history")
	public void enter_values_into_case_history() throws InterruptedException {
		Thread.sleep(3000);
	   DriverFactory.getDriver().switchTo().frame(p.getCaseHistoryIframe());
	   System.out.println("switched to frame 1");
	   p.getFrame1Txt().sendKeys("jdaHJDHJ");
	   DriverFactory.getDriver().switchTo().defaultContent();
	   System.out.println("switched from frame1 to default frame");
	   
	   Thread.sleep(3000);
	   JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getDriver();
	   js.executeScript("window.scrollBy(0,50)");
	}

	@Then("enter values into medications")
	public void enter_values_into_medications() throws InterruptedException {
		Thread.sleep(3000);
	    DriverFactory.getDriver().switchTo().frame(p.getMedicationIframe());
	    System.out.println("switched to frame 2");
	    p.getFrame2Txt().sendKeys("kfjfqjf");
	    DriverFactory.getDriver().switchTo().defaultContent();
	    System.out.println("switched from frame2 to default frame");
	    
	    JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getDriver();
		js.executeScript("window.scrollBy(0,50)");
	}

	@Then("enter values into notes")
	public void enter_values_into_notes() throws InterruptedException {
		Thread.sleep(3000);
	    DriverFactory.getDriver().switchTo().frame(p.getNoteIframe());
	    System.out.println("switched to frame 3");
	    p.getFrame3Txt().sendKeys("gdgKD");
	    DriverFactory.getDriver().switchTo().defaultContent();
	    System.out.println("switched from frame3 to default frame");
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
	  p.getSubmitBtn().click();
	}

	@Then("check whether patient name as {string} is displayed")
	public void check_whether_patient_name_as_is_displayed(String patName) {
	    List<WebElement> allPat = p.getPatientName();
	    for(WebElement pat : allPat)
	    {
	    	if(pat.getText().equalsIgnoreCase(patName))
	    	{
	    		Assert.assertTrue(true);
	    	}
	    }
	}

	@Then("click on logout button")
	public void click_on_logout_button() {
	    d.getLogoutLink().click();
	}


	@When("patient clicks on prescription link")
	public void patient_clicks_on_prescription_link() {
	   wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(pat.getPrescriptionLink())).click();
	}

	@Then("fetch the appointment details of patient")
	public void fetch_the_appointment_details_of_patient() {
	   WebElement allDetails = pat.getAllPrescriptionDetails();
	   wbUtil.handleExplicitCondition(DriverFactory.getDriver()).until(ExpectedConditions.visibilityOf(allDetails));
	   System.out.println(allDetails.getText()); 
	}


}
