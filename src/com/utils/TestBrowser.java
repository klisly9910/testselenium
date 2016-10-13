package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBrowser {
	private WebDriver driver;
	private String URL;

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
			System.out.println("Executing on IE");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files (x86)\\Google\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("ie")) {
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

}
