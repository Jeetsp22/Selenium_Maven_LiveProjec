package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PrinLinks {
	public WebDriver driver;

	@Test
	public void f() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Available links: " + links.size());
		int count = 0;
		for (WebElement Link : links) {
			if (!Link.getText().isEmpty())
				System.out.println(Link.getText());
			count++;
		}

		System.out.println(count);
	}
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
