package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JqueryDropdown {
	public WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.xpath("//button[@title='None selected']")).click();
		WebElement table = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
		List<WebElement> ddvalues = table.findElements(By.tagName("input"));

		int size = ddvalues.size();
		System.out.println(size);
		for (WebElement x : ddvalues) {
			System.out.println(x.getAttribute("value"));
			if(x.getAttribute("value").equalsIgnoreCase("HTML"))

			

				x.click();
			}
		

	/*for(

	WebElement x:ddvalues)
	{

		if (x.getText().equalsIgnoreCase("HTML")) {
			System.out.println(x.getText());

			x.click();
		}
	}
		Random r = new Random();
		int num=r.nextInt(4);
		System.out.println(num);  //0 to 4 random number will be generated
		ddvalues.get(num).click();*/
		//ddvalues.get(0).click();

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		driver.manage().window().maximize();
	}

}
