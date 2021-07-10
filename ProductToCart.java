package tests;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

import pages.WomenCategory;

public class ProductToCart {

	public WebDriver driver = new ChromeDriver();

	LoginPage objLog = new LoginPage(driver);
	WomenCategory objWom = new WomenCategory(driver);

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		objLog = PageFactory.initElements(driver, pages.LoginPage.class);
		objWom = PageFactory.initElements(driver, pages.WomenCategory.class);

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		driver.quit();
	}

	@Test

	public void twoProduct() throws Exception {

		driver.findElement(By.id("email")).click();
		objLog.typeUsername();
		objLog.typePassword();
		objLog.clickOnSignin();
		objLog.dresses();
		objLog.product1();
		objLog.add();
		Thread.sleep(3000);
		objLog.nextproduct();
		objLog.product2();
		Thread.sleep(3000);
		objLog.selectpr();
		objLog.addToCart();
		objLog.proceed();
		objLog.proceed1();
		objLog.proceed2();
		objLog.terms();
		objLog.proceed3();
		objLog.paybycheck();
		objLog.confirm();
		objLog.backToOrder();

	}

	@Test
	public void oneProduct() throws Exception {
		driver.findElement(By.id("email")).click();
		objLog.typeUsername();
		objLog.typePassword();
		objLog.clickOnSignin();
		objLog.dresses();
		objLog.product1();
		objLog.add();
		objLog.proceed();
		objLog.proceed1();
		objLog.proceed2();
		objLog.terms();
		objLog.proceed3();
		objLog.payBank();
		objLog.confirm2();
		objLog.backToOrder2();
	}

}
