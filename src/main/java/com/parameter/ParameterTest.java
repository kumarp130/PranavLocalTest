package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	//@Test
	@Parameters({"userName","url"})
	public void loginYahooTest(String userName,String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumarp130\\eclipse-workspace\\MavenSampleProj\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get(url);
		
		//driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("pranav.sch2@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys(userName);
		
		driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
	}

}
