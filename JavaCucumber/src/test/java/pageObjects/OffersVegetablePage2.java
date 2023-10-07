package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TextContent;

public class OffersVegetablePage2 {
	By topDeals = By.xpath("//a[normalize-space()=\"Top Deals\"]");
	By vegNames = By.xpath("//h4[normalize-space()=\"Tomato - 1 Kg\"]");
	By searchField = By.cssSelector("#search-field");
	By searchVegName = By.xpath("//td[normalize-space()=\"Tomato\"]");
	
	public WebDriver driver;
	TextContent textContent;
	public OffersVegetablePage2 offersVegetablePage2;

	public OffersVegetablePage2(WebDriver driver) {
		this.driver = driver;
	}

	public OffersVegetablePage2(OffersVegetablePage2 offersVegetablePage2) {
		this.offersVegetablePage2 = offersVegetablePage2;
	}

	public void searchOpertation() {
		textContent.driver.findElement(topDeals).click();
	}

//	String vegName = textContent.driver.findElement(By.xpath("//h4[normalize-space()=\"Tomato - 1 Kg\"]")).getText()
//			.split("-")[0].trim();

	public void getVegName() {
		String vegName = textContent.driver.findElement(vegNames).getText().split("-")[0].trim();
	}
	
//	textContent.driver.findElement(By.cssSelector("#search-field")).sendKeys(string);
	
	public void searchField(String name) {
		textContent.driver.findElement(searchField).sendKeys(name);
	}
//	String testVegName	=textContent.driver.findElement(By.xpath("//td[normalize-space()=\"Tomato\"]")).getText().split(" ")[0].trim();
	public void testVegsName() {
		
		String testVegName	=textContent.driver.findElement(searchVegName).getText().split(" ")[0].trim();
	}

	
}
