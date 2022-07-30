package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/signup");
        driver.manage().window().maximize();
       
		
		//scrolling by pixel
        
      JavascriptExecutor js =(JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,500)", "");
	//	 Thread.sleep(2000);
	//	js.executeScript("window.scrollBy(0,-500)", "");
		
		// scroll by element
      
		WebElement English_Element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		
		js.executeScript("arguments[0].scrollIntoView()",English_Element);
		 Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']"));
		
		getScrollIntoView_Element(driver,logo);
		
		
	}
	public static void getScrollIntoView_Element(WebDriver driver,WebElement Element) {
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView()",Element);
		 
	}
	

}
