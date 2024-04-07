package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	private WebDriver driver;
	
	@FindBy(id="email")
	private WebElement emailTxt;
	
	@FindBy(id="password")
	private WebElement pswdTxt;
	
	@FindBy(xpath="//button[contains(.,'Login')]")
	private WebElement loginBtn;
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPswdTxt() {
		return pswdTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
