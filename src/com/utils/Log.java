package com.utils;

import java.util.Date;

import org.apache.log4j.Logger;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.javascript.host.intl.DateTimeFormat;

public class Log {

	private Logger logger;

	private DateTimeFormat df;

	public Log(Class<?> clazz) {
		logger = Logger.getLogger(clazz);
		df = new DateTimeFormat();
	}

	public Log(String s) {
		logger = Logger.getLogger(s);
		df = new DateTimeFormat();
	}

	public Log() {
		logger = Logger.getLogger("");
		df = new DateTimeFormat();
	}

	public void info(Object message) {
		logger.info(message);
//		this.testngLogOutput(message);
	}

	public void error(Object message) {
		logger.error(message);
		this.testngLogOutput(message);
	}

	public void warn(Object message) {
		logger.warn(message);
		this.testngLogOutput(message);
	}

	public void debug(Object message) {
		logger.debug(message);
		this.testngLogOutput(message);
	}

	private void testngLogOutput(Object message) {
		Reporter.log(df.format(new Date()) + ":" + message);
	}

}