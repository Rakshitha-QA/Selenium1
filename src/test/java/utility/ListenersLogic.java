package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListenersLogic implements ITestListener {
	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("TC pass and Listener logic started");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\admin\\eclipse-workspace\\Project1\\Maven_Screenshots\\Pass TC\\one.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("Screenshot complete on Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {		
		ITestListener.super.onTestFailure(result);
		Reporter.log("TC fail and Listener logic started");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\admin\\eclipse-workspace\\Project1\\Maven_Screenshots\\Fail TC\\oneF.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("Screenshot complete on Failure");
	}

}
