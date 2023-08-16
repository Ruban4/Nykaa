package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.pom.Login_page;

import io.cucumber.java.en.*;


public class Step_Defination extends Base_class {


//	public Step_Defination() {
//		PageFactory.initElements(driver, this);
//	}

	@Given("Launch the browser {string}")
	public void launch_the_browser(String string) {
		browserLaunch(string);
		
		
	}

	

	
	@When("Launch url {string}")
	public void launch_url(String string) {
		 getUrl("https://www.limeroad.com/");
	}
	
	@When("User clicks shops men")
	public void user_clicks_shops_men() {
	Login_page ln = new Login_page();
	ln.getShopmen().click();
driver.findElement(By.xpath("//div[text()='Home']")).click();
	}

	@Then("close the browser")
	public void close_the_browser() {
 //close();
	}
	
	
	
}
