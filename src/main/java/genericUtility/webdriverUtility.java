package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverUtility {

	public WebDriverWait handleExplicitCondition(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 35);
		return wait;
	}
}
