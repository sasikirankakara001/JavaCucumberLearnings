package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.TextContent;

public class PageObject {
	
	public LandingVegetablePage landingVegetablePage;
	public OffersVegetablePage2 offersVegetablePage2;
	public WebDriver driver;
	public TextContent textContent;
	public PageObject(WebDriver driver) {
		this.driver=driver;
	}
	public PageObject(TextContent textContent) {
		this.textContent=textContent;
	}
	public LandingVegetablePage landingVegPage() {
		landingVegetablePage=new LandingVegetablePage(driver);
		return landingVegetablePage;
	}
	public OffersVegetablePage2 offersVegetablePage22() {
		offersVegetablePage2 = new OffersVegetablePage2(driver);
		return offersVegetablePage2;
	}

}
