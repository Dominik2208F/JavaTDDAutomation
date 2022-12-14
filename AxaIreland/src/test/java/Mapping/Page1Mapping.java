package Mapping;

import org.openqa.selenium.By;

public class Page1Mapping {

	public static By CookiesHandler= By.cssSelector("button[id=\"_evidon-accept-button\"]");
	public static By RegistrationField=By.cssSelector("input[id='VehicleDetails.VehicleRegistrationNumber']");
	public static By FindRegistrationButton=By.cssSelector("div[class='field-inner-wrapper'] button[type='button']");
	public static By ConfirmCorrectButton= By.cssSelector("label[for='VehicleDetails.ConfirmCarSearchBtn1']");
	public static By BusinessPurpouseYes= By.cssSelector("label[for='VehicleDetails.IsVehicleForBusinessUse1']");
	public static By BusinessPurpouseNo= By.cssSelector("label[for='VehicleDetails.IsVehicleForBusinessUse2']");
	public static By CommunityworkYes = By.cssSelector("label[for='VehicleDetails.IsVehicleForCommutingUse1']");
	public static By CommunityworkYNO = By.cssSelector("label[for='VehicleDetails.IsVehicleForCommutingUse2']");
	public static By LimitedBusiness = By.cssSelector("label[for='VehicleDetails.VehicleClassOfUseTypeId1'] span[class='text']");
	public static By BusinessUse = By.cssSelector("label[for='VehicleDetails.VehicleClassOfUseTypeId2'] span[class='text']");
	public static By SolicitingOrders = By.cssSelector("label[for='VehicleDetails.VehicleClassOfUseTypeId3']");
	public static By ClasSUseChecker = By.cssSelector("label[for='VehicleDetails.VehicleClassOfUseTypeId']"); 
	public static By SelectAnnualKM = By.xpath("//select[@id='VehicleDetails.AnnualDistanceDrivenTypeId']");
	public static By TitleMr = By.cssSelector("label[for='ProposerDetails.TitleTypeId1'] span[class='text']");
	public static By TitleMrs = By.cssSelector("label[for='ProposerDetails.TitleTypeId2'] span[class='text']");
	public static By TitleMs = By.cssSelector("label[for='ProposerDetails.TitleTypeId3'] span[class='text']");
	public static By TitleDr = By.cssSelector("label[for='ProposerDetails.TitleTypeId4'] span[class='text']");
	public static By Name = By.xpath("//input[@id='ProposerDetails.FirstName']");
	public static By surname = By.xpath("//input[@id='ProposerDetails.LastName']");
	public static By DayOfBirth = By.xpath("//input[@id='ProposerDetails.DateOfBirth.Day']");
	public static By MonthOfBirth = By.xpath("//input[@id='ProposerDetails.DateOfBirth.Month']");
	public static By YearofBirth  = By.xpath("//input[@id='ProposerDetails.DateOfBirth.Year']");
	public static By EmailAdress  = By.xpath("//input[@id='ProposerDetails.EmailAddress']");
	public static By PhoneNumber  = By.xpath("//input[@name='phone-number']");
	public static By Employed  = By.cssSelector("label[for='ProposerDetails.EmploymentStatusTypeId1']");
	public static By SelfEmployed  = By.cssSelector("label[for='ProposerDetails.EmploymentStatusTypeId2'] span[class='text']");
	public static By Unemployed  = By.cssSelector("label[for='ProposerDetails.EmploymentStatusTypeId4']");
	public static By HouseWife  = By.cssSelector("label[for='ProposerDetails.EmploymentStatusTypeId5'] span[class='text']");
	public static By occupation = By.xpath("//input[@id='ProposerDetails.OccupationTypeDescription']");
	public static By Adress = By.xpath("//input[@id='ProposerDetails.AddressDisplayFormatted']");
	public static By RentedAccomodation= By.cssSelector("label[for='ProposerDetails.HouseHoldTypeId1']");
	public static By ApartmentOwnedByMe= By.cssSelector("label[for='ProposerDetails.HouseHoldTypeId2'] span[class='text']");
	public static By ApartmentOwnedByFamilyMember= By.cssSelector("label[for='ProposerDetails.HouseHoldTypeId2'] span[class='text']");
	public static By Other= By.cssSelector("label[for='ProposerDetails.HouseHoldTypeId2'] span[class='text']");
	public static By ROIFull = By.xpath("//label[@for='DrivingHistory.DrivingLicenceTypeId1']");
	public static By ROIProvisional= By.xpath("//label[@for='DrivingHistory.DrivingLicenceTypeId2']");
	public static By UKFull= By.xpath("//label[@for='DrivingHistory.DrivingLicenceTypeId3']");
	public static By EUFull= By.xpath("//label[@for='DrivingHistory.DrivingLicenceTypeId4']");
	public static By Other1= By.xpath("//label[@for='DrivingHistory.DrivingLicenceTypeId5']");
	public static By SelectYearofLicence= By.id("DrivingHistory.YearsLicenceHeldTypeId");
	public static By PenaltyYes = By.xpath("//label[@for='DrivingHistory.PenaltyPointsDetails.HasPenaltyPoints1']");
	public static By PenaltyNo = By.xpath("//label[@for='DrivingHistory.PenaltyPointsDetails.HasPenaltyPoints2']");
	public static By TrainingYes =By.xpath("//label[@for='DrivingHistory.AdvancedDriverTrainingTypeId1']");
	public static By TrainingNo= By.xpath("//label[@for='DrivingHistory.AdvancedDriverTrainingTypeId2']");
	public static By InsuranceInOwnName= By.xpath("//label[@for='DrivingHistory.DrivingExperienceTypeId1']");
	public static By NoPreviousInsurance = By.xpath("//label[@for='DrivingHistory.DrivingExperienceTypeId2']");
	public static By InsuradeAsNamedDriver = By.xpath("//label[@for='DrivingHistory.DrivingExperienceTypeId3']");
	public static By InsuranceasCompanyCar = By.xpath("//label[@for='DrivingHistory.DrivingExperienceTypeId4']");
	public static By InsuranceNCD = By.id("DrivingHistory.NoClaimsDiscountYearsInOwnNameTypeId");
	public static By DiscountYes =By.cssSelector("label[for='CoverDetails.HasMultiProductDiscount1']");
	public static By DiscountNo =By.cssSelector("label[for='CoverDetails.HasMultiProductDiscount2']");
	public static By Assumption =By.id("ConfirmAssumptions");
	public static By GetQuoteButton =By.id("getquote-btn");	
	
	
	
}
