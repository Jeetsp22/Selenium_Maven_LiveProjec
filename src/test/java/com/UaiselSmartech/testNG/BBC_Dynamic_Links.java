package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BBC_Dynamic_Links {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		WebElement table = driver.findElement(By.xpath("(//div[@class='sc-f98732b0-5 hTfOGf'])[2]"));
		List<WebElement> links = table.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());
			link.click();
			Thread.sleep(5000);
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			 Thread.sleep(5000);
			// driver.findElement(By.xpath("(//div[@class='sc-f98732b0-5 hTfOGf'])[2]"));
			driver.findElement(By.xpath("//button[text()='Maybe later']")).click();     
			table = driver.findElement(By.xpath("(//div[@class='sc-f98732b0-5 hTfOGf'])[2]")); //because of stale element// for every iteration
			links = table.findElements(By.tagName("a"));

		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		driver.manage().window().maximize();
	}

}
