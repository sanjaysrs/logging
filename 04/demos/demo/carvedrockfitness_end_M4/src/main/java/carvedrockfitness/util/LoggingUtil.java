package carvedrockfitness.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

public class LoggingUtil {
    public static void initLogManager() {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("src/main/resources/logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}