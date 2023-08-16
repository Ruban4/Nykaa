package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;

public class LLogin_page extends Base_class{
		
		
	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement shopmen;
	
	public WebElement getShopmen() {
		return shopmen;
		
	}
	public LLogin_page () {
		PageFactory.initElements(driver, this);
	}
	
}
