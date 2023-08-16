package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.Interface.Nakaa_Interface;

public class AddToCart extends Base_class implements  Nakaa_Interface{

	public AddToCart() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = dropdownb)
	private WebElement dropdown;

	@FindBy(xpath = addtobagb)
	private WebElement addtobag;

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getAddtobag() {
		return addtobag;
	}
	
	
}
