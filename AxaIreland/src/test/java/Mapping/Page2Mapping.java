package Mapping;

import org.openqa.selenium.By;

public class Page2Mapping {

	
	 public static By QuoteTittle = By.xpath("//h2[@class='title']");
	 public static By ReferenceNumber = By.id("CarQuotePremium.QuoteReferenceIdForDisplay");
	 public static By QuoteValue =By.xpath("//div[@class='typo78']");
	 public static By ComprehensiveInsurance= By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/span[1]/div[1]/span[1]");
	 public static By Governmentlevy =By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/span[3]/div[1]/span[1]");
	 public static By StampDuty = By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/span[5]/div[1]/span[1]");
	 public static By MoveToYourBenefirts =By.xpath("//button[text()='Next: Your Benefits']");
	 public static By Overlay = By.xpath("//div[class='overlay']");
	 public static String Quote;
	
	
}
