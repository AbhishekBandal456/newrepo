package test;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class amazon_web {

	public static void main(String[] args) throws Exception {
		// amazon task
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
		  
        driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		driver.findElement(By.name("email")).sendKeys("8788737530");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("amazon@123");
		driver.findElement(By.id("signInSubmit")).click();

        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
        
        driver.findElement(By.xpath("//input[@value='Go']")).click();
         
		driver.findElement(By.xpath("(//img[@class='s-image'])[3]")).click();
		
		
	           
		String parentaddress=driver.getWindowHandle();
		Set<String> list=driver.getWindowHandles();
		
		Iterator<String>it =list.iterator();
		while(it.hasNext()) {
			String childWindowAdress=it.next();
			if(!parentaddress.equals(childWindowAdress)) {
				driver.switchTo().window(childWindowAdress);
				
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.navigate().refresh();
			
			WebElement add_to_cart=driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]"));
			add_to_cart.click();
			
			String rm=RandomString.make(4);
			
			String path="C:\\Users\\HP\\eclipse-workspace\\batch_11_project2\\screenshots";
			
			
			TakesScreenshot sc=(TakesScreenshot)driver;
			File src=sc.getScreenshotAs(OutputType.FILE);
			File dest=new File(path+"+rm+"+".png");
			FileUtils.copyFile(src, dest);
			
			driver.findElement(By.xpath("//input[@value='Delete']")).click();
			
			TakesScreenshot sc1=(TakesScreenshot)driver;
			File src1=sc.getScreenshotAs(OutputType.FILE);
			File dest1=new File(path+"+rm+"+".png");
			FileUtils.copyFile(src1, dest1);
			 driver.switchTo().window(parentaddress);
				}
			
		}
        driver.quit();
      }
	
	
}
