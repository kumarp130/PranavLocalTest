package com.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	//@Test
	@Parameters({"browser"})
	public void launchBrowserTest(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.out.println("Launch chrome");
		}
		else if(browser.equals("IE"))
		{
			System.out.println("Launch IE");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch Firefox");
		}
		else
		{
			System.out.println("Currently we are not supporting "+browser);
		}
	}

}
