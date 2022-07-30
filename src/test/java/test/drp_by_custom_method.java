package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drp_by_custom_method {

	public static void main(String[] args) throws Exception {
		// drop down by custom method
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abhishek");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bandal");
		  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9075687456");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234@4321");
			
		
		WebElement birth_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel = new Select( birth_day);
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByVisibleText("16");
		Thread.sleep(2000);
		List<WebElement>list= sel.getOptions();
		  for(int i=0;i<list.size();i++) {
			 String value=list.get(i).getText();
			 System.out.println(value);
		  }
		
		WebElement birth_month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel1 = new Select( birth_month);
		System.out.println(sel1.getFirstSelectedOption().getText());
		sel1.selectByVisibleText("May");
		Thread.sleep(2000);
		WebElement birth_year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel2 = new Select(  birth_year);
		sel2.selectByVisibleText("1997");
		WebElement radio=driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]"));
		radio.click();
		WebElement login =driver.findElement(By.xpath("//button[@name='websubmit']"));
		login.click();
		
	}	
		
	
}
