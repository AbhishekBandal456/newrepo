package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac_8 {

	public static void main(String[] args) {
		// scrolling by pixel and element
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        //Scroll by pixel
        JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(0,1000)", "");
        
        //Scroll by element
       WebElement get_to_know_us= driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
        js.executeScript("arguments[0].scrollIntoView()", get_to_know_us);
        
       // getScrollElement(driver,get_to_know_us);
        
 }
	// generic method
	
	public static void getScrollElement(WebDriver driver,WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView()", element);
	}

}
