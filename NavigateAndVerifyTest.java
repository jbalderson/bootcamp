package com.tn.qa.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class NavigateAndVerifyTest {
	    private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	  
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	    }

	    @Test
	    public void testNavigateAndVerifyElements() {
	      
	        driver.get("https://www.example.com");

	        driver.findElement(By.linkText("Click Here")).click();

	       
	        boolean isElement1Present = driver.findElement(By.id("element1-id")).isDisplayed();
	        Assert.assertTrue(isElement1Present, "Element 1 not found on the new page!");

	        boolean isElement2Present = driver.findElement(By.xpath("//div[@class='element2-class']")).isDisplayed();
	        Assert.assertTrue(isElement2Present, "Element 2 not found on the new page!");

	        String expectedText = "Welcome to the new page!";
	        String actualText = driver.findElement(By.cssSelector("h1")).getText();
	        Assert.assertEquals(actualText, expectedText, "Incorrect text on the new page!");

	        
	    }

	    @AfterClass
	    public void tearDown() {
	        
	       
	driver.quit();
	    }
	}
