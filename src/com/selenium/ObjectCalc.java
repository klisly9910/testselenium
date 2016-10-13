package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectCalc {
	private static WebElement element = null;
	
	public static WebElement scinm_zero(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]"));
		return element;
		
	}
	public static WebElement scinm_one(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[1]"));
		return element;
		
	}
	public static WebElement scinm_two(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
		return element;
		
	}
	public static WebElement scinm_three(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]"));
		return element;
		
	}
	public static WebElement scinm_four(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]"));
		return element;
		
	}
	public static WebElement scinm_five(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]"));
		return element;
		
	}
	public static WebElement scinm_six(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[3]"));
		return element;
		
	}
	public static WebElement scinm_seven(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[1]"));
		return element;
		
	}
	public static WebElement scinm_eight(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
		return element;
		
	}
	public static WebElement scinm_night(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[3]"));
		return element;
		
	}
	public static WebElement plus(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]"));
		return element;
		
	}
	public static WebElement resultBtn(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
		return element;
		
	}
	public static WebElement result(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sciOutPut']"));
		return element;
		
	}
	

}
