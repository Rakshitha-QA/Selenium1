package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1_Facebook_Login 
{
	WebDriver driver;
   @Test
   public void withValidCredentails()
   {
	  driver=new ChromeDriver(); 
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  LoginPage_Facebook loginpage=new LoginPage_Facebook(driver);
	  loginpage.username_valid();
	  loginpage.password_valid();
	  loginpage.loginWithCorrectCred();
	
	   
	   
   }
	
	
	
	
}
