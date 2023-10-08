package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingVegetablePage;
import pageObjects.PageObject;
import utils.TextContent;

public class LandingVegatablePage {
	
	
	
	TextContent textContent;
	PageObject pageObject = new PageObject(TextContent.driver);
	public static LandingVegetablePage landingVegetablePage = new LandingVegetablePage(TextContent.driver);
	public LandingVegatablePage(TextContent textContent) {
		this.textContent = textContent;
	}

	@Given("User lands in the HomePage")
	public void user_lands_in_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		textContent.webDriverManager.chromedriver().setup();
		textContent.driver = new ChromeDriver();
	textContent.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("User enters word {string} in search and grab the Name")
	public void user_enters_word_in_search_and_grab_the_name(String string) {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		textContent.driver.findElement(By.cssSelector("input[placeholder=\"Search for Vegetables and Fruits\"]")).sendKeys(string);
		
//		landingVegetablePage.searchContent(string);
//		landingVegetablePage.searchOpertation(string);
		landingVegetablePage.searchOpertation(string);
		
		
		
	}

//	@Then("User verifies and search for {string} word present in deals page or not")
//	public void user_verifies_and_search_for_word_present_in_deals_page_or_not(String string) {
//		// Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		String vegName = driver.findElement(By.xpath("//h4[normalize-space()=\"Tomato - 1 Kg\"]")).getText()
//				.split("-")[0].trim();
//		System.out.println(vegName);
//		driver.findElement(By.xpath("//a[normalize-space()=\"Top Deals\"]")).click();
//		Set<String>	handles=driver.getWindowHandles();
//		Iterator<String>it = handles.iterator();
//		String parentId = it.next();
//		String childId = it.next();
//		driver.switchTo().window(childId);
//		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.cssSelector("#search-field")).sendKeys(string);
//	String testVegName	=driver.findElement(By.xpath("//td[normalize-space()=\"Tomato\"]")).getText().split(" ")[0].trim();
//	System.out.println(testVegName);
//		Assert.assertEquals(testVegName, vegName);
//		
//	}
	
	

}
