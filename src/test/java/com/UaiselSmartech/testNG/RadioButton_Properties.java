package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RadioButton_Properties {
	public WebDriver driver;

	@Test
	public void f() {
		WebElement table = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> radio1 = table.findElements(By.name("group1"));
		System.out.println("Available Radio buttons: " + radio1.size());
		for (WebElement buttons : radio1) {

			if (buttons.getAttribute("value").equalsIgnoreCase("Milk")) {
				buttons.click();
			}
			System.out.println(buttons.getAttribute("value")+"----"+buttons.getAttribute("checked"));
		}
		List<WebElement> radio2 = table.findElements(By.name("group2"));
		System.out.println("Available Radio buttons: " + radio1.size());
		for (WebElement button : radio2) {
			System.out.println(button.getAttribute("value") + "----" + button.getAttribute("checked"));
		}

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}

}
