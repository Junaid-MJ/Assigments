package Test;

import org.junit.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport_Test {
	
	@Test
	public void loginTest() {
		System.out.println("Login to amazon");
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(".\\Reports\\Extentreport.html");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest T1 = extent.createTest("loginTest");
		T1.log(Status.INFO, "login to amazon");
		T1.log(Status.PASS, "Title verified");
		extent.flush();
		
		ExtentTest T2 = extent.createTest("loginTest");
		T2.log(Status.INFO, "logoff to amazon");
		T2.log(Status.FAIL, "Title verified");
		extent.flush();
		
		
		
	}

}
