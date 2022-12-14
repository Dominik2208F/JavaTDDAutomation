package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Mapping.Page2Mapping;
import dev.failsafe.internal.util.Assert;

public class Page2 {

	
	WebDriver driver;	
	

	public Page2(WebDriver driverfromTest) {
	        driver=driverfromTest;
	}	

 public Page2 CheckifPage2isLoaded() {

	 Boolean OverlayDisappear = new WebDriverWait(driver, Duration.ofSeconds(20))
		        .until(ExpectedConditions.invisibilityOfElementLocated(Page2Mapping.Overlay));
	 
	 if(OverlayDisappear) {
	 
		String ExpectedTittle="Your quote";
		String TextfromSection= driver.findElement(Page2Mapping.QuoteTittle).getText();
		Assert.isTrue(ExpectedTittle.equals(TextfromSection),"You are not on 2th Page");
		System.out.println("You are on 2th Page");
	 }
		
	return this;	
	}
 public Page2 GetReferenceNumberAndQuote() {
	 
	 
	 WebElement x = new WebDriverWait(driver, Duration.ofSeconds(30))
		        .until(ExpectedConditions.visibilityOf(driver.findElement(Page2Mapping.ReferenceNumber)));
	 
	 String Reference = driver.findElement(Page2Mapping.ReferenceNumber).getText();
	 Page2Mapping.Quote = driver.findElement(Page2Mapping.QuoteValue).getText().toString();
	 System.out.println("Your Reference number is" + " " + Reference);
	 System.out.println( "Your Quote is" + " " + Page2Mapping.Quote);
	 return this;	 
 }
 public Page2 CalculateDetails() {
	 
	 String ComprehensiveInnsurancee= driver.findElement(Page2Mapping.ComprehensiveInsurance).getText().replace("€","");
	 String GovernmentLevy = driver.findElement(Page2Mapping.Governmentlevy).getText().replace("€","");
	 String StampDutyy = driver.findElement(Page2Mapping.StampDuty).getText().replace("€","");
	 Page2Mapping.Quote = driver.findElement(Page2Mapping.QuoteValue).getText().replace("€","");
	 System.out.println("Comprehensive Insurance is" + " " +ComprehensiveInnsurancee);
	 System.out.println("GovernmentLevy is" + " " +GovernmentLevy);
	 System.out.println("Stamp Duty is" + " " +StampDutyy);
	 double ConvertComprehensive= Double.parseDouble(ComprehensiveInnsurancee);
	 double ConvertGovernemntLevy= Double.parseDouble(GovernmentLevy);
	 double ConvertStampDuty= Double.parseDouble(StampDutyy);
	 double ConvertQuote= Double.parseDouble(Page2Mapping.Quote);
	 double resultofcalculation= ConvertComprehensive + ConvertGovernemntLevy +ConvertStampDuty;
	 double roundvalue = Math.round(resultofcalculation*100.0)/100.0;
	 boolean calculation = (roundvalue == ConvertQuote);
	 Assert.isTrue(calculation,"Calculation is incorrect");
	 if(roundvalue == ConvertQuote) {
	    System.out.println("Calculation on 2th page is  correct");
	 }
	 return this;
 }
 public Page2 ConfirmCalculationMoveToPage3() {
	
	driver.findElement(Page2Mapping.MoveToYourBenefirts).click();
	return this;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
