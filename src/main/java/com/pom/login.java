package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.Interface.Nakaa_Interface;

public class login extends Base_class implements Nakaa_Interface {
	
	public login() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = signinb)
	private WebElement signin;
	
	@FindBy(xpath= emailb)
	private WebElement email;
	
	
	@FindBy(xpath= mobileb)
	private WebElement mobile;
	
	@FindBy(id=submitb)
	private WebElement submit;
	
	@FindBy(xpath=verifyb)
	private WebElement verify;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getVerify() {
		return verify;
	}

		
}
