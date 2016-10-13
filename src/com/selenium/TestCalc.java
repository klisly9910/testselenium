package com.selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCalc {
	static final Logger logger = LogManager.getLogger(TestCalc.class.getName());

	public static void main(String[] args) {
		DOMConfigurator
				.configure("D:\\Users\\xiaohua\\workspace\\TestSele\\src\\log4j.xml");
		logger.info("# # # # # # # # # # # # # # # # #");
		logger.info("TEST Has Started");
		logger.info("start selenium");

		System.out.println("start selenium");
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		logger.info("sleep 10s");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		logger.info("navigate to calculator");
		// Launch website
		driver.navigate().to("http://www.calculator.net/");

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
		logger.info("close firefox");
		driver.close();
		logger.info("# # # # # # # # # # # # # # # # #");
		System.out.println("end selenium");

	}

}
