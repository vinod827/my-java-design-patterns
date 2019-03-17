package com.vinod.gof.singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Hello Design Pattern - Singleton");
    }
}
