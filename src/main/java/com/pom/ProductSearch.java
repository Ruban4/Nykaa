package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.Interface.Nakaa_Interface;

public class ProductSearch extends Base_class implements Nakaa_Interface{

	public ProductSearch() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = mombabyb)
	private WebElement mombaby;
	
	@FindBy(xpath = powderbtnb)
	private WebElement powderbtn;
	
	@FindBy(xpath = powderbtnb)
	private WebElement powder;

	public WebElement getMombaby() {
		return mombaby;
	}

	public WebElement getPowderbtn() {
		return powderbtn;
	}

	public WebElement getPowder() {
		return powder;
	}
}
