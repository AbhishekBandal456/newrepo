package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) throws Exception {
		// navigation methods
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/signup");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.navigate().to("https://www.instagram.com/accounts/emailsignup/?hl=en");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        driver.close();        
        
        
	}

}
