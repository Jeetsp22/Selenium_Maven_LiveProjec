package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Facebook_Dropdown {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		new Select(driver.findElement(By.xpath("//select[@id='day']"))).selectByIndex(5);

		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("//select[@id='month']"))).selectByValue("7");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("//select[@id='year']"))).selectByValue("2023");
		/*WebElement ddmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthdd = new Select(ddmonth);
		monthdd.selectByIndex(5);
		Thread.sleep(5000);
		monthdd.selectByValue("7");
		Thread.sleep(5000);
		monthdd.selectByVisibleText("Oct");*/

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
