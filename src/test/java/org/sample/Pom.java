package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom  extends BaseClass{
	public Pom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="pass")
	public WebElement passWord;
	
	@FindBy(xpath="//span[text()='Log in']")
	public WebElement logIn;

	public WebElement getEmail() {
		return email;		
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	
	

}
