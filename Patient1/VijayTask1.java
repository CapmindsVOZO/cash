package Patient1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Patient2.Capminds_BaseClass;

public class VijayTask1 extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

//	public static void main(String[] args) throws Throwable {

	@Test(priority = 0)
	
	public void Schedule_Module() throws Throwable {


		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report4/Schedule.html");

		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		System.out.println("CAPMINDS");
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);

		// Step4: Create a test cases and assign test details
		// testName //testDescription
		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

		test.assignCategory("VOZO");
		
		test.assignAuthor("Capminds");

		// Step5: Step level status

		// test.fail("Click Login button");

		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz/");

		test.pass("Browser Launched Successfully ");

		System.out.println("Browser Launched Successfully ");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "Test1234");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "Test@1234");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		test.pass("Login Successfully ");

		System.out.println("Login Successfully ");

		System.out.println("Browser Launched Successfully");

		///////// Select Patient moudule //////

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//		Clickonelement(pom.getschedloc0().getcreate());
//
//		Clickonelement(pom.getschedloc0().getcreatenewclient());
//
//		sendkeys(pom.getschedloc0().gettypefirstname(), "Martin");
//
//		sendkeys(pom.getschedloc0().gettypelastname(), "Edward");
//
//		sendkeys(pom.getschedloc0().sendtypeemail(), "kr222f22ffw@tempr.email");
//
//		sendkeys(pom.getschedloc0().gettypephonenumber(), "229449098");
//
//		sendkeys(pom.getschedloc0().geClicktId(), "22200442222");
//
//		selecttwo(pom.getschedloc0().getClickProvider(), "1");
//
//		Clickonelement(pom.getschedloc0().getsave());
//
//		System.out.println("New Patient Creadetd Successfully");
//
//////////////////New Appointment ////////////
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getschedloc0().getClickSchedule());

// Get Appointment Option

		Clickonelement(pom.getschedloc0().getcreate());

		Clickonelement(pom.getschedloc0().getAppointmentoption());

// Click Create app
//		Thread.sleep(4000);

//		Clickonelement(pom.getschedloc0().getAppointmentclick());
		Thread.sleep(8000);

		String exceldata1 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 3);

		// Enter Patient Name
		sendkeys(pom.getschedloc0().getEnterName(), exceldata1);

		// select patient name
		Thread.sleep(8000);

		Clickonelement(pom.getschedloc0().getSelectpatient1());

		// select date
		String exceldata3 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 6);

		sendkeys(pom.getschedloc0().getenterdate(), exceldata3);

		// Clickonelement(pom.getschedloc0().getSelectpatient1());

		// Select Date
//				sendkeys1(pom.getschedloc0().getClcikpatient(), Keys.TAB);
		// clear(pom.getschedloc0().getSelectdate());

		sendkeys(pom.getschedloc0().getSelectdate(), "01/09/2022");

		// Click Today
		Thread.sleep(8000);
		Clickonelement(pom.getschedloc0().getclcitoda());

		// Click Time

		sendkeys1(pom.getschedloc0().getSelectdate(), Keys.TAB);

		sendkeys(pom.getschedloc0().getSelecttime(), "10:30 AM");

		Thread.sleep(8000);
		Clickonelement(pom.getschedloc0().getSelecttimeok());

//				Clickonelement(pom.getschedloc0().getSelecttime2());
		//
//				Clickonelement(pom.getschedloc0().getSelecttime1());
		Thread.sleep(8000);

		// click until
		// Clickonelement(pom.getschedloc0().getclcitoda());

		String exceldata2 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 9);

		// Enter provider Name
		sendkeys(pom.getschedloc0().getEnterProviderNmae(), exceldata2);

		// select provider name
		Thread.sleep(8000);

		Clickonelement(pom.getschedloc0().getSelectProviderNmae());

		// click Repeats

