package com.doit.properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class testProperties {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/git/javase24/src/com/doit/properties/job.properties"), "utf-8"));
		properties.load(br);


		String property = properties.getProperty("MAPPER");
		System.out.println(property);
		br.close();
	}

}
