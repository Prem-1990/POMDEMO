package com.atipune.pom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static  void initDriver()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\ POMDEMO\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 }
 
}
