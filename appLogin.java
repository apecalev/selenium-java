import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.LoginPage;


public class appLogin {
	public WebDriver driver = new ChromeDriver();
	
	LoginPage objLog = new LoginPage(driver);
	
	
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.findElement(By.linkText("Sign in")).click();
	
		
		
	}
	
		
	   @After
		public void tearDown() throws Exception {
		   driver.findElement(By.linkText("Sign out")).click();

		   driver.quit();
	   }
	   
	   
	   @Test 
		public void loginEmail() throws Exception {
		   driver.findElement(By.id("email")).click();
		  
		   
		   
		Thread.sleep(5000);

	objLog.typeUsername();
	objLog.typePassword();
		    objLog.clickOnSignin();
		    
	
		   
		   
		   
		  
		   
		   
		   
		   
		   
		   
	   }
	   
		
	
	
	
}




