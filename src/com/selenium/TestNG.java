package com.selenium;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utils.TestBrowser;

public class TestNG {
	private WebDriver driver;
	String URL = "http://www.calculator.net/";
	static final Logger logger = LogManager.getLogger(TestCalc.class.getName());

	@BeforeTest
	public void browser(String browser) {
		TestBrowser tbrowser = new TestBrowser();
		tbrowser.launchapp(browser);
	}

	@Test
	public void calcalate() {
		logger.info("navigate to calculator");
		// Launch website
		driver.navigate().to(URL);

		logger.info("set text = 5");
		ObjectCalc.scinm_five(driver).click();
		logger.info("click +");
		ObjectCalc.plus(driver).click();
		logger.info("set text = 4");
		ObjectCalc.scinm_four(driver).click();
		logger.info("click =");
		ObjectCalc.resultBtn(driver).click();
		logger.info("get result");
		String result = ObjectCalc.result(driver).getText();
		logger.info("ajust result");
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
