package batch_11_project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/ ");
		Driver.manage().window().maximize();
		
	Driver.findElement(By.xpath("//input[@name='email']" )).sendKeys("abhishekbandal");
	  Thread.sleep(2000);
	Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1235678");
	  Thread.sleep(2000);
    Driver.findElement(By.xpath("//button[@name='login']")).click();
      Thread.sleep(2000);
	Driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Driver.close();  

		
		
		
		
	}

}
