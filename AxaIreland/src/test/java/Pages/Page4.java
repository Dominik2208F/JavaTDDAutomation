package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Mapping.Page4Mapping;
import Test.MasterData;
import dev.failsafe.internal.util.Assert;

public class Page4 {

WebDriver driver;
MasterData data;
	

	public Page4(WebDriver driverfromTest) throws IOException {
	        driver=driverfromTest;
	        data= new MasterData();
	}
	    
	public Page4 CheckifPage4isloaded() {

		
		String ExpectedTittle="Your cover";
		String TextfromSection= driver.findElement(Page4Mapping.YourCoverText).getText();
		Assert.isTrue(ExpectedTittle.equals(TextfromSection),"You are not on 4th Page");
		System.out.println("You are on 4th Page");
		
		
	return this;	
	}
	public Page4 EnterInsuranceExpiryQuestion(String answer) throws InterruptedException {
		
		data.IsElementClicable(driver, Page4Mapping.ExpiryPolicyYes);
		data.IsElementClicable(driver, Page4Mapping.ExpiryPolicyNo);
		
		//WebElement x = new WebDriverWait(driver, Duration.ofSeconds(10))
		//.until(ExpectedConditions.elementToBeClickable(driver.findElement(ExpiryPolicyNo)));
		
		if(answer.equals("Yes"))
		
		{   
		  data.JavaExecutor(driver, Page4Mapping.ExpiryPolicyYes);
			
			
		}
		else if(answer.equals("No")) {
		  data.JavaExecutor(driver, Page4Mapping.ExpiryPolicyNo);
			
			
		}
		
		return this;
		
	}
    public Page4 WhatDoesYourExistingPolicyExpire(String date) throws Exception {
	MasterData.SetTextBox(Page4Mapping.PolicyExpiryDatePlaceHolder, date);
	//driver.findElement(PolicyExpiryDatePlaceHolder).sendKeys(date);
	MasterData.ScrollToAndClick(Page4Mapping.PopupButton);
	MasterData.ScrollToAndClick(Page4Mapping.PopupButton);
    	return this;
    	
}
    public Page4 isPolicyRefused(String answer) {
    	
    	if(answer.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.PolicyRefusedYes);
    	}
    	else if(answer.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.PolicyRefusedNo);
    	}
    	
    	
    return this;
    }
    public Page4 IsCarmodified(String answer) {
    	
    	if(answer.equals("Yes"))
    		
		{   
		  data.JavaExecutor(driver, Page4Mapping.IscarModifiedYes);
			
			
		}
		else if(answer.equals("No")) {
		  data.JavaExecutor(driver, Page4Mapping.IscarModifiedNo);
    	
		}
    	return this;    
		}
    public Page4 EstimatedCarValue(String answer) {
    	
    	if(answer.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.ValueEstimatedYes);
    	}
    	else if(answer.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.ValueEstimatedNo);
    	}
    	return this;
    	
    }
    public Page4 EnterValueofCar(String value) {
    	
    	 WebElement selectElement = driver.findElement(Page4Mapping.SelectValue);
         Select SelectValue = new Select(selectElement);
         switch(value) {
    	  case "0 to 3000":
    		  SelectValue.selectByIndex(1);
    	    break;
    	  case "3,001 to 5,000":
    		  SelectValue.selectByIndex(2);
    	    break;
    	  case "5,001 to 7,000":
    		  SelectValue.selectByIndex(3);
    		 break;
         }
         return this;
    }
    public Page4 DidYouPurchaseTheCar(String value) {
    	if(value.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.PurchaseDateYes);
    	}
    	else if(value.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.PurchaseDateNo);
    	}
    	return this;
    }
    public Page4 PurchaseData(String month,String Year) {
    	
    	MasterData.SetTextBox(Page4Mapping.PurchaseMonth, month);
    	MasterData.SetTextBox(Page4Mapping.PurchaseYear, Year);
    	return this;
    	
    }
    public Page4 IscarRegisteredtoYouorSpouse(String answer) {
    	if(answer.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.OwnedBySpouseYes);
    	}
    	else if(answer.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.OwnedBySpouseNo);
    	}
    	return this;
    	
    }
    public Page4 AreyouMaindriver(String answer) {
    	if(answer.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.MainOwnerYes);
    	}
    	else if(answer.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.MainOwnerNo);
    	}
    	return this;
    }
    public Page4 DrivingLicenceFirstUse(String day,String month,String Year) {
    	
    	MasterData.SetTextBox(Page4Mapping.DriverLicenceFirstUseDay, day);
    	MasterData.SetTextBox(Page4Mapping.DriverLicenceFirstUseMonth, month);
    	MasterData.SetTextBox(Page4Mapping.DriverLicenceFirstUseYear, Year);
    	return this;
    	
    }
    public Page4 ClaimDeclined(String answer) {
    	if(answer.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.ClaimDeclinedYes);
    	}
    	else if(answer.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.ClaimDeclinedNo);
    	}
    	return this;
    }
    public Page4 ProsecutionPending(String answer) {
    	if(answer.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.ProsecutionPendingYes);
    	}
    	else if(answer.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.ProsecutionPendingNo);
    	}
    	return this;
    }
    public Page4 MedicalCondition(String answer) {
    	if(answer.equals("Yes")) {
    		data.JavaExecutor(driver, Page4Mapping.MedicalDeclarationYes);
    	}
    	else if(answer.equals("No")) {
    		data.JavaExecutor(driver, Page4Mapping.MedicalDeclarationNo);
    	}
    	return this;
    }
 }


