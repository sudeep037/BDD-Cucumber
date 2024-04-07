package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addPrescriptionPage {

	@FindBy(name="date_timestamp")
	private WebElement timeStampTxt;
	
	@FindBy(xpath="//th[@class='datepicker-switch' and contains(.,'April 2024')]")
	private WebElement selectYearBtn;
	
	@FindBy(xpath="//div[@class='datepicker-months']/descendant::td[@colspan='7']/child::span[@class='month']")
	private List<WebElement> selectMonthBtn;
	
	@FindBy(xpath="//div[@class='datepicker-days']/descendant::tbody/child::tr[4]/td[@class='day']")
	private List<WebElement> selectDate;
	
	@FindBy(xpath="//input[@name='date_timestamp']")
	private WebElement dateTimeStamp;
	
	@FindBy(xpath="//a[@data-action='incrementHour']")
	private WebElement hourIncrementBtn;
	
	@FindBy(xpath="//a[@data-action='incrementMinute']")
	private WebElement minuteIncrementBtn;
	
	@FindBy(xpath="//span[text()='Select Patient']")
	private WebElement clickOnSelectPatientDrop;
	
	@FindBy(xpath="//input[@class='select2-input select2-focused']")
	private WebElement enterPatientTxtField;
	
	@FindBy(xpath="(//iframe[@class='wysihtml5-sandbox'])[1]")
	private WebElement caseHistoryIframe;
	
	@FindBy(xpath="//body[@class='form-control html5editor wysihtml5-editor']")
	private WebElement frame1Txt;
	
	@FindBy(xpath="(//iframe[@class='wysihtml5-sandbox'])[2]")
	private WebElement medicationIframe;
	
	@FindBy(xpath="//body[@class='form-control html5editor wysihtml5-editor']")
	private WebElement frame2Txt;
	
	@FindBy(xpath="(//iframe[@class='wysihtml5-sandbox'])[3]")
	private WebElement noteIframe;
	
	@FindBy(xpath="//body[@class='form-control html5editor wysihtml5-editor']")
	private WebElement frame3Txt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//tbody/tr[*]/td[2]")
	private List<WebElement> patientName;
	
	public addPrescriptionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeStampTxt() {
		return timeStampTxt;
	}

	public WebElement getSelectYearBtn() {
		return selectYearBtn;
	}

	public List<WebElement> getSelectMonthBtn() {
		return selectMonthBtn;
	}

	public List<WebElement> getSelectDate() {
		return selectDate;
	}
	
	public WebElement getFrame1Txt() {
		return frame1Txt;
	}

	public WebElement getDateTimeStamp() {
		return dateTimeStamp;
	}

	public WebElement getHourIncrementBtn() {
		return hourIncrementBtn;
	}

	public WebElement getMinuteIncrementBtn() {
		return minuteIncrementBtn;
	}

	public WebElement getClickOnSelectPatientDrop() {
		return clickOnSelectPatientDrop;
	}

	public WebElement getEnterPatientTxtField() {
		return enterPatientTxtField;
	}

	public WebElement getCaseHistoryIframe() {
		return caseHistoryIframe;
	}

	public WebElement getMedicationIframe() {
		return medicationIframe;
	}

	public WebElement getNoteIframe() {
		return noteIframe;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public List<WebElement> getPatientName() {
		return patientName;
	}

	public WebElement getFrame2Txt() {
		return frame2Txt;
	}

	public WebElement getFrame3Txt() {
		return frame3Txt;
	}
	
	
	
}
