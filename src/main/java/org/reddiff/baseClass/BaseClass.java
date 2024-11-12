package org.reddiff.baseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	

		public static WebDriver driver;

		public static WebDriver browserLaunch(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		}else if(browser.equalsIgnoreCase("firefox")) {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		}else if(browser.equalsIgnoreCase("edge")) {

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();

		}else if(browser.equalsIgnoreCase("iedriver")) {

		WebDriverManager.iedriver().setup();

		driver = new InternetExplorerDriver();

		}else if(browser.equalsIgnoreCase("safari")) {

		WebDriverManager.safaridriver().setup();

		driver = new SafariDriver();

		}

		driver.manage().window().maximize();

		return driver;

		}

		public static void clickOnElement(WebElement element) {

		element.click();

		}

		public static void sendTheValue(WebElement element,String value) {

		element.sendKeys(value);

		}

		public static void driverClose() {

		driver.close();

		}

		public static void driverQuit() {

		driver.quit();

		}

		public static void implicitWait(int seconds) {

		driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);

		}

		public static void getUrl(String url) {

		driver.get(url);

		}

		public static void forEachLoopUsingSelectTheDropDown(List<WebElement> element,String value) {

		for(WebElement allOptions : element) {

		if(allOptions.getText().equals(value)) {

		allOptions.click();

		break;

		}

		}

		}

		public static void handleTheSimpleAlert() {

		driver.switchTo().alert().accept();

		}

		public static void handleTheConfirmAlert() {

		driver.switchTo().alert().dismiss();

		}

		public static void handleThePromptAlert(String value) {

		driver.switchTo().alert().sendKeys(value);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		}

		public static void maximize() {

		driver.manage().window().maximize();

		}

		public static void handleTheWindow(int index) {

		Set<String> allWindows = driver.getWindowHandles();

		List<String> list = new ArrayList(allWindows);

		driver.switchTo().window(list.get(index));

		}

		public static void javaScriptExecutorUsingScrollDown(int xaxis,int yaxis) {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy("+xaxis+","+yaxis+");");

		}

		public static void javaScriptExecutorUsingScrollUp(int xaxis,int yaxis) {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy("+xaxis+",-"+yaxis+");");

		}

		public static void javaScriptExecutorUsingScrollIntoView(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();",element);

		}

		public static void javaScriptExecutorUsingScrollToWebPageEnd() {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");

		}

		public static void javaScriptExecutorUsingScrollToWebPageTop() {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");

		}

		public static void javaScriptExecutorUsingSendTheValueToWebPage(String value,WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='"+value+"'",element);

		}

		public static void javaScriptExecutorUsingClickOnElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].click();",element);

		}

		public static void javaScriptExecutorUsingRefresh() {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("history.go(0);");

		}

		public static void wait(int seconds) {

		try {

		Thread.sleep(seconds);

		}

		catch(InterruptedException e) {

		System.out.println("Throw the IOException");

		}

		}

		public static void navigateBack() {

		driver.navigate().back();

		}

		public static void navigateForward() {

		driver.navigate().forward();

		}

		public static void navigateRefresh() {

		driver.navigate().refresh();

		}

		public static void navigateToUrl(String value) {

		driver.navigate().to(value);

		}
}
