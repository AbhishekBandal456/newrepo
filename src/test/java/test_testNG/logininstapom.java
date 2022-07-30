package test_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logininstapom {

	  @Test
	public void m1(  ){	
	  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.instagram.com/login/");
	    driver.manage().window().maximize();
	    
	    pomclassforinstalogin loginn= PageFactory.initElements(driver,  pomclassforinstalogin.class);
        loginn.getEmailid().sendKeys("asdfghjk");
        loginn.getPass().sendKeys("123544");
        loginn.getLogin().click();
	    
	} 
	    
	                   
       
		
 
 }
 
