package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLinks {

	public static void main(String[] args) {

		System.out.println("start selenium");
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://baidu.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links in the Page is " + links.size());

		for (int i = 1; i <= links.size() - 1; i = i + 1) {
			System.out.println("Name of Link# " + i + "  "
					+ links.get(i).getText());
		}

		driver.close();
		System.out.println("end selenium");

	}

}
