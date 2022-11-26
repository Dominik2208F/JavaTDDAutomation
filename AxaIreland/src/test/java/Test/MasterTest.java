package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Mapping.VariablesMapping;
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
		  EnterRegistrationNumber(VariablesMapping.Registration).
	      WillthisCarbeUsedforBusinessPurpouseorCommunity(VariablesMapping.BusinessPurpouse,VariablesMapping.CommunityPurpouse);

				if (page1.CheckifTextIsDisyplayed("What type of business use cover do you require?")) {
					page1.TypeOfBusinessCover(VariablesMapping.TypeOfBusiness);
					}
	 page1.HowManyKilometersPerYear(VariablesMapping.KM).
	       EnterYouPersonalData(VariablesMapping.Male,VariablesMapping.Name, VariablesMapping.Surname).
	       EnterYouDataOfBirth(VariablesMapping.Day, VariablesMapping.Month,VariablesMapping.Year).
	       EnterEmailandPhoneNumber(VariablesMapping.email,VariablesMapping.Phone).
	       EmploymentStatus(VariablesMapping.Employment);
	 
		 		if(page1.CheckifTextIsDisyplayed("What is your occupation?")) {
		 		   page1.EnterOccupation(VariablesMapping.Occupation);
		 		  }
		 		if(page1.CheckifTextIsDisyplayed("Please enter your address or Eircode")) {
		 		   page1.EnterAdress(VariablesMapping.Adress);
		 		  }
	 
	page1.TypeOfHouseHold(VariablesMapping.TypeofHouseHold).
		  CurrentLicenceType(VariablesMapping.Licence);
	       
				 if(page1.CheckifTextIsDisyplayed("Have you completed the Essential Driver Training?")) {
					 page1.EssentialDrivingTrainin(VariablesMapping.EssentialDriving);
				 }
	page1.HowLongLicence(VariablesMapping.LicenceTime).
	       PenaltyPointQuestion("No");
	 
				 if(page1.CheckifTextIsDisyplayed(("How many penalty points do you have?"))){
					  page1.HowManyPenaltyPointandReason(VariablesMapping.HowManyPenalty,VariablesMapping.Reason);
				  }
				  if(page1.CheckifTextIsDisyplayed(("What was your most recent insurance?"))) {
					   page1.RecentInsuranceType(VariablesMapping.RecentInsurance);
				  } 	
				 if(page1.CheckifTextIsDisyplayed("Number of years No Claims Discount earned in Ireland and/or the UK")){
					  page1.NumberOfNCD(VariablesMapping.NCD);
				 }
	 page1.PolicyDiscount(VariablesMapping.Discount).
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
    		  AddBreakDownAssistance(VariablesMapping.Breakdown).
    	      AddOpenDriving(VariablesMapping.OpenDriving).
    	      AddProtectedNoClaim(VariablesMapping.ProtectedNoClaim).
    	      MoveToPageFour();
    	
    	return this;
    }

    public MasterTest PageFourLouncher() throws Exception {
    	
    	page4.
    	CheckifPage4isloaded().
    	EnterInsuranceExpiryQuestion(VariablesMapping.InsuranceExpiryQuestion);
    	if (page1.CheckifTextIsDisyplayed("When does your existing policy expire?")) {
			page4.WhatDoesYourExistingPolicyExpire("20/11/2022");
			}
    	page4.isPolicyRefused(VariablesMapping.IsPolicyRefused).
    		  IsCarmodified(VariablesMapping.IsCarModified)
    	      .EstimatedCarValue(VariablesMapping.EstimatedCarValue);
    	if(page1.CheckifTextIsDisyplayed("What is the value of the car?")) {
    		page4.EnterValueofCar(VariablesMapping.CarValue);
    		}
    	page4.DidYouPurchaseTheCar(VariablesMapping.DidYouPurchaseACar);
    	if(page1.CheckifTextIsDisyplayed("When did you purchase the car?")) {
    		page4.PurchaseData("10", "2015");
    		}
    	page4.IscarRegisteredtoYouorSpouse(VariablesMapping.IsRegisterToYourSpouse).
    	      AreyouMaindriver(VariablesMapping.MainDriver).
    	      DrivingLicenceFirstUse("10","07", "2010").
    	      ClaimDeclined(VariablesMapping.ClaimDeclined).
    	      ProsecutionPending(VariablesMapping.ProsecutionPending).
    	      MedicalCondition(VariablesMapping.MedicalCondition);
    	;
    	
    	
    	
    	return this;
    }
    
	
}
