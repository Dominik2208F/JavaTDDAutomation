package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Mapping.Page3Mapping;
import Test.MasterData;
import dev.failsafe.internal.util.Assert;

public class Page3 {

	WebDriver driver;
	MasterData data;
	

public Page3(WebDriver driverfromTest) throws IOException {
	        driver=driverfromTest;
	        data= new MasterData();
	}
	

public Page3 CheckifPage3isLoaded() {

	
	String ExpectedTittle="Your benefits";
	String TextfromSection= driver.findElement(Page3Mapping.SectionBenefits).getText();
	Assert.isTrue(ExpectedTittle.equals(TextfromSection),"You are not on 3th Page");
	System.out.println("You are on 3th Page");
	
	
return this;	
}
public Page3 AddBreakDownAssistance(String add) throws InterruptedException {
	
	if(add.equals("Yes")) {
	
		data.IsElementVisible(driver, Page3Mapping.QuotePriceStep3);
		
		String QuoteValuefrom3Page= driver.findElement(Page3Mapping.QuotePriceStep3).getText().replace("€", "");
		double ConvertQuoteValue= Double.parseDouble(QuoteValuefrom3Page);
		String BreakdownAssistance = driver.findElement(Page3Mapping.BreakDownAssitanceValue).getText().substring(2, 7);
		double ConvertBreakDownAsssitance= Double.parseDouble(BreakdownAssistance);
		
		MasterData.ScrollToElement(Page3Mapping.AddBreakDownAssistance);
		data.JavaExecutor(driver,Page3Mapping.AddBreakDownAssistance);
	    Thread.sleep(4000);  // time to reload a page to take a new Quote
	
	
	double result = ConvertQuoteValue + ConvertBreakDownAsssitance;
	double RoundResult=Math.round(result*100.0)/100.0;
	
	data.IsElementVisible(driver, Page3Mapping.QuotePriceStep3);
	
	String QuoteValuefrom3PageAfterUpdate= driver.findElement(Page3Mapping.QuotePriceStep3).getText().replace("€", "");
	double UpdatedValueofQuote= Double.parseDouble(QuoteValuefrom3PageAfterUpdate);
	boolean Calculation = (UpdatedValueofQuote==RoundResult);		
	if(Calculation) {
		System.out.println("Value after BreakdownAssistanse is correct " +  "" + UpdatedValueofQuote);
		}
	}
	
	
	return this;
}
public Page3 AddOpenDriving(String add) throws InterruptedException {

    
	if(add.equals("Yes")) {
		
		data.IsElementVisible(driver, Page3Mapping.QuotePriceStep3);
		
		String QuoteValuefrom3Page= driver.findElement(Page3Mapping.QuotePriceStep3).getText().replace("€", "");
		double ConvertQuoteValue= Double.parseDouble(QuoteValuefrom3Page);
		String AddOpenDrivingValue = driver.findElement(Page3Mapping.OpenDrivingValue).getText().substring(2, 7);
		double ConvertAddOpenDrivingValue= Double.parseDouble(AddOpenDrivingValue);
		
		MasterData.ScrollToElement(Page3Mapping.AddOpenDriving);
		data.JavaExecutor(driver,Page3Mapping.AddOpenDriving);
		Thread.sleep(4000);  // time to reload a page to take a new Quote
	
	
	double result = ConvertQuoteValue + ConvertAddOpenDrivingValue;
	double RoundResult=Math.round(result*100.0)/100.0;
	
	    data.IsElementVisible(driver,Page3Mapping.QuotePriceStep3);
	
	String QuoteValuefrom3PageAfterUpdate= driver.findElement(Page3Mapping.QuotePriceStep3).getText().replace("€", "");
	
	
	double UpdatedValueofQuote= Double.parseDouble(QuoteValuefrom3PageAfterUpdate);
	if(Double.compare(UpdatedValueofQuote,RoundResult)==0) {
		System.out.println("Value after OpenDriving is correct " +  "" + UpdatedValueofQuote);
		}
	}
return this;	
}
public Page3 AddProtectedNoClaim(String add) throws InterruptedException {
	
if(add.equals("Yes")) {
		
			data.IsElementVisible(driver,Page3Mapping.QuotePriceStep3);
			
			String QuoteValuefrom3Page= driver.findElement(Page3Mapping.QuotePriceStep3).getText().replace("€", "");
			double ConvertQuoteValue= Double.parseDouble(QuoteValuefrom3Page);
			String AddProtectedNoClaim = driver.findElement(Page3Mapping.ProtectedNoClaimDiscountValue).getText().substring(2, 7);
			double ConvertProtectedNoClaim= Double.parseDouble(AddProtectedNoClaim);
			
			MasterData.ScrollToElement(Page3Mapping.AddProtectedNoClaimsDiscount);
			data.JavaExecutor(driver,Page3Mapping.AddProtectedNoClaimsDiscount);
		    Thread.sleep(4000);
		 Boolean OverlayDisappear = new WebDriverWait(driver, Duration.ofSeconds(20))
			        .until(ExpectedConditions.invisibilityOfElementLocated(Page3Mapping.Overlay));
		if(OverlayDisappear) {
		double result = ConvertQuoteValue + ConvertProtectedNoClaim;
		double RoundResult=Math.round(result*100.0)/100.0;
		
		data.IsElementVisible(driver,Page3Mapping.QuotePriceStep3);
		
		String QuoteValuefrom3PageAfterUpdate= driver.findElement(Page3Mapping.QuotePriceStep3).getText().replace("€", "");
		
		double UpdatedValueofQuote= Double.parseDouble(QuoteValuefrom3PageAfterUpdate);
		boolean Calculation = (UpdatedValueofQuote==RoundResult);		
		if(Calculation) {
			System.out.println("Value after ProtectedNoClaim is correct " +  "" + UpdatedValueofQuote);
			}
		}
		}
	
	
	return this;
}
public Page3 MoveToPageFour() {
	
	driver.findElement(Page3Mapping.ConfirmationButton).click();
	return this;
}
}