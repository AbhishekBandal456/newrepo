package test_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
                                 //@before method and @after method anotation used and executes tests
public class test_2 {
	WebDriver driver;
	
	@BeforeMethod
	public void BM() {
		System.out.println("BM");
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/signup");
        driver.manage().window().maximize();
		
		}
	
	@Test
	public void test_1() throws Exception {
		System.out.print("test_1");
		
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
	}
	
	@Test
	public void test_2() {
		System.out.println("test_2");
		
		  WebElement birth_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	       Select sel = new Select( birth_day);
	        sel.selectByIndex(15);
	        WebElement birth_month = driver.findElement(By.xpath("//select[@id='month']"));
	        Select sel1 = new Select( birth_month);
	        sel1.selectByValue("5");
	        WebElement birth_year = driver.findElement(By.xpath("//select[@id='year']"));
	        Select sel2 = new Select( birth_year);
	        sel2.selectByVisibleText("1997");
	}
	       
	  
	        @AfterMethod
	public void AM() {
		System.out.print("AM");
		driver.close();
	}
}

