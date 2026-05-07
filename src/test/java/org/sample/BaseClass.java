package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void webBrosAndUrl(String url) {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}

}
