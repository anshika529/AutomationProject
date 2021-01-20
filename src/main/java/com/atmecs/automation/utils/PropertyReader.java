package com.atmecs.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static Properties properties;

	public static Properties readProperty(String xpath) {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(xpath));
		} catch (FileNotFoundException e) {
			System.out.println("File not found in the given location" + e.getMessage());

		} catch (IOException e) {
			System.out.println("Input Output Exception " + e.getMessage());

		}
		return properties;
	}
}
