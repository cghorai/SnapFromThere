package com.cg.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

    private String propertyFileName;

    public PropertyUtil(String propertyFileName){
        this.propertyFileName = propertyFileName;
    }

    public String getValue(String key) throws IOException {
        String root = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String propertyFile = root + propertyFileName ;

        Properties properties = new Properties();
        properties.load(new FileInputStream(propertyFile));

        return properties.getProperty(key);
    }
}
