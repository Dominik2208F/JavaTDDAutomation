package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Pages.Page1;
import Pages.Page2;
import Pages.Page3;
import Pages.Page4;

public class MasterTest {

	 WebDriver driverMaster;
	 Page1 page1;
	 Page2 page2;
	 Page3 page3; 
	 Page4 page4;

	public MasterTest(WebDriver driver) throws IOException {
		this.driverMaster=driver;
		page1= new Page1(driverMaster);
		page2= new Page2(driverMaster);
		page3= new Page3(driverMaster);
		page4 = new Page4(driverMaster);
	}

	public MasterTest PageOneLouncher() throws Exception { 
		
		
		
	page1.CookiesHandler().
		  EnterRegistrationNumber(MasterData.Registration).
	      WillthisCarbeUsedforBusinessPurpouseorCommunity(MasterData.BusinessPurpouse,MasterData.CommunityPurpouse);

				if (page1.CheckifTextIsDisyplayed("What type of business use cover do you require?")) {
					page1.TypeOfBusinessCover(MasterData.TypeOfBusiness);
					}
	 page1.HowManyKilometersPerYear(MasterData.KM).
	       EnterYouPersonalData(MasterData.Male,MasterData.Name, MasterData.Surname).
	       EnterYouDataOfBirth(MasterData.Day, MasterData.Month,MasterData.Year).
	       EnterEmailandPhoneNumber(MasterData.email,MasterData.Phone).
	       EmploymentStatus(MasterData.Employment);
	 
		 		if(page1.CheckifTextIsDisyplayed("What is your occupation?")) {
		 		   page1.EnterOccupation(MasterData.Occupation);
		 		  }
		 		if(page1.CheckifTextIsDisyplayed("Please enter your address or Eircode")) {
		 		   page1.EnterAdress(MasterData.Adress);
		 		  }
	 
	page1.TypeOfHouseHold(MasterData.TypeofHouseHold).
		  CurrentLicenceType(MasterData.Licence);
	       
				 if(page1.CheckifTextIsDisyplayed("Have you completed the Essential Driver Training?")) {
					 page1.EssentialDrivingTrainin(MasterData.EssentialDriving);
				 }
	page1.HowLongLicence(MasterData.LicenceTime).
	       PenaltyPointQuestion("No");
	 
				 if(page1.CheckifTextIsDisyplayed(("How many penalty points do you have?"))){
					  page1.HowManyPenaltyPointandReason(MasterData.HowManyPenalty,MasterData.Reason);
				  }
				  if(page1.CheckifTextIsDisyplayed(("What was your most recent insurance?"))) {
					   page1.RecentInsuranceType(MasterData.RecentInsurance);
				  } 	
				 if(page1.CheckifTextIsDisyplayed("Number of years No Claims Discount earned in Ireland and/or the UK")){
					  page1.NumberOfNCD(MasterData.NCD);
				 }
	 page1.PolicyDiscount(MasterData.Discount).
	      DownSiteConfirmationandConfirmation();
	 return this;
  }	
	
    public MasterTest PageTwoLouncher() {
	
    	 page2.CheckifPage2isLoaded().
    	       GetReferenceNumberAndQuote().
	           CalculateDetails().
	           ConfirmCalculationMoveToPage3();
    	 
	
    	 return this;
}

    public MasterTest PageThreeLouncher() throws InterruptedException {
    	
    	page3.CheckifPage3isLoaded().
    		  AddBreakDownAssistance(MasterData.Breakdown).
    	      AddOpenDriving(MasterData.OpenDriving).
    	      AddProtectedNoClaim(MasterData.ProtectedNoClaim).
    	      MoveToPageFour();
    	
    	return this;
    }

    public MasterTest PageFourLouncher() throws Exception {
    	
    	page4.
    	CheckifPage4isloaded().
    	EnterInsuranceExpiryQuestion("No");
    	if (page1.CheckifTextIsDisyplayed("When does your existing policy expire?")) {
			page4.WhatDoesYourExistingPolicyExpire("20/11/2022");
			}
    	page4.isPolicyRefused("Yes").
    		  IsCarmodified("No")
    	      .EstimatedCarValue("No");
    	if(page1.CheckifTextIsDisyplayed("What is the value of the car?")) {
    		page4.EnterValueofCar("5,001 to 7,000");
    		}
    	page4.DidYouPurchaseTheCar("No");
    	if(page1.CheckifTextIsDisyplayed("When did you purchase the car?")) {
    		page4.PurchaseData("10", "2015");
    		}
    	page4.IscarRegisteredtoYouorSpouse("Yes").
    	      AreyouMaindriver("Yes").
    	      DrivingLicenceFirstUse("10","07", "2010").
    	      ClaimDeclined("No").ProsecutionPending("No").
    	      MedicalCondition("No");
    	;
    	
    	
    	
    	return this;
    }
    
	
}
