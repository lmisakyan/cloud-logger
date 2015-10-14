package com.cloudlogger.infrastructure.config;

import java.io.IOException;
import java.util.Properties;

/**
 * Properties helper
 * 
 * @author Leon Misakyan
 *
 */
public class Config {
	private static final Properties properties = new Properties();

	public static String getProperty(String name) throws IOException {
		if (properties.isEmpty())
			properties.load(Config.class.getClassLoader().getResourceAsStream("config.properties"));
		return properties.getProperty(name);
	}

}
