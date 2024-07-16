package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CheckBox_PropertyValus {
	public WebDriver driver;

	@Test
	public void f() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for (WebElement value : checkboxes) {
			System.out.println(value.getAttribute("value") + "                " + value.getAttribute("checked"));
           if(!value.isSelected())
           {
        	   value.click();
           }
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}

}
