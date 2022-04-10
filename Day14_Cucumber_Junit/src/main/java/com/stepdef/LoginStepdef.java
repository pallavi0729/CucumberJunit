package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {
	WebDriver driver;
	
	// Cucumber annotations --- Hooks in Cucumber
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
		
	}
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {

	    driver.get("file:///D:/SELENIUM/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	   
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		/*driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();*/
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		 Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}
	
	@Then("^user should see JBK logo$")
	public void user_should_see_JBK_logo() throws Throwable {
		 WebElement logo = driver.findElement(By.tagName("img"));
		 Assert.assertTrue(logo.isDisplayed());
	}
 
}
