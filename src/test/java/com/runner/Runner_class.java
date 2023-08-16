package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ruban\\Selinium\\Limeroad\\src\\test\\java\\com\\feature\\Lime.feature",
glue= "com.step", monochrome = true)


public class Runner_class extends Base_class {
	

	
	
	
}
