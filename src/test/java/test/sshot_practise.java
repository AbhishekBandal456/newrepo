package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class sshot_practise {

	public static void main(String[] args) throws IOException {
		// take screenshot of given web page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/b?ie=UTF8&node=17369456031");
		driver.manage().window().maximize();
		
		String Rm =RandomString.make(5);            //code for random names for sshots
		
		String path ="C:\\Users\\HP\\eclipse-workspace\\batch_11_project2\\screenshot";// code for store sshot at particular path or location
		
		TakesScreenshot ab = (TakesScreenshot)driver;    //code for create ref of takesscreenshot interface
		File format=ab.getScreenshotAs(OutputType.FILE);     //code for take sshot in file format
		File dest= new File (path+"//"+Rm+".png");       // code for store sshot in file so create object of file class
	    FileUtils.copyFile(format, dest)   ;            // this class is used for move sshot from src to dest(one location to another location)
		driver.close();                              // code for close the browser.
	}

}