//		Clickonelement(pom.getschedloc0().getClickRepeats());
//
//		
//		
//		
//		// select every day
//		String exceldata4 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx",  7, 12);
//
//		Clickonelement(pom.getschedloc0().getselec());
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getschedloc0().getclickevery());
//
//		// select day
//
//		String exceldata5 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx",  7, 13);
//
//		selectone(pom.getschedloc0().getClickDay(),"every");
//
////		Clickonelement(pom.getschedloc0().getselecda());
//		
//
//	//	String exceldata0 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx", 7, 5);
//		
//		// calendor cloik
//		driver.findElement(By.xpath("//input[@id='new-app-untildate']")).click();
//		
//		
//		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='new-app-untildate']")));
//		
//		SelectDate("10","Oct","2026");
//		
//		
//		sendkeys(pom.getschedloc0().getsendUntilDate(),"09/09/2022");

		// Click Profile
		String exceldata6 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 16);

		// Thread.sleep(5000);

		sendkeys(pom.getschedloc0().getClickprofile(), exceldata6);

		// Clickonelement(pom.getschedloc0().getClickprofile());

		Thread.sleep(20000);

		// Select Profile
		Clickonelement(pom.getschedloc0().getSelectprofile());

		// Click Location
		Thread.sleep(20000);

		String exceldata7 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 18);

		Thread.sleep(20000);
		sendkeys(pom.getschedloc0().getClickofffice(), exceldata7);

		Thread.sleep(20000);
		Clickonelement(pom.getschedloc0().getselectoffice());

		// Select Loction
		Thread.sleep(20000);

//		//	sendkeys(pom.getschedloc0().getselectoffice(), exceldata8);
//
//		Thread.sleep(2000);
//	//		Clickonelement(pom.getschedloc0().getselectoffice())
//			
		// String exceldata9 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx", 1, 20);

//		Thread.sleep(5000);

//		// Clcik Status
		Clickonelement(pom.getschedloc0().getClickstatus());
//
		Thread.sleep(20000);
//		
//		// select status
		Clickonelement(pom.getschedloc0().getSelectstatus());

		// Click Save
		Clickonelement(pom.getschedloc0().getClicksave());

	}

//		@Ignore
	@Test(priority = 1)

	public void Servicepage() throws InterruptedException {
		
		////////////// Payment////////////////

		// click pre

		// Clickonelement(pom.getschedloc0().getclickpre());

		// click appoi

		try {
			Thread.sleep(20000);

			Clickonelement(pom.getschedloc0().getcliccalDay());

		} catch (Exception e) {

		}
		
		// clic Date

		// Clickonelement(pom.getschedloc0().getclidate());

		// click appoi

		Thread.sleep(20000);
		//
//			Clickonelement(pom.getschedloc0().getclicapp());

//			Clickonelement(pom.getschedloc0().getFacilityclick());
//			
//			Thread.sleep(4000);
//			
//			Clickonelement(pom.getschedloc0().getFacilitySelect());

		WebDriverWait pats = new WebDriverWait(driver, 20);
		WebElement patsele = pats.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='rbc-time-content']//div[2]//div[2]//div[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);

		/////////// ICD ///////////

		// Click Sevices

		Thread.sleep(20000);

		WebDriverWait ser = new WebDriverWait(driver, 20);
		WebElement sersel = ser
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='appt_tabs-tab-2']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sersel);

		// Clickonelement(pom.getschedloc0().getClickServices());

		Thread.sleep(20000);

		// click CPT Codes
		Clickonelement(pom.getschedloc0().getClickCPTCode());

		// Enter CPT codes

		Thread.sleep(20000);

		sendkeys(pom.getschedloc0().getEnterCPTCodes(), "v");

		Thread.sleep(20000);

		// click CPT Codes
		Clickonelement(pom.getschedloc0().getSelectCPTCodes());

		Thread.sleep(20000);
		// Clear fees
		clear(pom.getschedloc0().getClearFees());

		// String exceldata6 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx",
		// 1, 21);

		// Enter Fees
		sendkeys(pom.getschedloc0().getEnterFees(), "1986");

		// press ok

		Thread.sleep(20000);
		
		Clickonelement(pom.getschedloc0().getprok());
		try {
			// delet
			Thread.sleep(20000);
			// Clickonelement(pom.getschedloc0().getprdel());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//				e.printStackTrace();
		}

		Thread.sleep(20000);

		WebElement tex = driver.findElement(By.xpath("//span[@id='appt_service_fees']//span[1]"));

		String text = tex.getText();
		System.out.println(text);

		if (text.equals("$ 1986.00")) {
			System.out.println("Correct " + text);

		} else {

			System.out.println("Not Correct");
		}

		// sele Billing

		// Thread.sleep(6000);

		Thread.sleep(20000);
		
		WebDriverWait bill = new WebDriverWait(driver, 20);
		WebElement selbi = bill
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='appt_tabs-tab-3']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selbi);
		

		// Clickonelement(pom.getschedloc0().getBillingsel());

		// crea invo
		Thread.sleep(20000);

		WebDriverWait sup = new WebDriverWait(driver, 20);
		WebElement supsel = sup
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='appt_superbill_btn'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", supsel);

