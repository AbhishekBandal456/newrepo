package test_testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pomclassforinstalogin {

	
	     @FindBy(how=How.XPATH,using="//input[@name='username']")private WebElement emailid;
	
	     @FindBy(how=How.XPATH,using="//input[@name='password']")private WebElement pass;
	     
	     @FindBy(how=How.XPATH,using="//button[@type='submit']")private WebElement login;

	
	     
	     public WebElement getEmailid() {
			return emailid;
		}

		

		public WebElement getPass() {
			return pass;
		}

		

		public WebElement getLogin() {
			return login;
		}

		
	
	
	
	
}




