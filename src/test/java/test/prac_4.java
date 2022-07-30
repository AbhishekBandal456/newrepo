package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class prac_4 {

	public static void main(String[] args) throws Exception {
		// take screenshot of web page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/signup");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        String path = "C:\\Users\\HP\\eclipse-workspace\\batch_11_project2\\screenshots";
         String rm = RandomString.make(5);
        
        TakesScreenshot ss = (TakesScreenshot)driver;
        // we use takesScreenshot interface for taking screenshot, so we create ref. of takesScreenshot interface
		File format=ss.getScreenshotAs(OutputType.FILE);
		//for getting screenshot in file format we write this code
		File dest = new File (path+"//"+rm+".png");
		// for saving screenshot we select destination 
        FileUtils.copyFile(format, dest);
        // we used fileUtils method for move file format to the destination
       driver.close();
	}

}
