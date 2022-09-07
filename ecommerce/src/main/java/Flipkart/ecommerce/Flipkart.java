package Flipkart.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http:\\www.flipkart.com");
		driver.quit();
	}
/*	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("starting the chrome Browser");
	}
	@AfterMethod
	public void AfterMethod() {
		WebDriver driver= new ChromeDriver();
		driver.quit();
		System.out.println("close the chrome Browser");
	}*/
}
