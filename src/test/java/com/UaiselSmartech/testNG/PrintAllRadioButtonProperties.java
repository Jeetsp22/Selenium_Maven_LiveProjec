package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PrintAllRadioButtonProperties {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		WebElement table = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		for (int k = 1; k < 3; k++) {
			List<WebElement> radio = table.findElements(By.name("group" + k));
			for (WebElement button : radio) {
				button.click();
				for (WebElement btn : radio) {
					System.out.println(btn.getAttribute("value") + "----" + btn.getAttribute("checked"));
					Thread.sleep(2000);
				}
			}
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}

}
