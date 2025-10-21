package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Facebook
{
	WebDriver driver;
	
	//step 1
	@FindBy(id="email")
	private	WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbutton;
	
	
	//step 2
	public void username_valid()
	{
		username.sendKeys("stbymkt@gmail.com");
	}
	public void password_valid()
	{
		password.sendKeys("stbymkt1234");
	}
	public void loginWithCorrectCred()
	{
		loginbutton.click();
	}
	
	
	//step 3
	public LoginPage_Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
