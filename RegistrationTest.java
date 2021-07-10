import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.RegistrationPage;

public class RegistrationTest {
	
	
	
	
	

	public WebDriver driver = new ChromeDriver();
   
	RegistrationPage objReg = new RegistrationPage(driver);
	
	
	
		
		
	

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.findElement(By.linkText("Sign in")).click();

	
}
	
	 @After
		public void tearDown() throws Exception {
		   driver.findElement(By.linkText("Sign out")).click();
Thread.sleep(5000);
		   driver.quit();
	   }
	
	 
	 @Test
	public void setRegEmail () throws Exception {
		 driver.findElement(By.id("email_create")).click();
		 
		 objReg.setRegEmail();
		 objReg.clickRegisterButton();
		
		 objReg.clickTitleButton();
		 objReg.setFirstName();
		 objReg.setLastName();
		 objReg.setPassword();
		 objReg.setBirth();
		 objReg.setAddress();
		 objReg.clickCity();
		 objReg.clickState();
		 objReg.clickPostcode();
		 objReg.clickPhone();
		 objReg.
		 
		 driver.findElement(By.cssSelector("#submitAccount .icon-chevron-right")).click();
		 
		 
		 
		 
	 }
	 
}
	




