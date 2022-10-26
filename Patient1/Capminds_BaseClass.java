package Patient1;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Capminds_BaseClass {

	

		public static WebDriver driver;
		public static String value;
		
		public static String exceldata(String path, int row_Index, int Cell_Index) throws Throwable {

			File f = new File(path);

			FileInputStream fis = new FileInputStream(f);

			Workbook w = new XSSFWorkbook(fis); // upcasting

			org.apache.poi.ss.usermodel.Sheet sheetAt = w.getSheetAt(0);

			Row row = sheetAt.getRow(row_Index);

			Cell cell = row.getCell(Cell_Index);

			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {

				value = cell.getStringCellValue();

			}

			else if (cellType.equals(cellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();

				int val = (int) numericCellValue;

				value = String.valueOf(val);

			}

			return value;

		}
		// Driver Invoke

		public static WebDriver getbrowser(String type) {
			if (type.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
//				System.setProperty("webdriver.chrome.driver",
//						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

				driver = new ChromeDriver();

			} else if (type.equalsIgnoreCase("edge")) {
//				System.setProperty("webdriver.edge.driver",
//						System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			} else if (type.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.edge.driver",
//						System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe");
				WebDriverManager.firefoxdriver().setup();

				driver = new FirefoxDriver();

			} else if (type.equalsIgnoreCase("opera")) {

				WebDriverManager.operadriver().setup();

				driver = new OperaDriver();
			}

			driver.manage().window().maximize();

			return driver;

		}

		public static void geturl(String url) {

			driver.get(url);

		}

		public static void sendkeys(WebElement elements, String Value) {

			elements.sendKeys(Value);

		}

		public static void sendkeys1(WebElement elements, Keys Value) {

			elements.sendKeys(Value);

		}

		public static void Clickonelement(WebElement element) {

			element.click();

		}

		public static void clear(WebElement elements1) {

			elements1.clear();

		}

		public static void alertdismiss(WebDriver driver) {

			driver.switchTo().alert().dismiss();

		}

		public static void selectone(WebElement ele, String val) {

			Select se = new Select(ele);

			se.selectByVisibleText(val);

		}

		public static void selecttwo(WebElement eleme, String valu) {

			Select se = new Select(eleme);

			se.selectByValue(valu);

		}

		public static void gettext(WebElement text) {

			String text1 = text.getText();

			System.out.println(text1);

		}

		public static void gettexts(List<WebElement> text) {

			for (WebElement data : text) {
				String text2 = data.getText();
				System.out.println(text2);
			}

		}


}
	
