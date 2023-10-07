package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.TextContent;

public class PageObject {
	public static LandingVegetablePage landingVegetablePage;
	public static OffersVegetablePage2 offersVegetablePage2;
	public static TextContent textContent;
	public static WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver=driver;
	}
	public PageObject(LandingVegetablePage landingVegetablePage) {
		this.landingVegetablePage=landingVegetablePage;
	}
	
	public PageObject(OffersVegetablePage2 offersVegetablePage2) {
		this.offersVegetablePage2=offersVegetablePage2;
	}
	public PageObject(TextContent textContent) {
		this.textContent=textContent;
	}
	
	
	

}
