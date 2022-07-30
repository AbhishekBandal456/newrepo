package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class find_element {

	public static void main(String[] args) {
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		WebElement mobile1=driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		mobile1.click();
	}

}
