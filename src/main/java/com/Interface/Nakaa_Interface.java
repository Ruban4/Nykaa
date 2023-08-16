package com.Interface;

public interface Nakaa_Interface {

	//login
	String signinb = "//button[text()='Sign in']";
	String emailb = "//button[text()='Sign in with Mobile / Email']";
	String mobileb = "//input[@name='emailMobile']";
	String submitb = "submitVerification";
	String verifyb = "//button[@type='submit']";
	
	//productSearch
	String mombabyb = "//a[text()='mom & baby']";
	String powderbtnb = "//a[text()='Baby Powder']";
	String powderb = "//div[text()='Himalaya Baby Powder']";
	
	//addToCart
	String dropdownb = "select.css-2t5nwu";
	String addtobagb = "(//span[text()='Add to Bag'][1])";
	
	//BagFrame
	String bagb = "//button[@class='css-aesrxy']";
	String frameb = "//iframe[@class='css-acpm4k']";
	String quantb = "//p[text()='Quantity : 1']";
	String quannosb = "(//div[@value='3'])[1]";
	String proceedbtnb = "//span[text()='Proceed']";
	
	//addressPage
	String deliverbtnb = "//button[text()='Deliver here']";
	
	//paymentPage
	String cardnob = "//input[@placeholder='Card Number']";
	String expdateb = "//input[@placeholder='Expiry (MM/YY)']";
	String expdatebb = "//input[@placeholder='CVV']";
	String proceedbtnbb = "//button[@class='css-v61n2j e8tshxd0']";
	String securecardb = "//button[text()='Pay without securing card']";

	//logout
	String closeb ="button.css-1iwzqhf.emgaj5l0";
	
}
