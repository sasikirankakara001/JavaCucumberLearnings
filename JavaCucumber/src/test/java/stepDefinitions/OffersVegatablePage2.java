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
import pageObjects.OffersVegetablePage2;
import utils.TextContent;

public class OffersVegatablePage2 {
	public static OffersVegetablePage2 offersVegetablePage2 = new OffersVegetablePage2(TextContent.driver);
	TextContent textContent;

	public OffersVegatablePage2(TextContent textContent) {
		this.textContent = textContent;
	}

//	@Given("User lands in the HomePage")
//	public void user_lands_in_the_home_page() {
//		// Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		webDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//
//	}
//
//	@When("User enters word {string} in search and grab the Name")
//	public void user_enters_word_in_search_and_grab_the_name(String string) {
//		// Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.cssSelector("input[placeholder=\"Search for Vegetables and Fruits\"]")).sendKeys(string);
//		
//		
//	}
	public void newMethodImplement() {
//		textContent.driver.findElement(By.xpath("//a[normalize-space()=\"Top Deals\"]")).click();
		offersVegetablePage2.searchOpertation();
		Set<String> handles = textContent.driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String childId = it.next();
		textContent.driver.switchTo().window(childId);
		System.out.println("Testing current URL:" + textContent.driver.getCurrentUrl());
	}

	@Then("User verifies and search for {string} word present in deals page or not")
	public void user_verifies_and_search_for_word_present_in_deals_page_or_not(String string) {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		String vegName = textContent.driver.findElement(By.xpath("//h4[normalize-space()=\"Tomato - 1 Kg\"]")).getText()
//				.split("-")[0].trim();
		offersVegetablePage2.getVegName();
//		System.out.println(vegName);
		newMethodImplement();
		System.out.println(textContent.driver.getCurrentUrl());
//		textContent.driver.findElement(By.cssSelector("#search-field")).sendKeys(string);
		offersVegetablePage2.searchField(string);
//	String testVegName	=textContent.driver.findElement(By.xpath("//td[normalize-space()=\"Tomato\"]")).getText().split(" ")[0].trim();
		offersVegetablePage2.testVegsName();

	}

}
