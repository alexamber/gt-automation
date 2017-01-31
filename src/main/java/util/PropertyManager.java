package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Created by AMBER on 14.01.2017.
 */
public class PropertyManager {
    public static void mergeProperties(final String propertyFile) {
        Properties newProps = new Properties();
        Properties propFromFile = new Properties();
        try {
            propFromFile.load(Files.newBufferedReader(Paths.get(propertyFile)));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read properties {}" + propertyFile, e);
        }
        newProps.putAll(propFromFile);
        newProps.putAll(System.getProperties());
        System.setProperties(newProps);
    }

}
