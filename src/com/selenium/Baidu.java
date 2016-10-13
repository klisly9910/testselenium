package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baidu {

	public static void main(String[] args) {
		System.out.println("start selenium");
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://baidu.com");
		System.out.println("title:" + driver.getTitle());
		WebElement textbox = driver.findElement(By.id("kw"));
		textbox.sendKeys("selenium java");
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		driver.close();
		System.out.println("end selenium");

	}

}
