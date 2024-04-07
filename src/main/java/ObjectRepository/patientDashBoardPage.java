package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class patientDashBoardPage {

	@FindBy(xpath="//span[text()='Appointment']")
	private WebElement appointmentLink;
	
	@FindBy(xpath="//span[text()='Appointment List']")
	private WebElement appointmentListLink;
	
	@FindBy(xpath="//span[text()='Pending Appointments']")
	private WebElement pendingAppointmentLink;
	
	@FindBy(xpath="//span[text()='Prescription']")
	private WebElement prescriptionLink;
	
	@FindBy(xpath="//span[text()='Doctor']")
	private WebElement doctorLink;
	
	@FindBy(xpath="//span[text()='Blood Bank']")
	private WebElement bloodBankLink;
	
	@FindBy(xpath="//span[text()='Admit History']")
	private WebElement admitHistory;
	
	@FindBy(xpath="//span[text()='Operation History']")
	private WebElement operationHistory;
	
	@FindBy(xpath="//span[text()='Invoice']")
	private WebElement invoiceLink;
	
	@FindBy(xpath="//span[text()='Message']")
	private WebElement messageLink;
	
	@FindBy(xpath="//table[@id='table-2']/descendant::tbody/tr[*]")
	private WebElement allPrescriptionDetails;
	
	@FindBy(xpath="//table[@id='table-2']/descendant::tbody/tr[*]/td[1]")
	private WebElement prescriptionDateAndTime;
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profileLink;
	
	@FindBy(xpath="//a[contains(.,'Log Out')]")
	private WebElement logoutLink;
	
	public patientDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAppointmentLink() {
		return appointmentLink;
	}

	public WebElement getAppointmentListLink() {
		return appointmentListLink;
	}

	public WebElement getPendingAppointmentLink() {
		return pendingAppointmentLink;
	}

	public WebElement getPrescriptionLink() {
		return prescriptionLink;
	}

	public WebElement getDoctorLink() {
		return doctorLink;
	}

	public WebElement getBloodBankLink() {
		return bloodBankLink;
	}

	public WebElement getAdmitHistory() {
		return admitHistory;
	}

	public WebElement getOperationHistory() {
		return operationHistory;
	}

	public WebElement getInvoiceLink() {
		return invoiceLink;
	}

	public WebElement getMessageLink() {
		return messageLink;
	}

	public WebElement getAllPrescriptionDetails() {
		return allPrescriptionDetails;
	}

	public WebElement getPrescriptionDateAndTime() {
		return prescriptionDateAndTime;
	}

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
