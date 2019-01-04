package com.ibm.jenkins.com.ibm.jenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class launchApplication {
	
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Application Launched");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\New folder\\Selenium Jar Files\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://ec2-13-233-153-88.ap-south-1.compute.amazonaws.com:8080/web/");
	  String s = driver.getTitle();
	  
	  String expected = "Bank Application";
	  
	  assertEquals(s,expected);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
