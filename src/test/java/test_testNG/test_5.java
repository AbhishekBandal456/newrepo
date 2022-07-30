package test_testNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


                                //test execution using (dependsOnMethods={""}) ,enable=false,
public class test_5 extends base_class {

	
	@Test(priority=1)
	public void test_1() throws Exception {
		System.out.print("test_1");
		
		 WebElement name=  driver.findElement(By.name("firstname"));       //by name
	        name.sendKeys("abhishek");
	        Thread.sleep(2000);
	     WebElement surname= driver.findElement(By.name("lastname"));  //by name
	          surname.sendKeys("Bandal");
	        Thread.sleep(2000);
	 // Assert.assertTrue(false); 
	}
	//test 1 will be false due to assert false so,  test 2 because of test 2 will not executes because its depends on test 1.
	
	@Test (priority=2,dependsOnMethods ={"test_1"})                         //dependsOnMethods
	public void test_2() throws Exception {
		System.out.println("test_2");
		 WebElement mobile_number= driver.findElement(By.xpath("//input[@name='reg_email__']"));   //by x path
			mobile_number.sendKeys("1234569870");
			 Thread.sleep(2000);
		 WebElement password= driver.findElement(By.xpath("//input[@type='password']"));     // x path
			password.sendKeys("9874563211");
			Thread.sleep(2000);
	}
	@Test  (priority=3,enabled=false)                                     // will not execute due to enabled = false
	 public void test_3() throws Exception {
		 
		 System.out.println("test_3");
	  WebElement login =driver.findElement(By.xpath("//button[@name='websubmit']"));
	 		login.click();
	     
	}
	
	
	       
	}
