package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class publicdemo {

	public static void main(String[] args) throws Exception {
		
		      WebDriverManager.chromedriver().setup();
		      WebDriver driver = new ChromeDriver();
		      driver.get("https://www.facebook.com/");
		      driver.manage().window().maximize();
		      
		      WebElement emailadress= driver.findElement(By.name("email"));
		      emailadress.sendKeys("abhishek");
		       Thread.sleep(3000);
		      
		      WebElement password= driver.findElement(By.id("pass"));
		      password.sendKeys("12345678");
		      Thread.sleep(3000);
		    
		      WebElement login= driver.findElement(By.xpath("//button[@name='login']"));
		      login.click();
		      Thread.sleep(3000);
		       driver.close();
		      
		    
	}
	
	}

