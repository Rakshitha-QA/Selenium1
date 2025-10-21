package package1.Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_loginPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//Step 1
     @FindBy(name="email")
     private WebElement username;
     
     @FindBy(xpath="//input[@class='a-button-input']")
     private WebElement continueButton;
     
     @FindBy(name="password")
     private WebElement password;
     
     @FindBy(id="signInSubmit")
     private WebElement signinButton;
     
     //Step 2
     public void validUserName()
     {
    	 wait.until(ExpectedConditions.visibilityOf(username));
    	 username.sendKeys("6361392365"); 	 
     }
     public void continueClick()
     {
    	 wait.until(ExpectedConditions.elementToBeClickable(continueButton));
    	 continueButton.click();
     }
     public void validPassword() throws InterruptedException
     {
    	 wait.until(ExpectedConditions.visibilityOf(password));
    	 password.sendKeys("Travelasuwish@165");
     }
     public void signinClick()
     {
    	 wait.until(ExpectedConditions.elementToBeClickable(signinButton));
    	 signinButton.click();
     }
     
   //Step 3
     public Amz_loginPage(WebDriver driver)
     {

    	 PageFactory.initElements(driver, this);
     }
}
