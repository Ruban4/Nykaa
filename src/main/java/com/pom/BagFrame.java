package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.Interface.Nakaa_Interface;

public class BagFrame extends Base_class implements Nakaa_Interface {

	public BagFrame() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath= bagb)
	private WebElement bag;
	
	@FindBy(xpath= frameb)
	private WebElement frame;
	
	@FindBy(xpath= quantb)
	private WebElement quant;
	
	@FindBy(xpath = quannosb)
	private WebElement quannos;
	
	@FindBy(xpath= proceedbtnb)
	private WebElement proceedbtn;

	public WebElement getBag() {
		return bag;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQuant() {
		return quant;
	}

	public WebElement getQuannos() {
		return quannos;
	}

	public WebElement getProceedbtn() {
		return proceedbtn;
	}
	
}
