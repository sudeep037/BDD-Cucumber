package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import genericUtility.propertyUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class configureHooks {

	private DriverFactory driverFact;
	private WebDriver driver;
	private propertyUtility readProp;
	Properties prop;
	
	@Before(order=0)
	public void getProperty()
	{
		readProp = new propertyUtility();
		prop = readProp.initializeProperties();
	}
	
	@Before(order=1)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFact = new DriverFactory();
		driver = driverFact.initializeDriver(browserName);
	}
	
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario sc)
	{
		if(sc.isFailed())
		{
			String screenShot = sc.getName().replaceAll(" ","_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath, "image/png", screenShot);
		}
	}
	
}
