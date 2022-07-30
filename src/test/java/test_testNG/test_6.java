package test_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//grouping
public class test_6 extends crbrowser{

WebDriver driver;
	
	@BeforeMethod 
	public void BM() {
		System.out.println("BM");
		}
	
	@Test(groups="sanity")
	public void test_1() {
		System.out.print("test_1");
	}
	
	@Test (groups="regression")
	public void test_2() {
		System.out.print("test_2");
	}
	
	@Test (groups="sanity,regression")
	public void test_3() {
		System.out.print("test_3");
	}
	
	
	@AfterMethod
	public void AM() {
		System.out.print("AM");
	}
	
	
	
	
	
}
	

	
	
	

