package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.Interface.Nakaa_Interface;

public class Logout extends Base_class implements Nakaa_Interface {

	public Logout() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =closeb)
	private WebElement close;
	
	public WebElement getClose() {
		return close;
	}
	
}
