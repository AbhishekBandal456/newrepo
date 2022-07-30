package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keysupdowm {

	public static void main(String[] args) {
		// enter data using keys 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		
		WebElement email_id=driver.findElement(By.xpath("//input[@name='email']"));
		email_id.click();
		 Actions act = new Actions(driver);
		act.keyDown(email_id, Keys.SHIFT).sendKeys("abhishek").keyUp(Keys.SHIFT).build().perform();
		
		//WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		//pass.click();
		//act.keyDown(pass, Keys.SHIFT).sendKeys("bandal123").keyUp(Keys.SHIFT).build().perform();
		
		act.keyDown( Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown( Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
