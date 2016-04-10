package com.bss.learning.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class testproject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		
		//2. Enter the url http://www.google.com
		driver.get("http://www.google.com");
		
		String expected = "Google";
		
		String actual = driver.getTitle();
		
		if(actual.equals(expected))
		{
			System.out.println("TC_001 is passed");
		}
		else
		{
			System.out.println("TC_001 is failed");
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl" + currentUrl);
		
		String PageSource = driver.getPageSource();
		//System.out.println("ps" + pageSource);
		
		//close the browser
		driver.close();

	}

}
