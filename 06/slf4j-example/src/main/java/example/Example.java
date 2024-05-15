package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {
    final static Logger LOGGER = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        LOGGER.info("This is a logging message with level info.");
        LOGGER.error("This is a logging message with level error.");

    }
}
