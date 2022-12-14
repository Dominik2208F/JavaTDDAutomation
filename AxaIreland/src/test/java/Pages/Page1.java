package Pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Mapping.Page1Mapping;
import Test.MasterData;
import Test.MasterTest;
import io.netty.handler.timeout.TimeoutException;

public class Page1 {

	
static WebDriver driver;	
	

public Page1(WebDriver driverfromTest) {
        driver=driverfromTest;
}


public Page1 CookiesHandler() {
	
	 driver.findElement(Page1Mapping.CookiesHandler).click();
	return this;
}
public Page1 EnterRegistrationNumber(String Registration) throws Exception {
	
	MasterData.SetTextBox(Page1Mapping.RegistrationField, Registration);
	MasterData.ScrollToAndClick(Page1Mapping.FindRegistrationButton);
	MasterData.ScrollToAndClick(Page1Mapping.ConfirmCorrectButton);
	return this;
		
}
public Page1 WillthisCarbeUsedforBusinessPurpouseorCommunity(String answer1,String answer2) throws Exception {
	
	if(answer1=="Yes") {
		MasterData.ScrollToAndClick(Page1Mapping.BusinessPurpouseYes);
	}
	else {
		MasterData.ScrollToAndClick(Page1Mapping.BusinessPurpouseNo);
			if(answer2=="Yes") {
				MasterData.ScrollToAndClick(Page1Mapping.CommunityworkYes);
				}
			else {
				MasterData.ScrollToAndClick(Page1Mapping.CommunityworkYNO);
			}
}
	return this;
}
public Page1 TypeOfBusinessCover(String business) {
	
	String Business=business.toString();
	
	switch(Business) {
	  case "Limited Business Use":
		  driver.findElement(Page1Mapping.LimitedBusiness).click();
	    break;
	  case "Business Use":
		  driver.findElement(Page1Mapping.BusinessUse).click();
	    break;
	  case "Soliciting Orders":
		  driver.findElement(Page1Mapping.SolicitingOrders).click();
		 break;
	}
	return this;
}
public boolean CheckifTextIsDisyplayed(String text) {
	if(driver.getPageSource().contains(text)==true) {
		return true;			
	}
	else {
		return false;
	}
}
public Page1 HowManyKilometersPerYear(String amount) {
	
	 WebElement selectElement = driver.findElement(Page1Mapping.SelectAnnualKM);
     Select AnnualKM = new Select(selectElement);
     switch(amount) {
	  case "Up to 5,000 km":
		  AnnualKM.selectByIndex(1);
	    break;
	  case "Up to 8,000 km":
		  AnnualKM.selectByIndex(2);
	    break;
	  case "Up to 10,000 km":
	     AnnualKM.selectByIndex(3);
		 break;
     }
     return this;
}
public Page1 EnterYouPersonalData(String Title, String name,String Surname) throws Exception {
	
	switch(Title) {
	  case "Mr":
		  MasterData.ScrollToAndClick(Page1Mapping.TitleMr);
	    break;
	  case "Mrs":
		  MasterData.ScrollToAndClick(Page1Mapping.TitleMrs);
	    break;
	  case "Ms":
		  MasterData.ScrollToAndClick(Page1Mapping.TitleMs);
		 break;
	  case "Dr":
		  MasterData.ScrollToAndClick(Page1Mapping.TitleDr);
		 break;
   }
	
	MasterData.SetTextBox(Page1Mapping.Name, name);
	MasterData.SetTextBox(Page1Mapping.surname, Surname);
	//driver.findElement(Name).sendKeys(name);
	//driver.findElement(surname).sendKeys(Surname);
	return this;
}
public Page1 EnterYouDataOfBirth(double day,double month, double Year) {
	
	double DayConvert= day;
	double MonthConvert=month;
	double YearConvert= Year;
	
	String x = Double.toString(DayConvert);
	String y = Double.toString(MonthConvert);
	String z = Double.toString(YearConvert);
	
	
	MasterData.SetTextBox(Page1Mapping.DayOfBirth, x.substring(0,2));
	MasterData.SetTextBox(Page1Mapping.MonthOfBirth, y.substring(0,2));
	MasterData.SetTextBox(Page1Mapping.YearofBirth, z);
	//driver.findElement(DayOfBirth).sendKeys(x.substring(0,2));
	//driver.findElement(MonthOfBirth).sendKeys(y.substring(0,2));
	//driver.findElement(YearofBirth).sendKeys(z);
	return this;
}
public Page1 EnterEmailandPhoneNumber(String Email,Double phone) {	
	double PhoneConvert= phone;
	String x = Double.toString(phone);
	
	MasterData.SetTextBox(Page1Mapping.EmailAdress, Email);
	MasterData.SetTextBox(Page1Mapping.PhoneNumber, x);
	//driver.findElement(EmailAdress).sendKeys(Email);
	//driver.findElement(PhoneNumber).sendKeys(x);
	return this;
}
public Page1 EmploymentStatus(String employment) throws Exception {
	switch(employment) {
	  case "Employed":
		  MasterData.ScrollToAndClick(Page1Mapping.Employed);
	    break;
	  case "Self Employed":
		  MasterData.ScrollToAndClick(Page1Mapping.SelfEmployed);
	    break;
	  case "Unemployed":
		  MasterData.ScrollToAndClick(Page1Mapping.Unemployed);
		 break;
	  case "Housewife":
		  MasterData.ScrollToAndClick(Page1Mapping.HouseWife);
			 break;
   }
	return this;
	
}
public Page1 EnterOccupation(String occupation1) throws Exception {
	
	MasterData.SetTextBox(Page1Mapping.occupation, occupation1);
	// driver.findElement(occupation).sendKeys(occupation1);
	 
	 By confirmChoose = By.xpath("//li[@id='react-autowhatever-1--item-0']");
	 Thread.sleep(2000);
	// WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        //.until(ExpectedConditions.visibilityOfElementLocated(confirmChoose));
	 
	  MasterData.ScrollToAndClick(confirmChoose);
	 return this;
}
public Page1 EnterAdress(String adress) throws Exception {
	
	MasterData.SetTextBox(Page1Mapping.Adress, adress);
	//driver.findElement(Adress).sendKeys(adress);
	Thread.sleep(2000);
	By confirmChoose = By.cssSelector("div[role='combobox'] span:nth-child(1)");
	  MasterData.ScrollToAndClick(confirmChoose);
	return this;
}
public Page1 TypeOfHouseHold(String type) {
	
	switch(type) {
	  case "RemtedAccomodation":
		  driver.findElement(Page1Mapping.RentedAccomodation).click();
	    break;
	  case "ApartmentOwnedByMe":
		 driver.findElement(Page1Mapping.ApartmentOwnedByMe).click();
	    break;
	  case "ApartmentOwnedByFamilyMember":
		  driver.findElement(Page1Mapping.ApartmentOwnedByFamilyMember).click();
		 break;
	  case "Other":
		  driver.findElement(Page1Mapping.Other).click();
			 break;

	}
	return this;
	}
public Page1 CurrentLicenceType(String type) throws Exception {
	
	switch(type) {
	  case "ROI(Full)":
		  MasterData.ScrollToAndClick(Page1Mapping.ROIFull);
	    break;
	  case "ROI(Provisional)":
		  MasterData.ScrollToAndClick(Page1Mapping.ROIProvisional);
	    break;
	  case "UK(Full)":
		  MasterData.ScrollToAndClick(Page1Mapping.UKFull);
		 break;
	  case "EU(Full)":
		  MasterData.ScrollToAndClick(Page1Mapping.EUFull);
			 break;
	  case "Other1":
		  MasterData.ScrollToAndClick(Page1Mapping.Other1);
			 break;
	}
	return this;
}
public Page1 EssentialDrivingTrainin(String training) {
	
	if(training=="Yes"){
		driver.findElement(Page1Mapping.TrainingYes).click();
	}
	else if(training=="No") {
		driver.findElement(Page1Mapping.TrainingNo).click();
	}
	return this;
}
public Page1 HowLongLicence(String timeoflicence) {
	
	 WebElement selectElement = driver.findElement(Page1Mapping.SelectYearofLicence);
     Select Year = new Select(selectElement);
	
	
	switch(timeoflicence) {
	  case "1 year":
		 Year.selectByVisibleText("1 year");
	    break;
	  case "2 years":
		  Year.selectByVisibleText("2 years");
	    break;
	  case "3 years":
		  Year.selectByVisibleText("3 years");
		 break;
	  

	}
	return this;
	}
public Page1 PenaltyPointQuestion(String penalty) throws Exception {
	
	if(penalty.trim()=="Yes"){
		  MasterData.ScrollToAndClick(Page1Mapping.PenaltyYes);
	
	}
	else if(penalty.trim()=="No") {
		 MasterData.ScrollToAndClick(Page1Mapping.PenaltyNo);
	}
	return this;
}
public Page1 HowManyPenaltyPointandReason(double amountofpoints ,String Reason) throws InterruptedException {
	
	 By points1= By.cssSelector("label[for='DrivingHistory.PenaltyPointsDetails.NumberOfPenaltyPointsTypeId1']");
	 By points2= By.cssSelector("label[for='DrivingHistory.PenaltyPointsDetails.NumberOfPenaltyPointsTypeId2']");
	 By points3= By.cssSelector("label[for='DrivingHistory.PenaltyPointsDetails.NumberOfPenaltyPointsTypeId3']");
	 
	 By listedYes = By.cssSelector("label[for='DrivingHistory.PenaltyPointsDetails.PenaltyPointsReason1']");
	 By listedNo= By.cssSelector("label[for='DrivingHistory.PenaltyPointsDetails.PenaltyPointsReason2']");
	

	if(Reason.equals("Yes")) {
		driver.findElement(listedYes).click();
	}
	else if(Reason.equals("No")) {
		driver.findElement(listedNo).click();
	}

	 if(amountofpoints==1.0) {
			Thread.sleep(2000);
			driver.findElement(points1).click();
		}
		
		else if(amountofpoints==2.0) {
			Thread.sleep(2000);
			driver.findElement(points2).click();
		}
		
		else if(amountofpoints==3.0) {
			Thread.sleep(2000);
			driver.findElement(points3).click();
		}
	
		return this;
}
public Page1 RecentInsuranceType(String typeofinsurance) throws Exception {
switch(typeofinsurance) {
	  case "Insured in own Name":
		  MasterData.ScrollToAndClick(Page1Mapping.InsuranceInOwnName);
	    break;
	  case "No previous insurance":
		  MasterData.ScrollToAndClick(Page1Mapping.NoPreviousInsurance);
	    break;
	  case "Insured as named driver":
		  MasterData.ScrollToAndClick(Page1Mapping.InsuradeAsNamedDriver);
		 break;
	  case "Insured on a company car":
		  MasterData.ScrollToAndClick(Page1Mapping.InsuranceasCompanyCar);
		 break;
	}
	
	return this;
	
}
public Page1 NumberOfNCD(String years) {
	WebElement selectElement = driver.findElement(Page1Mapping.InsuranceNCD);
     Select NCD = new Select(selectElement);
	
	
	switch(years) {
	  case "0 Years Claims Free Driving":
		 NCD.selectByVisibleText("0 Years Claims Free Driving");
	    break;
	  case "1 Years Claims Free Driving":
		  NCD.selectByVisibleText("1 Years Claims Free Driving");
	    break;
	  case "2 Years Claims Free Driving":
		  NCD.selectByVisibleText("2 Years Claims Free Driving");
		 break;
	  case "3 Years Claims Free Driving":
		  NCD.selectByVisibleText("3 Years Claims Free Driving");
		 break;
	  case "4 Years Claims Free Driving":
		  NCD.selectByVisibleText("4 Years Claims Free Driving");
		 break;
	  case "5 Years Claims Free Driving":
		  NCD.selectByVisibleText("5 Years Claims Free Driving");
		 break;
	 
	}
	return this;
	
}
public Page1 PolicyDiscount(String answer) throws Exception {
	
	
	if(answer.equals("Yes")) {
		 MasterData.ScrollToAndClick(Page1Mapping.DiscountYes);
	}
	else if(answer.equals("No")) {
		 MasterData.ScrollToAndClick(Page1Mapping.DiscountNo);
	}
	return this;
}
public Page1 DownSiteConfirmationandConfirmation() {
JavascriptExecutor js = (JavascriptExecutor) driver;  
js.executeScript("arguments[0].click();", driver.findElement(Page1Mapping.Assumption));
driver.findElement(Page1Mapping.GetQuoteButton).click();

return this;
}

}







