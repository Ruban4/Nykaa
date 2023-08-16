package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.Interface.Nakaa_Interface;

public class AddressPage extends Base_class implements Nakaa_Interface {
	
		public AddressPage() {
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath=deliverbtnb)
	private WebElement deliverbtn;

	public WebElement getDeliverbtn() {
		return deliverbtn;
	}
	
	
	
}
