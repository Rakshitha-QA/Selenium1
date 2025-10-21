package package1.Project1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_HomePage{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//FluentWait<WebDriver> wait1=new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class).ignoring(NullPointerException.class);
	
	
	//Step 1
     @FindBy(xpath="(//a[@data-nav-role='signin'])[1]")
     private WebElement accountandList;
     
     @FindBy(xpath="(//span[text()='Sign in'])[1]")
     private WebElement signin;
     
     @FindBy(xpath="//span[text()='Sign Out']")
     private WebElement signout;
     
     @FindBy(xpath="//input[@id='twotabsearchtextbox']")
     private WebElement searchbox;
     
     //Step 2
     public void hoveroverOnAccountandList(WebDriver driver)
     {
    	 Actions a1 = new Actions(driver);
    	 a1.moveToElement(accountandList).perform();   	 
     }
     public void signinFrmHomePage()
     {
    	 wait.until(ExpectedConditions.elementToBeClickable(signin));
    	 signin.click();
     }
     public void signoutFrmHomePage()
     {
    	// wait1.until(ExpectedConditions.elementToBeClickable(signout));
    	 wait.until(ExpectedConditions.elementToBeClickable(signout));
    	 signout.click();
     }
     public void searchingItem()
     { 
    	 wait.until(ExpectedConditions.visibilityOf(searchbox));
    	 searchbox.sendKeys("Lunch bag"+Keys.ENTER);
     }
     
     //Step 3
     public Amz_HomePage(WebDriver driver)
     {
    
    	 PageFactory.initElements(driver, this);
     }
}
