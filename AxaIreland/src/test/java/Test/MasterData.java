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

import Mapping.VariablesMapping;
import Pages.Page1;


public class MasterData  {
	
	
	File src;
	FileInputStream fis;
	XSSFWorkbook xsf;
	XSSFSheet sheet;
  public MasterData() throws IOException {
		src = new File("C:\\Users\\Domin\\git\\LocalAxaIrelandRepo\\AxaIreland\\src\\test\\java\\Test\\Data.xlsx");
		fis= new FileInputStream(src);
	    xsf= new XSSFWorkbook(fis);
		sheet = xsf.getSheetAt(0);
	}

  public MasterData DataRowLoader(int row) throws Exception {			 
	 

	  VariablesMapping.Registration= sheet.getRow(row).getCell(0).getStringCellValue();
	  VariablesMapping.BusinessPurpouse= sheet.getRow(row).getCell(1).getStringCellValue();
	  VariablesMapping.CommunityPurpouse = sheet.getRow(row).getCell(2).getStringCellValue();
	  VariablesMapping.TypeOfBusiness= sheet.getRow(row).getCell(3).getStringCellValue();
	  VariablesMapping.KM= sheet.getRow(row).getCell(4).getStringCellValue();
	  VariablesMapping.Male= sheet.getRow(row).getCell(5).getStringCellValue();
	  VariablesMapping.Name= sheet.getRow(row).getCell(6).getStringCellValue();
	  VariablesMapping.Surname= sheet.getRow(row).getCell(7).getStringCellValue();
	  VariablesMapping.Day= sheet.getRow(row).getCell(8).getNumericCellValue();
	  VariablesMapping.Month= sheet.getRow(row).getCell(9).getNumericCellValue();
	  VariablesMapping.Year = sheet.getRow(row).getCell(10).getNumericCellValue();
	  VariablesMapping.email= sheet.getRow(row).getCell(11).getStringCellValue();
	  VariablesMapping.Phone= sheet.getRow(row).getCell(12).getNumericCellValue();
	  VariablesMapping.Employment= sheet.getRow(row).getCell(13).getStringCellValue();
	  VariablesMapping.Occupation= sheet.getRow(row).getCell(14).getStringCellValue();
	  VariablesMapping.Adress= sheet.getRow(row).getCell(15).getStringCellValue();
	  VariablesMapping.TypeofHouseHold= sheet.getRow(row).getCell(16).getStringCellValue();
	  VariablesMapping.Licence= sheet.getRow(row).getCell(17).getStringCellValue();
	  VariablesMapping.EssentialDriving= sheet.getRow(row).getCell(18).getStringCellValue();
	  VariablesMapping.LicenceTime= sheet.getRow(row).getCell(19).getStringCellValue();
	  VariablesMapping.PenaltyPoints= sheet.getRow(row).getCell(20).getStringCellValue();
	  VariablesMapping.HowManyPenalty= sheet.getRow(row).getCell(21).getNumericCellValue();
	  VariablesMapping.Reason= sheet.getRow(row).getCell(22).getStringCellValue();
	  VariablesMapping.RecentInsurance= sheet.getRow(row).getCell(23).getStringCellValue();
	  VariablesMapping.NCD= sheet.getRow(row).getCell(24).getStringCellValue();
	  VariablesMapping.Discount= sheet.getRow(row).getCell(25).getStringCellValue();
	  VariablesMapping.Breakdown= sheet.getRow(row).getCell(26).getStringCellValue();
	  VariablesMapping.OpenDriving=sheet.getRow(row).getCell(27).getStringCellValue();
	  VariablesMapping.ProtectedNoClaim= sheet.getRow(row).getCell(28).getStringCellValue();
	  VariablesMapping.InsuranceExpiryQuestion=sheet.getRow(row).getCell(29).getStringCellValue();
	  VariablesMapping.IsPolicyRefused=sheet.getRow(row).getCell(30).getStringCellValue();
	  VariablesMapping.IsCarModified=sheet.getRow(row).getCell(31).getStringCellValue();
	  VariablesMapping.EstimatedCarValue=sheet.getRow(row).getCell(32).getStringCellValue();
	  VariablesMapping.CarValue=sheet.getRow(row).getCell(33).getStringCellValue();
	  VariablesMapping.DidYouPurchaseACar=sheet.getRow(row).getCell(34).getStringCellValue();
	  VariablesMapping.IsRegisterToYourSpouse=sheet.getRow(row).getCell(35).getStringCellValue();
	  VariablesMapping.MainDriver=sheet.getRow(row).getCell(36).getStringCellValue();
	  VariablesMapping.ClaimDeclined=sheet.getRow(row).getCell(37).getStringCellValue();
	  VariablesMapping.ProsecutionPending=sheet.getRow(row).getCell(38).getStringCellValue();
	  VariablesMapping.MedicalCondition=sheet.getRow(row).getCell(39).getStringCellValue();
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