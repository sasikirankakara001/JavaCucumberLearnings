package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TextContent;

public class LandingVegetablePage {
	
	By searchBox = By.cssSelector("input[placeholder=\"Search for Vegetables and Fruits\"]");
	
	By sendKeyName = By.cssSelector("h4.product-name");
	public WebDriver driver;
	TextContent textContent;
	public LandingVegetablePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchOpertation(String name) {
		textContent.driver.findElement(searchBox).sendKeys(name);	
	}
	
}
