package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doctorDashboardPage {

	@FindBy(xpath="//span[text()='Appointment']")
	private WebElement appointmentLink;
	
	@FindBy(xpath="//span[text()='Appointment List']")
	private WebElement appointmentListLink;
	
	@FindBy(xpath="//span[text()='Requested Appointments']")
	private WebElement requestedAppointmentLink;
	
	@FindBy(xpath="//span[text()='Prescription']")
	private WebElement prescriptionLink;
	
	@FindBy(xpath="//span[text()='Patient']")
	private WebElement patientLink;
	
	@FindBy(xpath="//span[text()='Bed Allotment']")
	private WebElement bedAllotmentLink;
	
	@FindBy(xpath="//span[text()='Blood Bank']")
	private WebElement bloodBankLink;
	
	@FindBy(xpath="//span[text()='Report']")
	private WebElement reportLink;
	
	@FindBy(xpath="//span[text()='Message']")
	private WebElement messageLink;
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profileLink;
	
	@FindBy(xpath="//button[contains(.,'Add Prescription')]")
	private WebElement addPrescriptionBtn;
	
	@FindBy(xpath="//a[contains(.,'Log Out')]")
	private WebElement logoutLink;
	
	public doctorDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAppointmentLink() {
		return appointmentLink;
	}

	public WebElement getAppointmentListLink() {
		return appointmentListLink;
	}

	public WebElement getRequestedAppointmentLink() {
		return requestedAppointmentLink;
	}

	public WebElement getPrescriptionLink() {
		return prescriptionLink;
	}

	public WebElement getPatientLink() {
		return patientLink;
	}

	public WebElement getBedAllotmentLink() {
		return bedAllotmentLink;
	}

	public WebElement getBloodBankLink() {
		return bloodBankLink;
	}

	public WebElement getReportLink() {
		return reportLink;
	}
	
	public WebElement getAddPrescriptionBtn() {
		return addPrescriptionBtn;
	}


	public WebElement getMessageLink() {
		return messageLink;
	}

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
