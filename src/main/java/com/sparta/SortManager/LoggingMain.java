package com.sparta.SortManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingMain {
    public static Logger logger = LogManager.getLogger("My Logger");
    public static void main(String[] args) {
//        trace debug info warn error fatal
        logger.info("This is an info message");
    }

}