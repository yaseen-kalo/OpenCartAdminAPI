package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Reads config.properties
    static Properties prop;
    {
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
            FileInputStream fis;
            fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