//			Clickonelement(pom.getschedloc0().getsupbill());

		// super bi

//			gettext(pom.getschedloc0().getsupbillte());

		Thread.sleep(20000);
		WebElement tex1 = driver.findElement(By.className("amouts_val"));

		String text1 = tex1.getText();
		System.out.println(text1);

		if (text1.equals("$ 1986")) {
			System.out.println("Correct " + text1);

		} else {

			System.out.println("Not Correct");
		}

		// clos in

		Thread.sleep(20000);

		Clickonelement(pom.getschedloc0().getclosenvo());
		Thread.sleep(20000);

		Thread.sleep(20000);

			Clickonelement(pom.getschedloc0().getclickbillingstatus());
			
			Thread.sleep(20000);
			
			Clickonelement(pom.getschedloc0().getselectbillingstatus());

			Thread.sleep(20000);
			
			Clickonelement(pom.getschedloc0().getclickinvoice());
			
			Thread.sleep(20000);
			
			Clickonelement(pom.getschedloc0().getclickinvoice());
			
			Clickonelement(pom.getschedloc0().getclickcloseinvoice());
			

		// Pat Das
		Thread.sleep(20000);

		Clickonelement(pom.getschedloc0().getpatdash());

		// Patient Balance

		Thread.sleep(20000);
		WebElement tex2 = driver.findElement(By.xpath("(//div[@class='w-50 bill-right m-color'])[1]"));

		String text2 = tex2.getText();
		System.out.println(text2);

		if (text2.equals("$ 1986.00")) {
			System.out.println("Correct " + text2);

		} else {

			System.out.println("Not Correct");
		}

		// sele Bill

//			// Pat Das
		//
//			Thread.sleep(5000);
		//
//			Clickonelement(pom.getschedloc0().getpatdemo());

