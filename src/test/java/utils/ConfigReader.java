package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	   private static final Properties prop = new Properties();

	    static {
	        try (InputStream input = ConfigReader.class.getClassLoader()
	                .getResourceAsStream("config.properties")) {
	            if (input == null) {
	                throw new RuntimeException("Arquivo config.properties não encontrado no classpath.");
	            }
	            prop.load(input);
	        } catch (IOException e) {
	            throw new RuntimeException("Erro ao carregar config.properties", e);
	        }
	    }

	    public static String get(String key) {
	        return prop.getProperty(key);
	    }

}
