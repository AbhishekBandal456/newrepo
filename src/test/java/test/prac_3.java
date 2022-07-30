package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac_3 {

	public static void main(String[] args) throws Exception {
		// drop down handling
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/signup");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
         WebElement birth_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
       // if tag name is start with select we handle drop down using select class
        Select sel = new Select( birth_day);
        sel.selectByIndex(15);
        WebElement birth_month = driver.findElement(By.xpath("//select[@id='month']"));
        Select sel1 = new Select( birth_month);
        sel1.selectByValue("5");
        WebElement birth_year = driver.findElement(By.xpath("//select[@id='year']"));
        Select sel2 = new Select( birth_year);
        sel2.selectByVisibleText("1997");
        driver.close();
        
        

	}

}
