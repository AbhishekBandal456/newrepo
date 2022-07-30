package test_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crbrowser {
	WebDriver driver;
	@Parameters ({"Browsername"})
	@BeforeMethod
	public void browser1(String Browsername) {
		if(Browsername.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			

		}
		
		else if (Browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		

		}
		 driver.get(" https://www.facebook.com/signup");
			driver.manage().window().maximize();

	}
		
	@AfterMethod
	public  void test_1() {
		driver.close();
		
	}
	
	
}
