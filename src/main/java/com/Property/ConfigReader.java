package com.Property;

public class ConfigReader {

	public static String browserLaunch = PropertyFileReader.getAPropertyFiles().getProperty("browserLaunch");
	public static String launchUrl = PropertyFileReader.getAPropertyFiles().getProperty("launchUrl");
	public static String Mobileno = PropertyFileReader.getAPropertyFiles().getProperty("Mobileno");
	public static String cardno = PropertyFileReader.getAPropertyFiles().getProperty("cardno");
	public static String expdate = PropertyFileReader.getAPropertyFiles().getProperty("expdate");
	public static String cvv = PropertyFileReader.getAPropertyFiles().getProperty("cvv");	
	//                   Key = classname.methodname.referencename(get)(Key);
	
	public static String getBrowserLaunch() {
		return browserLaunch;
	}
	public static String getLaunchUrl() {
		return launchUrl;
	}
	public static String getMobileno() {
		return Mobileno;
	}
	public static String getCardno() {
		return cardno;
	}
	public static String getExpdate() {
		return expdate;
	}
	public static String getCvv() {
		return cvv;
	}
	
}
