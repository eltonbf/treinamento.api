package br.com.etech.commons;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesManager {

    public static String getPropertiesValue(String key){
        Properties prop = new Properties();
        File file = new File("src/main/java/br/com/etech/properties");

        try {
            prop.load(new FileInputStream(file.getAbsoluteFile()+"/application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
