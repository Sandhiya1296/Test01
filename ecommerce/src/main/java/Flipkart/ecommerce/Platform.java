package Flipkart.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Platform {
	private static final boolean False = false;
	private static final boolean True = false;
	WebDriver driver=new ChromeDriver();
	@Test (dependsOnMethods="signup")
	public void signup() {
		System.out.print("signup");
	}
	@Test(dependsOnMethods="login")
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods="searchProduct")
	public void searchProduct() {
		System.out.println("search Product");
	}
	@Test(enabled=True)
	public void addtoCart() {
		System.out.println("add to cart");
	}
}
