package com.Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {

	public static WebDriver driver;

	// Browser Launch Method

	public static void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			//					System.setProperty("webdriver.chrome.driver",
			//							"C:\\Users\\DELL\\eclipse-workspace\\dhivakar\\Selenium\\Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\dhivakar\\Project_class\\Gecko Browser\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}

	}

	// Close Method
	public static void close() {
		driver.close();
	}

	// Quit Method

	public static void quit() {
		driver.quit();
	}

	// Navigate To Method

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// Other Navigation Methods

	public static void navigate(String input) {

		if (input.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (input.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (input.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	// Get Method

	public static void getUrl(String url) {
		driver.get(url);
	}

	// Alert Methods

	public static void handlingAlert(String value) {

		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
		else if (value.equalsIgnoreCase("getText")) {
			System.out.println("Alert Text: " + driver.switchTo().alert().getText());
		}
	}

	// Alert Method to SendText

	public static void sendAlert(String Input) {
		driver.switchTo().alert().sendKeys(Input);
	}

	// Action Class Method Using WebElement

	public static void actionWebElement(WebElement Element, String input) {

		Actions acweb = new Actions(driver);

		if (input.equalsIgnoreCase("click WebElement")) {
			acweb.click(Element).build().perform();
		}
		else if (input.equalsIgnoreCase("ch WebElement")) {
			acweb.clickAndHold(Element).build().perform();
		}

		else if (input.equalsIgnoreCase("cc WebElement")) {
			acweb.contextClick(Element).build().perform();
		}
		else if (input.equalsIgnoreCase("doubleclick WebElement")) {
			acweb.doubleClick(Element).build().perform();
		}
		else if (input.equalsIgnoreCase("Move to Webelement")) {
			acweb.moveToElement(Element).build().perform();
		}
		else if (input.equalsIgnoreCase("Release on Webelement")) {
			acweb.release(Element).build().perform();
		}
	}

	// Action Class Method(Simple)

	public static void simpleAction(String input) {

		Actions as = new Actions(driver);

		if (input.equalsIgnoreCase("click")) {
			as.click().build().perform();
		}
		else if (input.equalsIgnoreCase("click and hold")) {
			as.clickAndHold().build().perform();
		}
		else if (input.equalsIgnoreCase("context click")) {
			as.contextClick().build().perform();
		}
		else if (input.equalsIgnoreCase("double click")) {
			as.doubleClick().build().perform();
		}
		else if (input.equalsIgnoreCase("Release")) {
			as.release().build().perform();
		}
	}

	// Action Class Drag and Drop

	public static void actionDragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target);
	}

	// Frame Methods

	public static void frameValue(String Value) {
		driver.switchTo().frame(Value);
	}

	public static void frameWebElement(WebElement Element) {
		driver.switchTo().frame(Element);
	}

	public static void frameIndex(int Position) {
		driver.switchTo().frame(Position);
	}

	public static void defaultWindow() {
		driver.switchTo().defaultContent();
	}

	// Robot Class Methods

	public static void robotClass(String input) throws Throwable {
		Robot r = new Robot();
		if (input.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
		}
		else if (input.equalsIgnoreCase("escape")) {
			r.keyPress(KeyEvent.VK_ESCAPE);
		}
		else if (input.equalsIgnoreCase("tab")) {
			r.keyPress(KeyEvent.VK_TAB);
		}
		else if (input.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
		}
		else if (input.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
		}
		else if (input.equalsIgnoreCase("pageup")) {
			r.keyPress(KeyEvent.VK_PAGE_UP);
		}
		else if (input.equalsIgnoreCase("pagedown")) {
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		}
		else if (input.equalsIgnoreCase("cancel")) {
			r.keyPress(KeyEvent.VK_CANCEL);
		}
		else if (input.equalsIgnoreCase("window")) {
			r.keyPress(KeyEvent.VK_WINDOWS);
		}
		else if (input.equalsIgnoreCase("printscreen")) {
			r.keyPress(KeyEvent.VK_PRINTSCREEN);
		}
	}

	public static void windowHande() {

	}

	// Drop Down Method

	public static void dropdown(WebElement element, String input, String data) {
		Select s = new Select(element);
		if (input.equalsIgnoreCase("Value")) {
			s.selectByValue(data);
		}
		else if (input.equalsIgnoreCase("text")) {
			s.selectByVisibleText(data);
		}
		else if (input.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(data);
			s.selectByIndex(parseInt);
		}

		// Get First Selected Option

		else if (input.equalsIgnoreCase("getfirstselectedoption")) {
			WebElement sop = s.getFirstSelectedOption();
			System.out.println("Text of Selected Option: " + sop.getText());
		}

		// getOptions
		else if (input.equalsIgnoreCase("getoptions")) {
			List<WebElement> op = s.getOptions();
			for (int i = 0; i < op.size(); i++) {
				String options = op.get(i).getText();
				System.out.println("GetOptions: " + options);
			}
		}

		// Is Multiple
		else if (input.equalsIgnoreCase("ismultiple")) {
			if (s.isMultiple()) {
				System.out.println("Multiple Selection Supported");
			} 
			else {
				System.out.println("Multiple Selection Not Supported");
			}
		}

		// Get All Selected Options

		else if (input.equalsIgnoreCase("getallselectedoptions")) {
			List<WebElement> op = s.getAllSelectedOptions();
			for (int i = 0; i < op.size(); i++) {
				String options = op.get(i).getText();
				System.out.println("All Selected Options: " + options);
			}
		}

		else if (input.equalsIgnoreCase("deselectall")) {
			s.deselectAll();
		}
	}

	// Method For is Enabled

	public static void isEnabled( WebElement element) {

		boolean enable = element.isEnabled();
		System.out.println("Boolean Value: " + enable);
	}	


	// Method For is Displayed

	public static void isDisplayed(WebElement element) {

		boolean display = element.isDisplayed();	
		System.out.println("Boolean Value: " + display);
	}

	// Method For is Selected

	public static void isSelected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println("Boolean Value: " + selected);
	}

	// get Title

	public static void getTitle() {
		System.out.println("Title : " + driver.getTitle());
	}

	// get Current URL

	public static void getCurrentUrl() {
		System.out.println("Current URL: " + driver.getCurrentUrl());
	}

	// get Text

	public static String getText(WebElement element) {

		String gettext = element.getText();
		System.out.println("Text of Element:" + gettext);
		return gettext;
	}

	// Wait Concept

	public static void implicitelywait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	//Explicit Wait	

	public static void visibilityOfWebelement(long time, WebElement Element) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(Element)).click();
	}

	//Screenshot Method

	public static void TakeScreenshot(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//				Date d = new Date();
		//				String filename = d.toString().replaceAll(":", "").replace(",", "") + ".png";
		File desc = new File("C:\\Users\\DELL\\eclipse-workspace\\dhivakar\\ProjectClass2\\ScreenShot\\" +filename + ".png");
		FileUtils.copyFile(src, desc);
	}

	//Scrolling up and down

	public static void scrolling( int a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + a + ")");
	}

	// SendKeys Method

	public static void sendKeys(WebElement element, String sendkeys) {

		element.sendKeys(sendkeys);
	}

	// Clicking WebElement

	public static void 	clickingWebElement(WebElement element) {

		element.click();
	}

}

