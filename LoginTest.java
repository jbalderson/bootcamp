package com.tn.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LoginTest {
	private WebDriver driver;
			
			@Before Class
			public void setUp() { 
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
			}
        
        @Test
        public void testLoginWithValidCredentials() {
            
            driver.get("https://www.example.com/login");

           
            driver.findElement(By.id("username")).sendKeys("your-username");
            driver.findElement(By.id("password")).sendKeys("your-password");
            driver.findElement(By.id("login-button")).click();

            
            String expectedWelcomeMessage = "Welcome, User!";
            String actualWelcomeMessage = driver.findElement(By.id("welcome-message")).getText();
            Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Login was not successful!");
        }

        @AfterClass
        public void tearDown() {
         
            driver.quit(); 
        }
    }
