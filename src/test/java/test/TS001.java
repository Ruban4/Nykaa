package test;

import org.testng.annotations.Test;

import com.Base.Base_class;

public class TS001 extends Base_class {

	@Test (priority = 1)
	private void Setup() {
		browserLaunch("Chrome");	
	}
	@Test (priority = 2)
	private void aurl() {
		getUrl("https://www.amazon.in/");
		
	}
}
