package test_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
                                                        //base class
public class base_class {
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		System.out.println("BM");
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/signup");
        driver.manage().window().maximize();
		
		}
	
	
	@AfterMethod
	public void AM() throws Exception {
		System.out.print("AM");
		Thread.sleep(2000);
		driver.close();
	}
	

}
