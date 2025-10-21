package package1.Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.RetryLogic;
import utility.ListenersLogic;

@Listeners(ListenersLogic.class)
public class TC3_LoginToAmazonSearchingLogout extends BaseClass
{	
	@Test(retryAnalyzer=RetryLogic.class)
	public void withValidCred() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.hoveroverOnAccountandList(driver);;     
		homepage.signinFrmHomePage();
		
		wait.until(ExpectedConditions.titleContains("signin"));
		
		Amz_loginPage loginpage = new Amz_loginPage(driver);
		loginpage.validUserName();
		loginpage.continueClick();
		loginpage.validPassword();
		loginpage.signinClick();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
		
		homepage.searchingItem();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Sign Out']")));
		
		homepage.hoveroverOnAccountandList(driver); 
		homepage.signoutFrmHomePage();	
		
		Reporter.log("Login to amazon and search product and logout success");
		
	}

}
