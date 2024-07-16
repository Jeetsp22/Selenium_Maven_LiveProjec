package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Mouse_keyboard_operations {
	public WebDriver driver;
	public Actions a;
	@Test(enabled=false)
	public void draganddrop() {
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		//a.dragAndDrop(drag, drop).build().perform();
		a.clickAndHold(drag).moveToElement(drop).build().perform();
	}
	@Test(enabled=false)
	public void resizeObject() {
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/div[position()=3]"));
		//a.dragAndDropBy(drag, 200, 500).perform();
		a.clickAndHold(drag).moveByOffset(200, 300);
	}
	@Test(enabled=false)
	public void rightclick() {
		WebElement element = driver.findElement(By.linkText("Sortable"));
		a.contextClick(element).perform();
	}
	@Test
	public void slider() {
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='slider']/span"));
		a.clickAndHold(drag).moveByOffset(200, 0).release().build().perform();
	}

	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		a=new Actions(driver);
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	}

}
