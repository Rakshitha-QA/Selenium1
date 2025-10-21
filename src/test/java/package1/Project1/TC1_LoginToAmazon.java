package package1.Project1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.BaseClass;
import utility.RetryLogic;
import utility.ListenersLogic;

@Listeners(ListenersLogic.class)
public class TC1_LoginToAmazon extends BaseClass {
	
	
	@Test(retryAnalyzer=RetryLogic.class)
	public void withValidCred() throws InterruptedException
	{
		
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.hoveroverOnAccountandList(driver);;     
		homepage.signinFrmHomePage();		
		Amz_loginPage loginpage = new Amz_loginPage(driver);
		loginpage.validUserName();
		loginpage.continueClick();
		loginpage.validPassword();
		loginpage.signinClick();
		
		Reporter.log("Login is success");
	}

}
