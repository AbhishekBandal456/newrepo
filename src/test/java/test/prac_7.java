package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac_7 {

	public static void main(String[] args) {
		// child window handle
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        String parentwindowadd=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        System.out.println(parentwindowadd);
         Set<String>allwindosadd=driver.getWindowHandles();
         System.out.println(allwindosadd);
        
        Iterator<String> it =allwindosadd.iterator();
        while(it.hasNext()) {
        	String childwindowadd=it.next();
        	if(!parentwindowadd.equals(childwindowadd)){
        		driver.switchTo().window(childwindowadd);
        		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("asdfghj");
        		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        		driver.close();
        	}
        }
        driver.switchTo().window(parentwindowadd);
        driver.close();
	}

}
