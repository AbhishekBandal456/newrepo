package test_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testpom {

	@Test
	public void m1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
	    
	   login_pom login = PageFactory.initElements(driver,  login_pom.class);
	    
	    login.getEmail_id().sendKeys("asdfgh");
	   login.getPass().sendKeys("33483");
	   login.getLogin_btn().click();
	   
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
}
