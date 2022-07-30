package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac_6 {

	public static void main(String[] args) {
		//child window handling
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

       String parentwindowadd= driver.getWindowHandle();
       System.out.println(parentwindowadd);
       WebElement click_here=driver.findElement(By.xpath("//a[text()='Click Here']"));
       click_here.click();
       
        Set<String>alladdress=driver.getWindowHandles();
        System.out.println(alladdress);
        /////////////////////////////////////////////////////////////////////////////////////////////////
                 Iterator<String> it =alladdress.iterator();
        while(it.hasNext()) {
        	String childwindowaddress=it.next();
        	if(!parentwindowadd.equals(childwindowaddress)) {
        		driver.switchTo().window(childwindowaddress);
        		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("asfgg");
        		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        		driver.close();
        		
        	}
        	
        }
        driver.switchTo().window(parentwindowadd);
        driver.quit();
	}

}
