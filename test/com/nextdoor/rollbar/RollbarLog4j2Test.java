package com.nextdoor.rollbar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nextdoor.rollbar.RollbarBuilder;

public class RollbarLog4j2Test {
    
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        
        System.out.println("TEST");
        
        RollbarBuilder.init("test-java");
        
        logger.debug("This will be printed on debug");
        logger.info("This will be printed on info");
        logger.warn("This will be printed on warn");
        logger.error("This will be printed on error");
        //logger.fatal("This will be printed on fatal");
        
        try {
            throw new NullPointerException("Custom Error");
        } catch (Exception e) {
            logger.error("Rollbar Test Error", e);
        }
    }
}
