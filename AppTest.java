import org.junit.After;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		driver.get("http://google.com");
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(15000);
		driver.quit();
	
		
	}
	
	@Test 
	public void goToap() throws Exception {
		driver.get("http://automationpractice.com/index.php");
		
		//click on sign in button 
      
		WebElement signIn = driver.findElement(By.xpath("//*[@class='login']"));
		signIn.click();
      		
		//enter email address into create an account field 
		WebElement createAnaccount = driver.findElement(By.xpath("//*[@id='email_create']"));
		createAnaccount.sendKeys("POtest@test.com");
		
		//click on create an account buttom 
		
		 
		    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		
		 
	Thread.sleep(5000);
	
			// click on Mr.
		    
		   WebElement title = driver.findElement(By.id("id_gender1"));
		   title.click();
		   
		   //fill the fields
		   driver.findElement(By.id("customer_firstname")).click();
		    driver.findElement(By.id("customer_firstname")).sendKeys("test");
		    
		    driver.findElement(By.id("customer_lastname")).click();
		    driver.findElement(By.id("customer_lastname")).sendKeys("testovski");
		    
		    driver.findElement(By.id("passwd")).click();
		    driver.findElement(By.id("passwd")).sendKeys("Test97");
		    
		    driver.findElement(By.id("days")).click();
		    driver.findElement(By.id("days")).sendKeys("1");
		    
		    driver.findElement(By.id("months")).click();
		    driver.findElement(By.id("months")).sendKeys("January");
		   
		   driver.findElement(By.id("years")).click();
		   driver.findElement(By.id("years")).sendKeys("1997");
		   
		    driver.findElement(By.id("address1")).click();
		    driver.findElement(By.id("address1")).sendKeys("Ul br 5");
		  
		    
		   
		   
		    driver.findElement(By.id("city")).click();
		    driver.findElement(By.id("city")).sendKeys("Bitola");
		  
		    driver.findElement(By.id("id_state")).sendKeys("Alabama");
		    
		   
		    
		      
		      
		      driver.findElement(By.id("postcode")).click();
		      driver.findElement(By.id("postcode")).sendKeys("70001");
		      
		     
		      
		      driver.findElement(By.id("phone_mobile")).click();
		      driver.findElement(By.id("phone_mobile")).sendKeys("123456789");
		      
		      
		      driver.findElement(By.cssSelector("#submitAccount .icon-chevron-right")).click();
		    }
		
		
		 
		 
		 
		
		
		
		
		
	
	
	
		
	   
		
	  
	  
	
		
		
		
	
	   
	
}
