package com.qa.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\kumarp130\\eclipse-workspace\\MavenSampleProj\\src\\test\\resources\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://google.com");

	}

}
