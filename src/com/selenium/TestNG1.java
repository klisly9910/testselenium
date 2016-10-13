package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG1 {
	private WebDriver driver;
	private String URL = "http://www.calculator.net";

	@Parameters("browser")
	@BeforeTest
	public void launchapp(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println(" Executing on FireFox");
			System.setProperty("webdriver.firefox.marionette",
					"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("iexplore")) {
			System.out.println("Executing on IE");
			System.setProperty("webdriver.ie.driver",
					"C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}

	@Test
	public void calcalate() {
		ObjectCalc.scinm_five(driver).click();
		ObjectCalc.plus(driver).click();
		ObjectCalc.scinm_four(driver).click();
		ObjectCalc.resultBtn(driver).click();
		String result = ObjectCalc.result(driver).getText();
		if (result.equals("9.")) {
			System.out.println("result :" + result);
			System.out.println(" The Result is pass");
		} else {
			System.out.println("result :" + result);
			System.out.println(" The Result is Fail");
		}
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
