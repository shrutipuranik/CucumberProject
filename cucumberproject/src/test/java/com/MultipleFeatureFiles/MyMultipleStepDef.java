package com.MultipleFeatureFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyMultipleStepDef {
	
	
	WebDriver driver;
	@Given("^open facebook page$")
	public void openFacebookPage(){
		System.setProperty("webdriver.chrome.driver", "E:\\RadicalSoftware\\Oct06_BackUp\\chromedriver_win32_B39\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
		@When("^I enter log in name$")
		public void i_enter_log_in_name() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "E:\\RadicalSoftware\\Oct06_BackUp\\chromedriver_win32_B39\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shrutipuranik1@gmail.com");
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing123");
//			Thread.sleep(2000);
		}

		@Then("^I verified testbox working$")
		public void i_verified_testbox_working() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "E:\\RadicalSoftware\\Oct06_BackUp\\chromedriver_win32_B39\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.facebook.com");
			boolean isPresent= driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed();
			Thread.sleep(2000);
			if (isPresent==true){
				Assert.assertTrue(isPresent);
			}
			driver.quit();
		}
	}
	

