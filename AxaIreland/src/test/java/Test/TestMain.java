package Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Page1;
import Pages.Page2;

public class TestMain {

	static WebDriver Driver;
	MasterTest Test;
	MasterData MasterData;



@Before
public void BrowserSetUp() throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:/Users/Domin/eclipse-workspace/AxaIreland/src/test/resources/Drivers/chromedriver.exe");
	Driver=new ChromeDriver();
	MasterData= new MasterData();
	Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	Driver.navigate().to("https://www.axa.ie/car-insurance/quote/your-details/?promoCode=AXP020001");
}
@Test
public void Test0() throws IOException, Exception { 
 
	MasterData.DataRowLoader(1); // run first row from Data.xlsx.
	new MasterTest(Driver).
    PageOneLouncher().
    PageTwoLouncher().
    PageThreeLouncher().
    PageFourLouncher();
}

@Test
public void Test1() throws IOException, Exception { 
	
	MasterData.DataRowLoader(2); // run second row from Data.xlsx.
	new MasterTest(Driver).
	PageOneLouncher().
	PageTwoLouncher().
	PageThreeLouncher().
	PageFourLouncher();
}

@After
public void DriverTearDown() {
	
	Driver.close();
	Driver.quit();
	
}


}
