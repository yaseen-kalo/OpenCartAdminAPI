package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Reads config.properties
    Properties prop;
    String filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
    {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(filePath);
            prop.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}
