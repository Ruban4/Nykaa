	package com.Property;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	
	public class PropertyFileReader {
		
		public static FileInputStream fis;
		public static Properties getAPropertyFiles() // need to give try catch 
		
		{
		File file = new File("C:\\Users\\Ruban\\Selinium\\Limeroad\\src\\main\\java\\com\\Property\\Nykaa.properties");
		
	try {
		fis= new FileInputStream(file);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	 Properties property = new Properties();
	try
	{
		property.load(fis);
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	return property;
	}  
		
	}
	