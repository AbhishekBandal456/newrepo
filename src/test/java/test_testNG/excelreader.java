package test_testNG;

import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelreader {
	
	WebDriver driver;
	@BeforeMethod  
	public void m1() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
		
	}

	@Test (priority=1)
	public void test_read() throws Exception {
		
		String path ="C:\\Users\\HP\\eclipse-workspace\\batch_11_project2\\test data\\dataexcel.xlsx";
		FileInputStream file=new FileInputStream( path);
		XSSFWorkbook wb = new XSSFWorkbook( file);
		
		String emaildata=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 String passdata=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		 
		 System.out.println(emaildata);
		 
		WebElement mailid= driver.findElement(By.name("email"));
		 mailid.sendKeys(emaildata);
		 Thread.sleep(2000);
		 WebElement pass= driver.findElement(By.name("pass"));
		pass.sendKeys(passdata);
		Thread.sleep(2000);
	
		//exceldataprovider.readexeldata("sheet1", 0, 0);
		//exceldataprovider.readexeldata("sheet1", 0, 1);
	}
	
	
	@AfterMethod
	public void m2() {
		
		driver.close();
	}
	
	



  
}

