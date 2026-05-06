package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void webBrosAndUrl(String url) {
		WebDriver d = new ChromeDriver();
        d.get(url);
	}

}
