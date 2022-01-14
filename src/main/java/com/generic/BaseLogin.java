package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	
	public void getLogin() {
		//open a browser ==> Application
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");//Driver path
		WebDriver driver = new ChromeDriver();//Yes ==> up casting
		driver.get("http://automationpractice.com/index.php");//
		driver.manage().window().maximize();
	}

}
