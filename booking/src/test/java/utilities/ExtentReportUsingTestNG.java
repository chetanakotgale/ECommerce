package utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportUsingTestNG implements ITestListener {
	
	ExtentHtmlReporter htmlReport;
	@Override
	public void onTestStart(ITestResult result) {

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// not implemented
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	@Override
	public void onFinish(ITestContext context) {
		// not implemented
	}
	
	
	
	
	
	
	
	
	
	

//@SuppressWarnings("deprecation")
//public class ExtentReportUsingTestNG implements ITestListener
//{
//
//	ExtentHtmlReporter htmlReport;
//	ExtentReports extent;
//	ExtentTest test;
//	
//	WebDriver driver = null;
//	private static Logger log = LogManager.getLogger(ExtentReportUsingTestNG.class);
//	
//	@SuppressWarnings({ })
//	@BeforeSuite
//	public void setUp() throws IOException {
//		
//		String path = System.getProperty("user.dir");
//		htmlReport = new ExtentHtmlReporter(path+"//extentReports//report.html");
//		extent = new ExtentReports();
//		
//		extent.attachReporter(htmlReport);
//		log.info("Set up");
//		
//	}
//	
//	@Test
//	public void test() throws IOException
//	{
//		
//			test = extent.createTest("ExtentTest","Extent Test Execution");
//			
//			test.log(Status.INFO, "This step shows usage of log(status, details)");
//
//	        // info(details)
//	        test.info("This step shows usage of info(details)");
//	    
//	        
//	}
//	
//	
//	@AfterSuite
//	public void tearDown()
//	{
//		extent.flush();
//	}

}