//			driver.close();

	}

	@Test(priority = 2)

	public void Billing() throws InterruptedException {

		// Click On Month Option
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Thread.sleep(20000);

		// click Billing Module
		Clickonelement(pom.getschedloc0().getClickBillingModule());

		// Thread.sleep(4000);
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement patpay = wait3.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Payments'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patpay);

		// Clickonelement(pom.getBilling().getpatientpayment());

		// patient search

		sendkeys(pom.getschedloc0().getpateintsear1(), "Martin");

		// Total Balance

		Thread.sleep(20000);
		
		WebElement tex3 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]"));

		String text3 = tex3.getText();
		System.out.println(text3);

		if (text3.equals("$ 1986")) {
			System.out.println("Correct " + text3);

		} else {

			System.out.println("Not Correct");
		}

		// click patientpayment1

		// Thread.sleep(8000);

		WebDriverWait wait9 = new WebDriverWait(driver, 10);
		WebElement patpay1 = wait9
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Patients Payment']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patpay1);

		// Clickonelement(pom.getschedloc0().getpateintpayment1());

		// search pat

		sendkeys(pom.getschedloc0().getpateintsear2(), "Martin");

		//

		// Clickonelement(pom.getschedloc0().getselepatpay());

		// Total Balance

		Thread.sleep(20000);
		WebElement tex4 = driver.findElement(By.xpath(
				"(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeSmall'])[5]"));

		String text4 = tex4.getText();

		System.out.println(text4);

		if (text4.equals("$ 1986")) {
			System.out.println("Correct " + text4);

		} else {

			System.out.println("Not Correct");
		}

		// gettext(pom.getBilling().getselepatpay());

		// click patientpayment1

		Thread.sleep(20000);

		Clickonelement(pom.getschedloc0().getpateintpayment1());

		// search pat

		sendkeys(pom.getschedloc0().getpateintsear2(), "Martin");

		//
		Thread.sleep(20000);

		Clickonelement(pom.getschedloc0().getselepatpay());

		// Total Balance

		Thread.sleep(20000);
		WebElement tex5 = driver.findElement(By.xpath(
				"(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeSmall'])[5]"));

		String text5 = tex5.getText();
		System.out.println(text4);

		if (text4.equals("$ 1986")) {
			System.out.println("Correct " + text4);

		} else {

			System.out.println("Not Correct");
		}

		// gettext(pom.getBilling().getselepatpay());

	}

	// @Ignore
	@Test(priority = 3)

	public void PatientStatements() throws InterruptedException {
		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// click Billing Module
//		Clickonelement(pom.getschedloc0().getClickBillingModule());
		///////// patient statement//////////////////

		// Thread.sleep(4000);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement patsta = wait4.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Statements'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsta);

		// Clickonelement(pom.getBilling().getpatientstate());

		// patient state se

		sendkeys(pom.getschedloc0().getpateintsear3(), "Martin");

		// click patientpayment1
		Thread.sleep(20000);

		Clickonelement(pom.getschedloc0().getclipateintsear3());

		// clic sear

		Clickonelement(pom.getschedloc0().getclisear1());

		// Total Balance
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Thread.sleep(8000);
		WebElement tex5 = driver.findElement(By.xpath("//table/tbody/tr/td[8]"));

		String text5 = tex5.getText();
		System.out.println(text5);

		if (text5.equals("$ 1986")) {
			System.out.println("Correct " + text5);

		} else {

			System.out.println("Not Correct");
		}

		// cli all pat

		Thread.sleep(20000);

		Clickonelement(pom.getschedloc0().getallpatcl());

		// patient state se

		sendkeys(pom.getschedloc0().getsearchpat4(), "Martin");

		// click patientpayment1
		Thread.sleep(20000);

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getschedloc0().getclipateintsear4());

		// click sera

		Clickonelement(pom.getschedloc0().getclisear5());

		// Total Balance
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Thread.sleep(8000);
		WebElement tex6 = driver.findElement(By.xpath("(//table)[2]/tbody/tr/td[8]"));

		String text6 = tex6.getText();
		System.out.println(text6);

		if (text6.equals("$ 1986")) {
			System.out.println("Correct " + text6);

		} else {

			System.out.println("Not Correct");
		}

		// driver.close();

	}

	// @Ignore
	@Test(priority = 4)

	public void PatientLedger() throws InterruptedException {

		////////////////////// Patient balance /ledger //////////////

		// Thread.sleep(3000);

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement patled = wait5.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Ledger'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patled);

		// click Patient balance Ledger
		// Clickonelement(pom.getBilling().getClickPatientBalanceLedger());

		// Enter client name
		sendkeys(pom.getschedloc0().getEnterClientName(), "Martin");

		// click select john peter

		Thread.sleep(20000);
		Clickonelement(pom.getschedloc0().getSelectJonPeter());

		// click top on Patient balance Ledger details
		Thread.sleep(20000);
		
		WebDriverWait clipa = new WebDriverWait(driver, 10);
		WebElement selepa = clipa.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selepa);

		Thread.sleep(20000);
		
		WebElement tex7 = driver.findElement(By.xpath("//table/tbody/tr/td[7]"));

		String text7 = tex7.getText();
		System.out.println(text7);

		if (text7.equals("$ 1986")) {
			System.out.println("Correct " + text7);

		} else {

			System.out.println("Not Correct");
		}
	}

}
