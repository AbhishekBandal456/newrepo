package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop {

	public static void main(String[] args) throws Exception {
		// drag and drop
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
		
		Actions act= new Actions (driver);
           // WebElement selenium = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		//act.moveToElement(selenium).click().build().perform();
		
		
		//drag and drop
		JavascriptExecutor js = (JavascriptExecutor)driver;          //scrolling action
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop( src,target).build().perform();
		Thread.sleep(2000);
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement target1=driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		act.dragAndDrop( src1,target1).build().perform();
		Thread.sleep(2000);
		WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement target2=driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		act.dragAndDrop( src2,target2).build().perform();
		Thread.sleep(2000);
		WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		WebElement target3=driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		act.dragAndDrop( src3,target3).build().perform();
		Thread.sleep(2000);
	driver.close();
	
	
	}
	

}
