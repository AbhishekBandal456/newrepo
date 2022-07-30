package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac_10 {

	public static void main(String[] args) throws Exception {
		// send text using keys
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        email.click();
        
        Actions act = new Actions(driver);
        act.keyDown(email,Keys.SHIFT).sendKeys("abhishekbandal").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(2000);
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();	
        Thread.sleep(2000);
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
        WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
        pass.click();
        Thread.sleep(2000);
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
        
	}

}
