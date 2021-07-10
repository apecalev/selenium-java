import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


import pages.AuthenticPage;

@SuppressWarnings("deprecation")
public class Atest {

	public WebDriver driver = new ChromeDriver();
	AuthenticPage objAuth = new AuthenticPage(driver);
	
	public WebDriverWait Wait = new WebDriverWait(driver,50);
	
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		
	}
	
	@After
	public void tearDown() throws Exception {

		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.quit();
		
		
	}
	
	
	
	@Test 
	public void registerEmail() throws Exception {
		 driver.findElement(By.linkText("Sign in")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 
		 
		objAuth.setRegisterEmail("aleksandarmail.com");
		
		objAuth.clickRegisterButton(); 
		
		
	
	Assert.assertEquals(false, objAuth.registrationAlert());
	
		
		
		
		
	}
	@Test
	public void registerAccount () throws Exception {
	
		driver.get("http://automationpractice.com");
		driver.findElement(By.linkText("Sign in")).click();
		objAuth.setRegisterEmail("AShost@host.com");
		objAuth.clickRegisterButton();
		Assert.assertEquals(false, objAuth.registrationAlert());
		
		
		
	}
	
	

}