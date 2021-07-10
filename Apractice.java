import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Apractice {
	public WebDriver driver = new ChromeDriver ();
	
	@Before 
	public void setUp() throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver", "chromedriver") ;
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.get("http://automationpractice.com");
		Thread.sleep(5000);
		
		
	}
	
	@After 
	public void tearDown () throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
	
	@Test
	
	public void goToautomationpractice () throws Exception {
		 driver.findElement(By.linkText("Sign in")).click();
		 driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("apecalev@gmail.com");
		    driver.findElement(By.id("passwd")).sendKeys("Aleksandar97");
		    driver.findElement(By.id("SubmitLogin")).click();
		    
		    
		
	}
	
	@Test
	public void goToregistration () throws Exception {
		driver.get("http://automationpractice.com/index.php");
		WebElement signIn = driver.findElement(By.xpath("//*[@class='login']"));
		signIn.click();
		WebElement createEmail = driver.findElement(By.id("email_create"));
		createEmail.sendKeys("Nptest@localhost.com"); 
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		 
		driver.findElement(By.cssSelector(".form-ok")).click();
		
	    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
	   
	    Thread.sleep(5000);
	  
	    WebElement Title = driver.findElement(By.id("id_gender1"));
	    Title.click();
	    
	    
	    
	    driver.findElement(By.id("customer_firstname")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("test");
	    
	    
	   
	    driver.findElement(By.id("customer_lastname")).click();
	    driver.findElement(By.id("customer_lastname")).sendKeys("test");
	    
	    
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).sendKeys("123456789");
	    
	    
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
	
	 @Test
	  public void gmailregistration() {
	    driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	    
	    driver.findElement(By.id("firstName")).click();
	    driver.findElement(By.id("firstName")).sendKeys("host");
	    driver.findElement(By.id("lastName")).sendKeys("host");
	    driver.findElement(By.id("username")).sendKeys("host");
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("host1");
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("host9777");
	    {
	        WebElement element = driver.findElement(By.cssSelector(".N3Hzgf > .LXRPh"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).release().perform();
	      }
	    
	      
}
	 }
