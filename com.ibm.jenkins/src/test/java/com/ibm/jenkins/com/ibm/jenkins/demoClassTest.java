package com.ibm.jenkins.com.ibm.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class demoClassTest {

	public WebDriver driver;
	
	@Test
	public void demoTest() {
			String baseUrl = "http://ec2-13-233-153-88.ap-south-1.compute.amazonaws.com:8080/web/";
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\New folder\\Selenium Jar Files\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://ec2-13-233-153-88.ap-south-1.compute.amazonaws.com:8080/web/");
			driver.get(baseUrl);	  
			String expected = "Bank Application";
			String actual = driver.getTitle();
			Assert.assertEquals(expected, actual);
	}
}
