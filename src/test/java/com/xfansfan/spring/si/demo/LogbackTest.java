package com.xfansfan.spring.si.demo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring/si-config.xml"})
public class LogbackTest {
	private final static Logger logger = LoggerFactory.getLogger(LogbackTest.class);
	@Test
	public void test1() {
		System.out.println("First test!!!");
		logger.debug("Test Log 001...");
		logger.debug("Test Log 002...");
		logger.debug("Test Log 003...");
		logger.debug("Test Log 004...");
	}
}
