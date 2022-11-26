package Mapping;

import org.openqa.selenium.By;

public class Page3Mapping {

	
	public static By QuotePriceStep3 = By.xpath("//div[@class='typo48']");
	public static By SectionBenefits = By.xpath("//h2[text()='Your benefits']");
	public static By AddBreakDownAssistance =By.xpath("//label[@for='OptionalCovers.Addon10243023']");
	public static By AddOpenDriving =By.xpath("//label[@for='OptionalCovers.Addon10243009']");
	public static By AddProtectedNoClaimsDiscount =By.xpath("//label[@for='OptionalCovers.Addon10243004']");
	public static By BreakDownAssitanceValue = By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/b[1]");
	public static By OpenDrivingValue =By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/b[1]");
	public static By ProtectedNoClaimDiscountValue=By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/b[1]");
	public static By ConfirmationButton = By.xpath("//button[text()='Next: Finalise Details']");
	public static By Overlay = By.xpath("//div[class='overlay']");
	
	
}
