package Mapping;

import org.openqa.selenium.By;

public class Page4Mapping {

	public static By YourCoverText = By.xpath("//h2[text()='Your cover']");
    public static By ExpiryPolicyYes = By.cssSelector("label[for='FinalDetails.ConfirmCurrentInsuranceExpiryDate1']");
	public static By ExpiryPolicyNo = By.cssSelector("label[for='FinalDetails.ConfirmCurrentInsuranceExpiryDate2']");
	public static By PolicyRefusedYes = By.id("LegalDeclarations.HasDeclaredInsuranceRefusedOrDeclined1");
	public static By PolicyRefusedNo = By.id("LegalDeclarations.HasDeclaredInsuranceRefusedOrDeclined2");
	public static By PolicyExpiryDatePlaceHolder = By.id("FinalDetails.CurrentInsuranceExpiryDate");
	public static By IscarModifiedYes = By.id("LegalDeclarations.HasDeclaredCarModified1");
	public static By IscarModifiedNo = By.id("LegalDeclarations.HasDeclaredCarModified1");
    public static By PopupButton  = By.xpath(("//label[@for='FinalDetails.CurrentInsuranceExpiryDate']//button[@type='button']"));
    public static By ValueEstimatedYes = By.id("VehicleDetails.VehicleValuationIsDefault1");
	public static By ValueEstimatedNo = By.id("VehicleDetails.VehicleValuationIsDefault2");
	public static By SelectValue = By.id("VehicleDetails.VehicleValueId");
	public static By PurchaseDateYes = By.id("VehicleDetails.VehiclePurchaseDateIsLastDateOfSale1");
	public static By PurchaseDateNo = By.id("VehicleDetails.VehiclePurchaseDateIsLastDateOfSale2");
	public static By PurchaseMonth = By.id("VehicleDetails.VehiclePurchaseDate.Month");
	public static By PurchaseYear = By.id("VehicleDetails.VehiclePurchaseDate.Year");
	public static By OwnedBySpouseYes = By.id("LegalDeclarations.HasDeclaredIsCarOwnedByYouOrSpouse1");
	public static By OwnedBySpouseNo = By.id("LegalDeclarations.HasDeclaredIsCarOwnedByYouOrSpouse2");
	public static By MainOwnerYes = By.id("LegalDeclarations.IsProposerMainDriver1");
	public static By MainOwnerNo = By.id("LegalDeclarations.IsProposerMainDriver2");
    public static By DriverLicenceFirstUseDay = By.id("FinalDetails.LicenceIssueDate.Day");
    public static By DriverLicenceFirstUseMonth = By.id("FinalDetails.LicenceIssueDate.Month");
    public static By DriverLicenceFirstUseYear = By.id("FinalDetails.LicenceIssueDate.Year");
	public static By ClaimDeclinedYes = By.id("LegalDeclarations.HasDeclaredMotorInsuranceClaimDeclined1");
	public static By ClaimDeclinedNo = By.id("LegalDeclarations.HasDeclaredMotorInsuranceClaimDeclined2");
	public static By ProsecutionPendingYes= By.id("LegalDeclarations.HasDeclaredConvictions1"); 
	public static By ProsecutionPendingNo= By.id("LegalDeclarations.HasDeclaredConvictions2");
	public static By MedicalDeclarationYes =By.id("LegalDeclarations.HasDeclaredMedicalCondition1");
	public static By MedicalDeclarationNo =By.id("LegalDeclarations.HasDeclaredMedicalCondition2");
}
