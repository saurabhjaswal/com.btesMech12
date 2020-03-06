package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Loginstepdefination {
public static WebDriver driver;
String path;


	
@Given("^User is already on Login page$")
	public void Openbrowser() {
	//write code here that turns the phrase above into concrete actions
	path= System.getProperty("user.dir")+"//webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/");
	}
@Then("^user enter username and password$")
	public void ValidLogincredential() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
@Then("^user will redirect to home page$")
	public void Homepage() {
		System.out.println(driver.getTitle());
	}
}
