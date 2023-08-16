package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.Interface.Nakaa_Interface;

public class PaymentPage extends Base_class implements Nakaa_Interface {
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = cardnob)
	private WebDriver cardno;
	
	@FindBy(xpath = expdateb)
	private WebDriver expdate;
	
	@FindBy(xpath = expdatebb)
	private WebDriver cvvnum;
	
	@FindBy(xpath = proceedbtnbb)
	private WebDriver proceedbtn;
	
	@FindBy(xpath = securecardb)
	private WebDriver securecard;

	public WebDriver getCardno() {
		return cardno;
	}

	public WebDriver getExpdate() {
		return expdate;
	}

	public WebDriver getCvvnum() {
		return cvvnum;
	}

	public WebDriver getProceedbtn() {
		return proceedbtn;
	}

	public WebDriver getSecurecard() {
		return securecard;
	}
	
	
}
