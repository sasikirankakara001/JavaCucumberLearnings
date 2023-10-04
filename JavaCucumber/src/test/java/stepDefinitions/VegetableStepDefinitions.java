package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VegetableStepDefinitions {
	public static WebDriverManager manager;
	public static WebDriver driver = new ChromeDriver();
	@Given("User lands in the HomePage")
	public void user_lands_in_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		manager.chromedriver().setup();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@When("User enters word {string} in search and grab the Name")
	public void user_enters_word_in_search_and_grab_the_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.findElement(By.cssSelector("input[placeholder=\"Search for Vegetables and Fruits\"]")).sendKeys(string);
	
	}
	@Then("User verifies and search for {string} word present in deals page or not")
	public void user_verifies_and_search_for_word_present_in_deals_page_or_not(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String vegName = driver.findElement(By.xpath("//h4[normalize-space()=\"Tomato - 1 Kg\"]")).getText().split("-")[0].strip();
		System.out.println(vegName);
		driver.findElement(By.xpath("//a[normalize-space()=\"Top Deals\"]")).click();
	Set<String>handles=driver.getWindowHandles();
	Iterator<String>it = handles.iterator();
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId);
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys(string);
	String testName=driver.findElement(By.xpath("//td[normalize-space()=\"Tomato\"]")).getText().split(" ")[0].strip();
	System.out.println(testName);
	Assert.assertEquals(vegName, testName);
	
	}

}
