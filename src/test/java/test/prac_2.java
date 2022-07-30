package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac_2 {

	public static void main(String[] args) throws Exception {
		// find  webElement by different locators
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/signup");
        driver.manage().window().maximize();
        Thread.sleep(2000);
	 WebElement name=  driver.findElement(By.name("firstname"));       //by name
        name.sendKeys("abhishek");
        Thread.sleep(2000);
     WebElement surname= driver.findElement(By.name("lastname"));  //by name
          surname.sendKeys("Bandal");
        Thread.sleep(2000);
     WebElement mobile_number= driver.findElement(By.xpath("//input[@name='reg_email__']"));   //by x path
		mobile_number.sendKeys("1234569870");
		 Thread.sleep(2000);
	 WebElement password= driver.findElement(By.xpath("//input[@type='password']"));     // x path
		password.sendKeys("9874563211");
		driver.close();
	
	}	
	}
              // tagname [@attribute='attribute value']          //x path by attribute  
               // tagname [text()='text value']                  // x path by text
               // tagname [contains[@attribute,'attribute value'  // x path by contains
              // (//tagname [@attribute='attribute value'][index])  // x path by index