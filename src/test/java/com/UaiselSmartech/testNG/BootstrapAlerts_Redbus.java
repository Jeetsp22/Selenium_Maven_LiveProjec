package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BootstrapAlerts_Redbus {
	public WebDriver driver;
	@Test
	public void sample() {
		System.out.println(System.getProperty("user.dir"));
	}

	@Test
	public void f() throws Exception {
		driver.findElement(By.xpath("(//span[@class='name_rb_secondary_item'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='header_dropdown_item_name'])[5]")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='social FC DIB']//div[@id='redbusImage']")).click();

		Set<String> windows = driver.getWindowHandles();
		Object[] s = windows.toArray();
		driver.switchTo().window(s[1].toString());
		driver.findElement(By.id("email")).sendKeys("satya");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}

}
