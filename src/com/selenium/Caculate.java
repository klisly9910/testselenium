package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Caculate {

	public static void main(String[] args) {
		System.out.println("start selenium");
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch website
		driver.navigate().to("http://www.calculator.net/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click on Math Calculators "7"
		driver.findElement(
				By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[1]"))
				.click();

		// Click on Math Calculators "+"
		driver.findElement(
				By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]"))
				.click();

		// Click on Percent Calculators "8"
		driver.findElement(
				By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]"))
				.click();

		// Click on Percent Calculators "="
		driver.findElement(
				By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]"))
				.click();

		// Get the Result Text based on its xpath
		String result = driver.findElement(
				By.xpath(".//*[@id='sciOutPut']")).getText();

		// Print a Log In message to the screen
		System.out.println(" The Result is " + result);

		// Close the Browser.
		driver.close();
		System.out.println("end selenium");

	}

}
