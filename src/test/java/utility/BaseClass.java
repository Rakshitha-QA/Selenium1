package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass extends ListenersLogic
{
   @Parameters("browser")
	@BeforeMethod
	public void launch(String nameofbrowser) throws InterruptedException {
	   
		if(nameofbrowser.equals("chrome")) {
			driver= new ChromeDriver();
			Reporter.log("Chrome browser is launched");	
			}
		if(nameofbrowser.equals("firefox")) {
			driver= new FirefoxDriver();
			Reporter.log("Firefox browser is launched");
		}
		if(nameofbrowser.equals("Edge")) {
			driver= new EdgeDriver();
			Reporter.log("Edge browser is launched");
		}		
		driver.get("https://www.Amazon.in");
		Reporter.log("Amazon website is launched");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterMethod
	public void quit() throws InterruptedException {
		driver.quit();
	}

}
