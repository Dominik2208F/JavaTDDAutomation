package Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Page1;


public class MasterData  {
	static String Registration;
	static String BusinessPurpouse;
	static String CommunityPurpouse;
	static String TypeOfBusiness;
	static String KM;
	static String Male;
	static String Name;
	static String Surname;
	static double Day;
	static double Month;
	static double Year;
	static String email;
	static double Phone;
	static String Employment;
	static String Occupation;
	static String Adress;
	static String TypeofHouseHold;
	static String Licence;
	static String EssentialDriving;
	static String LicenceTime;
	static String PenaltyPoints;
	static double HowManyPenalty;
	static String Reason;
	static String RecentInsurance;
	static String NCD;
	static String Discount;
	static String Breakdown;
	static String OpenDriving;
	static String ProtectedNoClaim;
	File src;
	FileInputStream fis;
	XSSFWorkbook xsf;
	XSSFSheet sheet;
  public MasterData() throws IOException {
		src = new File("C:/Users/Domin/eclipse-workspace/AxaIreland/src/test/java/Test/Data.xlsx");
		fis= new FileInputStream(src);
	    xsf= new XSSFWorkbook(fis);
		sheet = xsf.getSheetAt(0);
	}

  public MasterData DataRowLoader(int row) throws Exception {			 
	 

	  Registration= sheet.getRow(row).getCell(0).getStringCellValue();
      BusinessPurpouse= sheet.getRow(row).getCell(1).getStringCellValue();
	  CommunityPurpouse = sheet.getRow(row).getCell(2).getStringCellValue();
	  TypeOfBusiness= sheet.getRow(row).getCell(3).getStringCellValue();
	  KM= sheet.getRow(row).getCell(4).getStringCellValue();
	  Male= sheet.getRow(row).getCell(5).getStringCellValue();
	  Name= sheet.getRow(row).getCell(6).getStringCellValue();
	  Surname= sheet.getRow(row).getCell(7).getStringCellValue();
	  Day= sheet.getRow(row).getCell(8).getNumericCellValue();
	  Month= sheet.getRow(row).getCell(9).getNumericCellValue();
	  Year = sheet.getRow(row).getCell(10).getNumericCellValue();
	  email= sheet.getRow(row).getCell(11).getStringCellValue();
     Phone= sheet.getRow(row).getCell(12).getNumericCellValue();
	  Employment= sheet.getRow(row).getCell(13).getStringCellValue();
	  Occupation= sheet.getRow(row).getCell(14).getStringCellValue();
	  Adress= sheet.getRow(row).getCell(15).getStringCellValue();
	  TypeofHouseHold= sheet.getRow(row).getCell(16).getStringCellValue();
	  Licence= sheet.getRow(row).getCell(17).getStringCellValue();
	  EssentialDriving= sheet.getRow(row).getCell(18).getStringCellValue();
	  LicenceTime= sheet.getRow(row).getCell(19).getStringCellValue();
	  PenaltyPoints= sheet.getRow(row).getCell(20).getStringCellValue();
	  HowManyPenalty= sheet.getRow(row).getCell(21).getNumericCellValue();
	  Reason= sheet.getRow(row).getCell(22).getStringCellValue();
	  RecentInsurance= sheet.getRow(row).getCell(23).getStringCellValue();
	  NCD= sheet.getRow(row).getCell(24).getStringCellValue();
	  Discount= sheet.getRow(row).getCell(25).getStringCellValue();
	  Breakdown= sheet.getRow(row).getCell(26).getStringCellValue();
	  OpenDriving=sheet.getRow(row).getCell(27).getStringCellValue();
	  ProtectedNoClaim= sheet.getRow(row).getCell(28).getStringCellValue();
	  return this;
}

   public MasterData JavaExecutor(WebDriver driver,By element1) {
	   WebElement element = TestMain.Driver.findElement(element1);
	   JavascriptExecutor executor = (JavascriptExecutor) driver;
	   executor.executeScript("arguments[0].click();", driver.findElement(element1));
	   executor.executeScript("arguments[0].scrollIntoView(true);", element);
	   
	   return this;
   }
   public MasterData IsElementVisible(WebDriver driver,By element) {
	   WebElement x = new WebDriverWait(driver, Duration.ofSeconds(30))
		        .until(ExpectedConditions.visibilityOf(driver.findElement(element)));
	   return this;
   }
   public MasterData IsElementClicable(WebDriver driver,By element) {
	   
	   WebElement x = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
	return this;
   }
   public static void ScrollToAndClick(By id) throws Exception {
		
	   
		try {
			WebElement element = TestMain.Driver.findElement(id);
			JavascriptExecutor js = (JavascriptExecutor) TestMain.Driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
			}
		catch(NoSuchElementException e) {
			System.out.println("Element not found"  + id);
			e.printStackTrace();
			TestMain.Driver.close();
		    }
		catch(StaleElementReferenceException  e) {
			System.out.println("Element is impossible to be clicable on trace" + id);
		}
		
	}
   public static void SetTextBox(By id, String valueforlopp) {
	   WebElement element = TestMain.Driver.findElement(id); 
	   element.click();
	   for( int i=0; i< valueforlopp.length(); i++) {
		   element.sendKeys(valueforlopp.substring(i,i+1));
	   }
	   
   }
   public static void ScrollToElement(By id) {
	   
	   WebElement element = TestMain.Driver.findElement(id);  
		JavascriptExecutor js = (JavascriptExecutor) TestMain.Driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	   
   }
}