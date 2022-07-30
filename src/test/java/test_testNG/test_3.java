package test_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
                                       //tests executes by using base class (inheritance)
public class test_3 extends crbrowser  {
 @Test
 public void test_4() throws Exception {
	 
	 System.out.println("test_4");
  WebElement login =driver.findElement(By.xpath("//button[@name='websubmit']"));
 		login.click();
     
}
}
