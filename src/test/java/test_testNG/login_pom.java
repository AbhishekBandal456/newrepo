package test_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_pom {

	
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement email_id;
	@FindBy(how=How.XPATH,using="//input[@name='pass']")private WebElement pass;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement login_btn;

	public WebElement getEmail_id() {
		return email_id;
		}
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getLogin_btn() {
		return login_btn;
	
	}
	}	

