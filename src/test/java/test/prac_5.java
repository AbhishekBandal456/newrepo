package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac_5 {

	public static void main(String[] args) throws Exception {
		//pop up handling

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
       
		
		WebElement cust_id =driver.findElement(By.xpath("//input[@name='cusid']"));
		cust_id.sendKeys("45674235");
		 //Thread.sleep(2000);
		WebElement submit_button = driver.findElement(By.xpath("//input[@name='submit']"));
		submit_button.click();
		// Thread.sleep(2000);
		 
		Alert alt= driver.switchTo().alert();
		     System.out.println(alt.getText());
		 alt.accept();
		 System.out.println(alt.getText());
		 alt.accept();
		 driver.close();
		
	}
	

}
