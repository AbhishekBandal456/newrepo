package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstname {

	public static void main(String[] args) throws Exception {
		
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/signup");
      
      driver.manage().window().maximize();
     
   
     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhishek");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bandal");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9075687456");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("fakepass@123");
     Thread.sleep(2000);
     WebElement drp_day =driver.findElement(By.xpath("//select[@name='birthday_day']"));
     Select sel1 = new Select(drp_day);
    // sel1.selectByIndex(11);     //byindex
   //  Thread.sleep(3000);
    // sel1.selectByValue("18");
     //Thread.sleep(3000);
     sel1.selectByVisibleText("16");
     Thread.sleep(2000);
     WebElement drp_month =driver.findElement(By.xpath("//select[@name='birthday_month']"));
      Select sel2=new Select (drp_month);
     // sel2.selectByIndex(4);
     // Thread.sleep(3000);
     // sel2.selectByValue("5");
     // Thread.sleep(3000);
      sel2.selectByVisibleText("May");
      Thread.sleep(2000);
      WebElement drp_year = driver.findElement(By.xpath("//select [@id='year']"));
      Select sel3 = new Select(drp_year);
     // sel3.selectByValue("2001");
    //  Thread.sleep(3000);
    //  sel3.selectByIndex(5);
     // Thread.sleep(3000);
      sel3.selectByVisibleText("1997");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]")).click();
      Thread.sleep(2000);
    // driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    // Thread.sleep(2000);
   // driver.close();
      
      
      
    
	}
	}





