package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drp_handle_practise {

	public static void main(String[] args) throws Exception {
		// handle drop down

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		 
		
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abhishek");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bandal");
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9075687456");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234@4321");
		
		WebElement birth_day=driver.findElement(By.xpath("//select[@id='day']"));
		Select ab = new Select(birth_day);
		System.out.println(ab.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		List<WebElement>list=ab.getOptions();
		for(int i=0;i<list.size();i++) {
			String value=list.get(i).getText();
			System.out.println(value);
			
			if(value.equals("16")) {
				
				ab.selectByVisibleText("16");
				break;
			}
		}
		
	   ab.selectByVisibleText("18");
	     Thread.sleep(2000);
		
	    WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select ab1=new Select(month);
		System.out.println(ab1.getFirstSelectedOption().getText());
		
		List<WebElement> list1=ab1.getOptions();
		for( int i=0;i<list1.size();i++) {
			Thread.sleep(2000);
			String value=list1.get(i).getText();
			System.out.println(value);
		
		}
		//ab1.selectByIndex(4);
		//Thread.sleep(2000);
		//ab1.selectByValue("6");
		//Thread.sleep(2000);
		ab1.selectByVisibleText("May");
		Thread.sleep(2000);
		
		WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select ab2 = new Select(year);
		//ab2.selectByIndex(12);
		//Thread.sleep(2000);
		//ab2.selectByValue("2022");
		//Thread.sleep(2000);
		
		ab2.selectByVisibleText("1997");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
        driver.close();
		
        custom_handledropdown(birth_day,"16");
        custom_handledropdown(month,"May");
        custom_handledropdown(year,"1997");
	}



   public static void custom_handledropdown(WebElement element, String text) {
	   Select sel = new Select(element);
	   sel.selectByVisibleText(text);
	   
	   
	   }
   }
