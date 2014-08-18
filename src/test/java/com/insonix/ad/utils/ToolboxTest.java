package com.insonix.ad.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolboxTest {
	public static final Logger logger = LoggerFactory.getLogger(ToolboxTest.class);
	
    @Test
    public void testGenerateNumber() {
        for(int i=0;i<10;i++) {
        	try {
        		logger.info("Number : " + Toolbox.generateNumber(3));
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
        }
    }
}
